package CharacterClassPackage.Character;

import CharacterClassPackage.CharacterClass;

public class Hunter extends CharacterClass {
    public Hunter(String name) {
        this.setLevel(1);
        this.setMaxHealth(150);
        this.setMaxMana(0);
        this.setHealth(150);
        this.setMana(0);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(8);
    }
}
