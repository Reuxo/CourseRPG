package MonsterClassPackage;

import CharacterClassPackage.CharacterClass;

public interface IMonster {
    void attackMonster(CharacterClass[] character, int playerId);

    void healthRecovery(int amount);

    void healthLoss(int amount);


    void infoMonster();
}
