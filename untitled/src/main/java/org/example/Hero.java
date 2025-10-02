package org.example;

public class Hero extends Character {
    int level;
    int xp;
    int gold;

    public Hero(int maxHp, int hp, String name, int level, int xp, int gold) {
        super(maxHp, hp, name);
        this.level = level;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    void attack() {

    }

    @Override
    void takeDamage() {

    }

    void gainXp(){

    }

    void levelUp(){

    }
}
