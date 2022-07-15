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

    public void partyAttack() {
        Scanner scanner = new Scanner(System.in);
        int monster;
        for (int i = 0; i < party.getPartyMembers().length; i++) {
            System.out.print("Выбирите цель атаки для " + party.getPartyMembers()[i].getName() + " : ");
            monster = Integer.parseInt(scanner.nextLine());
            if (monster > -1 && monster < monstersParty.length) {
                party.getPartyMembers()[i].attack(monstersParty, monster);
            } else {
                System.out.println("Выберите число от 0 до " + (monstersParty.length - 1));
                i--;
            }
        }
    }

    public void monsterAttack() {
        for (int i = 0; i < monstersParty.length; i++) {
            int character = (int) (Math.random() * party.getPartyMembers().length);
            monstersParty[i].attackMonster(party.getPartyMembers(), character);
            System.out.println("Атакует : " + monstersParty[i].getName() + " -> Персонажа : " + party.getPartyMembers()[character].getName()
                    + " Здоровье : " + party.getPartyMembers()[character].getHealth());
        }
    }


}
