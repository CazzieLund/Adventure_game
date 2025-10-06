package org.example.model.characters;
//abstrakt klass
public abstract class Character {
    protected int maxHp;
    protected int hp;
    protected String name;

    protected Character(int maxHp, int hp, String name) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.name = name;
    }

    public abstract void attack(int damage, Character target);

    public abstract void takeDamage(int damage);

    public String getName() {
        return name;
    }
    public int getMaxHp() {
        return maxHp;
    }
}
