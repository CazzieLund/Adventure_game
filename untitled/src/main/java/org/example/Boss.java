package org.example;

public class Boss extends Monster{

    public Boss() {
        super(70, 70, "Boss Dragon", 50, 10, 25);
    }
// Bossen har 30% chans att göra en specialattack och gör därmed dubbelt med damage.
    void specialAttack(Character target){
        double rnd = Math.random();
        if (rnd < 0.3) { // 30% chans
            System.out.println("Kritisk träff!");
            target.takeDamage((damage *2));
        } else {
            System.out.println(rnd);
            target.takeDamage(damage);
        }
    }
}
