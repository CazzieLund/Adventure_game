package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Hero hero = new Hero("Cazzlord");
        Weapon sword = new Weapon("Willbur", 60);
        Goblin goblin = new Goblin();
        Boss boss = new Boss();
        System.out.println ("Namn: " + hero.name + ", XP: " + hero.xp + " Vapen: " + sword.name + ", skada: " + sword.damage);
        hero.attack(sword.damage, goblin);
        delay(000);
        goblin.attack(goblin.damage, hero);
        boss.specialAttack(hero);*/

        //Starta spelet
        System.out.println("Hej krigare! \n" +
                "Härligt att se dig. Nu ska vi ge oss ut på äventyr.\n" +
                "Men först och främst, vad heter du?");
        String name = sc.nextLine();
        System.out.println("Fint att träffa dig " + name + ". Jag heter Janne. \nNu kör vi!");
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}