package MonsterClassPackage;

import CharacterClassPackage.Character.AttackType;
import CharacterClassPackage.CharacterClass;


public abstract class MonsterClass implements IMonster {
    private int health;
    private int level;
    private int attackAmount;
    private AttackType attackType;
    private String name;
    private int maxHealth;
    boolean isDead = false;

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
            System.out.println("Ваш монстр не может быть ниже нулевого уровня !!!");
        }
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if (attackAmount < 0) {
            System.out.println("Монстр не может атаковать !!!");
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

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    @Override
    public void attackMonster(CharacterClass[] character, int playerId) {
        character[playerId].healthLoss(this.attackAmount);
    }

    @Override
    public void healthRecovery(int amount) {
        setHealth(this.health + amount);
    }

    @Override
    public void healthLoss(int amount) {
        this.health -= amount;
        if(this.health <= 0) {
            isDead = true;
        }
    }


    @Override
    public void infoMonster() {
        System.out.println("Имя монстра: " + this.name + "\n HP: " + this.health + "\nАтака : " + this.attackAmount
                + "\nУровень: " + this.level);
    }
}
