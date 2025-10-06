package org.example.model.characters;

public class Hero extends Character {
    private int level = 1;
    private int xp = 0;
    private int gold = 0;

    public Hero(String name) {
        super(100, 100, name);
    }

    public void getStats() {
        System.out.println("===== Hjältens statistik =====");
        System.out.println("Namn: " + this.name);
        System.out.println("HP: " + this.hp + "/" + this.maxHp);
        System.out.println("Level: " + this.level);
        System.out.println("XP: " + this.xp);
        System.out.println("Guld: " + this.gold);
        System.out.println("==============================");
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    //Här körs hjältens attack och sist kallar den på targets.takeDamage()
    public void attack(int damage, Character target) {
        System.out.println(this.name + " attackerar "
                + target.getName() + " och gör " + damage + " skada!");
        target.takeDamage(damage);
    }

    //I takeDamage dras damage av ifrån hp, den kollar även om det finns hp kvar eller om karaktären dör.
    public void takeDamage(int damage) {
        this.hp -= damage;

        if (this.hp <= 0) {
            System.out.println("- " + this.name + " tappar sitt liv och dör som en lite sämre hjälte.\n");
        } else {
            System.out.println("- " + this.name + " tog " + damage + " i skada och har nu " + this.hp + " i HP\n");
        }
    }

    public void gainXp(int xpReward){
        xp += xpReward;
        if (xp >= 100) {
            levelUp();
        }
        System.out.println("XP reward: " + xpReward + "\nDu har nu " + xp +"/100 XP");
    }

    private void levelUp(){
        level = level + 1;
        xp -= 100;
        maxHp += 20;
        hp = maxHp;
        System.out.println("  _                    _                     _ \n" +
                " | |                  | |                   | |\n" +
                " | |     _____   _____| |  _   _ _ __  _ __ | |\n" +
                " | |    / _ \\ \\ / / _ \\ | | | | | '_ \\| '_ \\| |\n" +
                " | |___|  __/\\ V /  __/ | | |_| | |_) | |_) |_|\n" +
                " |______\\___| \\_/ \\___|_|  \\__,_| .__/| .__/(_)\n" +
                "                                | |   | |      \n" +
                "                                |_|   |_|      \n" +
                "Level: " + level);
    }

    public void gainGold(int goldReward){
        gold += goldReward;
        System.out.println("Guld belöning: " + goldReward + "\nDu har nu " + gold + " stycken mynt ");
    }

    public int getGold() {
        return gold;
    }
}
