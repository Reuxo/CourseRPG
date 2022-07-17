package CharacterClassPackage;

import CharacterClassPackage.Character.AttackType;
import MonsterClassPackage.MonsterClass;

public abstract class CharacterClass implements ICharacter {

    private int health;
    private int level;
    private int attackAmount;
    private AttackType attackType;
    private String name;
    private int maxHealth;
    boolean isDied = false;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > this.maxHealth) {
            this.health = this.maxHealth;
        } else {
            this.health = health;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) {
            System.out.println("Ваш персонаж не может быть ниже нулевого уровня!!!");
        }
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if (attackAmount < 0) {
            System.out.println("Вы не можете атаковать!!!");
        } else {
            this.attackAmount = attackAmount;
        }
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isDied() {
        return isDied;
    }

    public void setDied(boolean died) {
        isDied = died;
    }

    @Override
    public void attack(MonsterClass[] monsters, int monsterId) {
        monsters[monsterId].healthLoss(this.attackAmount);
        System.out.println(monsters[monsterId].getName() + " " + monsters[monsterId].getHealth());
    }

    @Override
    public void healthRecovery(int amount) {
        setHealth(this.health + amount);
    }

    @Override
    public void healthLoss(int amount) {
        this.health -= amount;
        if(this.health <= 0) {
            isDied = true;
        }
    }


    @Override
    public void levelUp() {
        this.level += 1;
        this.maxHealth += 20;
        this.attackAmount += 20;
    }

    @Override
    public void chInfo() {
        System.out.println("Имя: " + this.name + "\n HP: " + this.health +
                "\n Уровень персонажа: " + this.level);

    }
}
