package Dungeon;

import MonsterClassPackage.MonsterClass;


import java.util.Scanner;

public class Dungeon implements IDungeon {
    private MonsterClass[] monstersParty;
    private Party party;

    private boolean isOpened = false;

    public Dungeon(Party party, MonsterClass... monster) {
        monstersParty = new MonsterClass[monster.length];
        for (int i = 0; i < monstersParty.length; i++) {
            monstersParty[i] = monster[i];
        }
        this.party = party;
    }

    public MonsterClass[] getMonstersParty() {
        return monstersParty;
    }

    public void setMonstersParty(MonsterClass[] monstersParty) {
        this.monstersParty = monstersParty;
    }

    @Override
    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Вам нужно больше союзников!");
            isOpened = false;
        } else {
            System.out.println("Добро пожаловать, герои ! \n Да пребудет с вами сила !");
            isOpened = true;
        }
        return isOpened;
    }


    @Override
    public void infoDungeon() {
        for (MonsterClass m : monstersParty) {
            System.out.println("<" + m.getName() + ">" + "\nУровень: " + m.getLevel() + " \nHP:  " + m.getHealth() + " \nАтака: " + m.getAttackAmount());
        }
    }

    private void partyAttack() {
        Scanner scanner = new Scanner(System.in);
        int monster;
        for (int i = 0; i < party.getPartyMembers().length; i++) {
            if (health()[0] <= 0) {
                return;
            }
            if (!party.getPartyMembers()[i].isDeath()) {
                String str = "";
                for (int j = 0; j < monstersParty.length; j++) {
                    if (!monstersParty[j].isDead()) {
                        str = str.concat(monstersParty[j].getName() + " - " + j + ". ");
                    }
                }
                System.out.print("Выбирите цель атаки для " + party.getPartyMembers()[i].getName() + " : " + str + " : ");
                monster = Integer.parseInt(scanner.nextLine());
                if (monster > -1 && monster < monstersParty.length) {
                    party.getPartyMembers()[i].attack(monstersParty, monster);
                } else {
                    System.out.println("Выберите число от 0 до " + (monstersParty.length - 1));
                    i--;
                }
            }
        }
    }

    private void monsterAttack() {
        for (int i = 0; i < monstersParty.length; i++) {
            if (health()[1] <= 0) {
                return;
            }
            if (!monstersParty[i].isDead()) {
                int character = (int) (Math.random() * party.getPartyMembers().length);
                monstersParty[i].attackMonster(party.getPartyMembers(), character);
                System.out.println("Атакует : " + monstersParty[i].getName() + " -> Персонажа : " + party.getPartyMembers()[character].getName()
                        + " Здоровье : " + party.getPartyMembers()[character].getHealth());
            }
        }
    }

    private int[] health() {
        int[] health = {0, 0};
        for (int i = 0; i < monstersParty.length; i++) {
            health[0] += monstersParty[i].getHealth();
        }
        for (int j = 0; j < party.getPartyMembers().length; j++) {
            health[1] += party.getPartyMembers()[j].getHealth();
        }
        return health;
    }

    public void fightDungeon(Dungeon dungeon, Party party) {
        while (health()[0] > 0 && health()[1] > 0) {
            dungeon.partyAttack();
            dungeon.monsterAttack();
        }
        if (health()[0] > health()[1]) {
            System.out.println("Вы проиграли");
        } else {
            for (int i = 0; i< party.getPartyMembers().length; i++){
                party.getPartyMembers()[i].levelUp();
                System.out.println("Ваши персонаж " + party.getPartyMembers()[i].getName() + " получили уровень + 1");
            }
            System.out.println("Вы успешно прошли подземелье !!!");
        }
    }
}
