package CharacterClassPackage.Character;

import CharacterClassPackage.CharacterClass;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setMaxHealth(200);
        this.setMaxMana(0);
        this.setHealth(200);
        this.setMana(0);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(10);


    }
}
