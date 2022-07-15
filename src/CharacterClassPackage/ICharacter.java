package CharacterClassPackage;

import Dungeon.Dungeon;
import MonsterClassPackage.MonsterClass;

public interface ICharacter {
    void attack(MonsterClass[] monsters, int monsterId);

    void healthRecovery(int amount);

    void healthLoss(int amount);

    void levelUp();

    void chInfo();
}
