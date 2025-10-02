package org.example;

public abstract class Monster extends Character{
    int xpReward;
    int goldReward;
    int damage;

    public Monster(int maxHp, int hp, String name, int xpReward, int goldReward, int damage) {
        super(maxHp, hp, name);
        this.xpReward = xpReward;
        this.goldReward = goldReward;
        this.damage = damage;
    }

    @Override
    void attack(int damage, Character target) {
        System.out.println(this.name + " attackerar "
                + target.name + " och gör " + damage + " skada!");
        target.takeDamage(damage);
    }

    @Override
    void takeDamage(int damage) {
        this.hp -= damage;

        if (this.hp <= 0) {
            System.out.println(this.name + " tappar sitt liv och dör på fläcken.");
        } else {
            System.out.println(this.name + " tog " + damage + " i skada och har nu " + this.hp + " i HP");
        }
    }
}
