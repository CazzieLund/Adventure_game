package org.example.app;
import org.example.model.Hero;
import org.example.ui.Menu;
import org.example.model.Weapon;

import java.util.Scanner;


public class Game {
    public void game() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hej krigare! \n" +
                "Härligt att se dig. Nu ska vi ge oss ut på äventyr.\n" +
                "Men först och främst, vad heter du?");
        String name = sc.nextLine();
        Hero hero = new Hero(name);
        Weapon sword = new Weapon("Svärd" , 10);
        System.out.println("Fint att träffa dig " + name + ". Jag heter Janne. \nInnan vi ger oss ut på äventyr så ska du få detta svärd av mig.\n" +
                " _____________________________\n" +
                "| Enkelt träsvärd | Skada: 10 |\n" +
                " -----------------------------");
        Menu.gameMenu(hero);
        //Encounter
        // System.out.println("Aah, se där! \n" +
        //        "Det är ett " + monster + "!!");
    }

    public void encounter() {
        Scanner sc = new Scanner(System.in);
    }
}
