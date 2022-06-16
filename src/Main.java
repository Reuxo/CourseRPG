import CharacterClassPackage.Character.FrostMage;
import CharacterClassPackage.Character.Hunter;
import CharacterClassPackage.Character.Priest;
import CharacterClassPackage.Character.Warrior;
import Dungeon.Dungeon;
import Dungeon.Party;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Warrior("Воин"), new Priest("Жрец"),
                new FrostMage("Маг льда"), new Hunter("Охотник"));
        party.infoParty();
        Dungeon stratholme = new Dungeon();

        party.runDungeon(party, stratholme);
    }
}
