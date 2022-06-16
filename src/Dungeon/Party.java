package Dungeon;

import CharacterClassPackage.CharacterClass;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeon dungeon;

    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        this.partyMembers = partyMembers;
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];
        }
    }


    private boolean enterDungeon(Dungeon dungeon) {
        return dungeon.open(this);
    }

    public void runDungeon(Party party, Dungeon dungeon) {
        if (party.enterDungeon(dungeon)) {
            party.setDungeon(dungeon);
            System.out.println("Успешно вошли в подъземелье");
        } else {
            System.out.println("Вы не можете войти в подъземелье");
        }
    }

    public void infoParty() {
        for (CharacterClass partyMembers : partyMembers) {
            partyMembers.chInfo();
        }
    }
}
