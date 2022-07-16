package MonsterClassPackage.Monster;

import CharacterClassPackage.Character.AttackType;
import MonsterClassPackage.MonsterClass;

public class DarkElf extends MonsterClass {

    public DarkElf(String name) {
        this.setLevel(1);
        this.setMaxHealth(150);
        this.setHealth(150);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(15);
    }
}
