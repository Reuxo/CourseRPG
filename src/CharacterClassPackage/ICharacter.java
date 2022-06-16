package CharacterClassPackage;

public interface ICharacter {
    void attack();

    void healthRecovery(int amount);

    void lossHealth(int amount);

    void manaRecovery(int amount);

    void lossMana(int amount);

    void levelUp();

    void chInfo();
}
