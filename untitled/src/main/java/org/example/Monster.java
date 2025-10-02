package org.example;

public abstract class Monster extends Character{
    int xpReward;
    int goldReward;

    public Monster(int maxHp, int hp, String name, int xpReward, int goldReward) {
        super(maxHp, hp, name);
        this.xpReward = xpReward;
        this.goldReward = goldReward;
    }

    @Override
    void attack() {

    }

    @Override
    void takeDamage() {

    }
}
