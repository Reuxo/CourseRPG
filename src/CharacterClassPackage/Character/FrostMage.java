package CharacterClassPackage.Character;

import CharacterClassPackage.CharacterClass;

public class FrostMage extends CharacterClass {
    public FrostMage(String name) {
        this.setLevel(1);
        this.setMaxHealth(120);
        this.setHealth(120);
        this.setName(name);
        this.setAttackType(AttackType.FROST_MAGICAL);
        this.setAttackAmount(30);
    }
}
