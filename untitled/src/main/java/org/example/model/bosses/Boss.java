package org.example.model.bosses;

import org.example.model.characters.Character;
import org.example.model.characters.Monster;

public abstract class Boss extends Monster {

    public Boss(int maxHp, int hp, String name, int xpReward, int goldReward, int damage, String habitat) {
        super(
                maxHp,
                hp,
                name,
                xpReward,
                goldReward,
                damage,
                habitat
        );
    }

    public void attack(int damage, Character target) {
        double rnd = Math.random();
        if (rnd < 0.3) { // 30% chans
            specialAttack(target);
        } else {
            System.out.println(this.name + " attackerar "
                    + target.getName() + " och gör " + damage + " skada!");
            target.takeDamage(damage);
        }
    }

    // Bossen har 30% chans att göra en specialattack och gör därmed dubbelt med damage.
    void specialAttack(Character target){
            System.out.println(" _   __     _ _   _     _      _       _   _  __  __ _ \n" +
                    "| | / /    (_) | (_)   | |    | |     (_) (_)/ _|/ _| |\n" +
                    "| |/ / _ __ _| |_ _ ___| | __ | |_ _ __ __ _| |_| |_| |\n" +
                    "|    \\| '__| | __| / __| |/ / | __| '__/ _` |  _|  _| |\n" +
                    "| |\\  \\ |  | | |_| \\__ \\   <  | |_| | | (_| | | | | |_|\n" +
                    "\\_| \\_/_|  |_|\\__|_|___/_|\\_\\  \\__|_|  \\__,_|_| |_| (_)\n" +
                    "                                                       \n" +
                    "                                                       \n" +
                    this.name + " får in en kritisk träff och gör " + (damage*2) + " i skada!");
            target.takeDamage((damage *2));
    }

    public void encounter(){
        System.out.println("Du kommer till " + habitat + " och får syn på en " + name + ". Den attackerar dig direkt!\n" +
                "Nu är det fight:\n");
    }


}
