package MonsterClassPackage;

import CharacterClassPackage.Character.AttackType;

public class Troll extends MonsterClass{

    public Troll(String name) {
        this.setLevel(1);
        this.setMaxHealth(200);
        this.setHealth(200);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(20);
    }
}
