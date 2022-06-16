package CharacterClassPackage;

import CharacterClassPackage.Character.AttackType;

public abstract class CharacterClass implements ICharacter {

    private int health;
    private int mana;
    private int level;
    private int attackAmount;
    private AttackType attackType;
    private String name;
    private int maxHealth;
    private int maxMana;

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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        } else if (mana > this.maxMana) {
            this.mana = this.maxMana;
        } else {
            this.mana = mana;
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

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    @Override
    public void attack() {

    }

    @Override
    public void healthRecovery(int amount) {
        setHealth(this.health + amount);
    }

    @Override
    public void lossHealth(int amount) {
        setHealth(this.health - amount);
    }

    @Override
    public void manaRecovery(int amount) {
        setMana(this.mana + amount);
    }

    @Override
    public void lossMana(int amount) {
        setMana(this.mana - amount);
    }

    @Override
    public void levelUp() {

    }

    @Override
    public void chInfo() {
        System.out.println("Имя: " + this.name + "\n HP: " + this.health + "\n MP: " + this.mana
                + "\n Уровень персонажа: " + this.level);

    }
}
