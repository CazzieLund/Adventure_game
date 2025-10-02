package org.example;

public abstract class Character {
    int maxHp;
    int hp;
    String name;

    public Character(int maxHp, int hp, String name) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.name = name;
    }


    abstract void attack(int damage, Character target);


    abstract void takeDamage(int damage);
}
