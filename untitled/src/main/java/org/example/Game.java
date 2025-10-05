package org.example;
import java.util.Scanner;


public class Game {
    public void game() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hej krigare! \n" +
                "Härligt att se dig. Nu ska vi ge oss ut på äventyr.\n" +
                "Men först och främst, vad heter du?");
        String name = sc.nextLine();
        System.out.println("Fint att träffa dig " + name + ". Jag heter Janne. \nNu kör vi!\n\n");

        //Encounter
        // System.out.println("Aah, se där! \n" +
        //        "Det är ett " + monster + "!!");
    }


}
