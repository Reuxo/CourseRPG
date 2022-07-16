package CharacterClassPackage.Character;

import CharacterClassPackage.CharacterClass;

public class Priest extends CharacterClass {
    public Priest(String name) {
        this.setLevel(1);
        this.setMaxHealth(100);
        this.setHealth(100);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_HEAL);
        this.setAttackAmount(20);
    }
}
