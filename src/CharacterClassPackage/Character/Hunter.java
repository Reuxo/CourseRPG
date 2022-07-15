package CharacterClassPackage.Character;

import CharacterClassPackage.CharacterClass;

public class Hunter extends CharacterClass {
    public Hunter(String name) {
        this.setLevel(1);
        this.setMaxHealth(150);
        this.setHealth(150);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(12);
    }
}
