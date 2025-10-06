package org.example.model.monsters;

import org.example.model.characters.Character;
import org.example.model.characters.Monster;

public abstract class Goblin extends Monster {

    protected String weapon;

    public Goblin(int maxHp, int hp, String name, int xpReward, int goldReward, int damage, String weapon, String habitat) {
        super(maxHp, hp, name, xpReward, goldReward, damage, habitat);
        this.weapon = weapon;
    }

    //När hjälten stöter på en goblin skrivs detta ut
    public void encounter(){
        System.out.println("Du kommer till " + habitat + " och får syn på en " + name + ". Den attackerar dig med sin " + weapon + ". Nu är det fight:\n");
    }
    //Detta skrivs ut då en goblin går till attack, sist körs target.takeDamge()
    public void attack(int damage, Character target) {
        System.out.println(this.name + " attackerar "
                + target.getName() + " och gör " + damage + " skada!");
        target.takeDamage(damage);
    }
}
