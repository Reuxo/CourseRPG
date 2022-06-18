package Dungeon;

import MonsterClassPackage.MonsterClass;

public class Dungeon implements IDungeon {
    private MonsterClass[] monstersParty;

    private boolean isOpened = false;

    public Dungeon(MonsterClass... monster ) {
        monstersParty = new MonsterClass[monster.length];
        for (int i = 0; i< monstersParty.length; i++) {
            monstersParty[i] = monster[i];
        }
    }

    public MonsterClass[] getMonstersParty() {
        return monstersParty;
    }

    public void setMonstersParty(MonsterClass[] monstersParty) {
        this.monstersParty = monstersParty;
    }

    @Override
    public boolean open(Party party) {
       if(party.getPartyMembers().length < 3) {
           System.out.println("Вам нужно больше союзников!");
           isOpened = false;
       }
       else {
           System.out.println("Добро пожаловать, герои ! \n Да пребудет с вами сила !");
           isOpened = true;
       }
       return isOpened;
    }

    @Override
    public void infoDungeon() {
        for (MonsterClass m : monstersParty ) {
            System.out.println("<" + m.getName()+ ">" + "\nУровень: " + m.getLevel() + " \nHP:  " + m.getHealth() + " \nАтака: " + m.getAttackAmount());
        }
    }
}
