package org.example;

public class Hero extends Character {
    int level = 1;
    int xp = 0;
    int gold = 0;

    public Hero(String name) {
        super(100, 100, name);
    }

    //Här körs hjältens attack och sist kallar den på targets.takeDamage()
    void attack(int damage, Character target) {
        System.out.println(this.name + " attackerar "
                + target.name + " och gör " + damage + " skada!");
        target.takeDamage(damage);
    }

    //I takeDamage dras damage av ifrån hp, den kollar även om det finns hp kvar eller om karaktären dör.
    void takeDamage(int damage) {
        this.hp -= damage;

        if (this.hp <= 0) {
            System.out.println(this.name + " tappar sitt liv och dör som en lite sämre hjälte.");
        } else {
            System.out.println(this.name + " tog " + damage + " i skada och har nu " + this.hp + " i HP");
        }
    }

    void gainXp(){

    }

    void levelUp(){

    }
}
