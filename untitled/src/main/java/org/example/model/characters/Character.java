package org.example.model.characters;

public abstract class Character {
    protected int maxHp;
    protected int hp;
    protected String name;

    public Character(int maxHp, int hp, String name) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.name = name;
    }

    abstract void attack(int damage, Character target);


    public abstract void takeDamage(int damage);

    public String getName() {
        return name;
    }
    public int getMaxHp() {
        return maxHp;
    }
}
