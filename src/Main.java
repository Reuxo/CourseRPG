import CharacterClassPackage.Character.FrostMage;
import CharacterClassPackage.Character.Hunter;
import CharacterClassPackage.Character.Priest;
import CharacterClassPackage.Character.Warrior;
import Dungeon.Dungeon;
import Dungeon.Party;
import MonsterClassPackage.Monster.DarkElf;
import MonsterClassPackage.Monster.Orc;
import MonsterClassPackage.Monster.Troll;
import MonsterClassPackage.MonsterClass;

public class Main {

    public static void main(String[] args) {
        Party party = new Party(new Warrior("Воин"), new Priest("Жрец"),
                new FrostMage("Маг льда"), new Hunter("Охотник"));
        MonsterClass[] monsterParty = {new Orc("Орк"), new DarkElf("Темный Эльф"), new Troll("Троль")};
        Dungeon dark_forest = new Dungeon(party, monsterParty);


        // party.infoParty();

       // dark_forest.infoDungeon();
       //  party.runDungeon(party, dark_forest);
        // dark_forest.partyAttack();
       // dark_forest.monsterAttack();
        dark_forest.fightDungeon(dark_forest, party);

    }
}
