package org.example.model.characters;

public abstract class Monster extends Character {
    protected int xpReward;
    protected int goldReward;
    protected int damage;
    protected String habitat;

    public Monster(int maxHp, int hp, String name, int xpReward, int goldReward, int damage, String habitat) {
        super(maxHp, hp, name);
        this.xpReward = xpReward;
        this.goldReward = goldReward;
        this.damage = damage;
        this.habitat = habitat;
    }

    //Här körs monstrens attacker och sist kallar den på targets.takeDamage()
    public abstract void attack(int damage, Character target);

    //I takeDamage dras damage av ifrån hp, den kollar även om det finns hp kvar eller om karaktären dör
    public void takeDamage(int damage) {
        this.hp -= damage;

        if (this.hp <= 0) {
            System.out.println("- " + this.name + " tappar sitt liv och dör på fläcken.\n");
        } else {
            System.out.println("- " + this.name + " tog " + damage + " i skada och har nu " + this.hp + " i HP\n");
        }
    }

    public abstract void encounter();


    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getXpReward() {
        return xpReward;
    }

    public int getGold() {
    return goldReward;
    }
}
