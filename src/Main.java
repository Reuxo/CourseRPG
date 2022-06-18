import CharacterClassPackage.Character.FrostMage;
import CharacterClassPackage.Character.Hunter;
import CharacterClassPackage.Character.Priest;
import CharacterClassPackage.Character.Warrior;
import Dungeon.Dungeon;
import Dungeon.Party;
import MonsterClassPackage.DarkElf;
import MonsterClassPackage.Orc;
import MonsterClassPackage.Troll;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Warrior("Воин"), new Priest("Жрец"),
                new FrostMage("Маг льда"), new Hunter("Охотник"));
        party.infoParty();
        Dungeon dark_forest = new Dungeon(new Orc("Орк"), new DarkElf("Темный Эльф"), new Troll("Троль"));
        dark_forest.infoDungeon();
        party.runDungeon(party, dark_forest);
    }
}
