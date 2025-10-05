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
        Menu menu = new Menu();
        menu.startMenu();

        //Encounter
       // System.out.println("Aah, se där! \n" +
        //        "Det är ett " + monster + "!!");
    }


}