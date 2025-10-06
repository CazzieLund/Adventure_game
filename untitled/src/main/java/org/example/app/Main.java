package org.example.app;

import org.example.ui.Menu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        hero.attack(sword.damage, goblin);
        delay(000);
        goblin.attack(goblin.damage, hero);
        boss.specialAttack(hero);*/

        //Starta spelet
        Game game = new Game();
        Menu menu = new Menu();
        menu.startMenu(game);

        //Encounter
       // System.out.println("Aah, se där! \n" +
        //        "Det är ett " + monster + "!!");
    }


}