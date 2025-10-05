package org.example.model;

public abstract class Goblin extends Monster {

    String color;

    public Goblin(int maxHp, int hp, String name, int xpReward, int goldReward, int damage, String color) {
        super(maxHp, hp, name, xpReward, goldReward, damage);
        this.color = color;
    }
}
