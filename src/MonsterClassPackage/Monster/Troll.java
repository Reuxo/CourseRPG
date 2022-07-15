package MonsterClassPackage.Monster;

import CharacterClassPackage.Character.AttackType;
import MonsterClassPackage.MonsterClass;

public class Troll extends MonsterClass {

    public Troll(String name) {
        this.setLevel(1);
        this.setMaxHealth(200);
        this.setHealth(200);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(20);
    }
}
