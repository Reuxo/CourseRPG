package CharacterClassPackage.Character;

import CharacterClassPackage.CharacterClass;

public class FrostMage extends CharacterClass {
    public FrostMage(String name) {
        this.setLevel(1);
        this.setMaxHealth(120);
        this.setMaxMana(200);
        this.setHealth(120);
        this.setMana(200);
        this.setName(name);
        this.setAttackType(AttackType.FROST_MAGICAL);
        this.setAttackAmount(20);
    }
}
