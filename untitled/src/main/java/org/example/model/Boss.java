package org.example.model;

public class Boss extends Monster {

    public Boss() {
        super(70, 70, "Boss Dragon", 50, 10, 25);
    }
// Bossen har 30% chans att göra en specialattack och gör därmed dubbelt med damage.
    void specialAttack(Character target){
        double rnd = Math.random();
        if (rnd < 0.3) { // 30% chans
            System.out.println(" _   __     _ _   _     _      _       _   _  __  __ _ \n" +
                    "| | / /    (_) | (_)   | |    | |     (_) (_)/ _|/ _| |\n" +
                    "| |/ / _ __ _| |_ _ ___| | __ | |_ _ __ __ _| |_| |_| |\n" +
                    "|    \\| '__| | __| / __| |/ / | __| '__/ _` |  _|  _| |\n" +
                    "| |\\  \\ |  | | |_| \\__ \\   <  | |_| | | (_| | | | | |_|\n" +
                    "\\_| \\_/_|  |_|\\__|_|___/_|\\_\\  \\__|_|  \\__,_|_| |_| (_)\n" +
                    "                                                       \n" +
                    "                                                       ");
            target.takeDamage((damage *2));
        } else {
            System.out.println(rnd);
            target.takeDamage(damage);
        }
    }
}
