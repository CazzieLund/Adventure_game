package org.example.ui;

import org.example.app.Game;
import org.example.model.Hero;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void startMenu()
    {
        System.out.println("Välkommen till Äventyret! \n" +
                "Du ska nu få kliva in i värld full utav monster och fina skatter.\n" +
                "Är du redo?\n\n");

        int i = 0;
        while(i < 1){
            System.out.println(
                    "[0] Starta spelet\n" +
                    "[1] Stäng av");
            String ready = sc.nextLine();
            if (Objects.equals(ready, "0")){
                Game game = new Game();
                game.game();

                i++;
            }else if (Objects.equals(ready, "1")){
                System.out.println("Spelet stängs nu av, hoppas vi ses igen!");
                System.exit(0);
            }else {
                System.out.println("Ogiltigt val, prova igen.");
            }
        }

    }

    public static void gameMenu(Hero hero)
    {
        while(true){
            System.out.println("Vad vill du göra här näst?\n" +
                    "[0] Utforska Skogen\n" +
                    "[1] Utforska Bergen\n" +
                    "[2] Utforska Sjön\n" +
                    "[3] Visa statistik\n" +
                    "[4] Avsluta spelet\n");
            String move = sc.nextLine();
            switch (move) {
                case "0":
                    System.out.println("Utforska Skogen");
                    break;
                case "1":
                    System.out.println("Utforska Bergen");
                    break;
                case "2":
                    System.out.println("Utforska Sjön");
                    break;
                case "3":
                    hero.getStats();
                    break;
                case "4":
                    boolean askExit = true;

                    while (askExit) {
                        System.out.println("Är du säker på att du vill avsluta spelet? \n" +
                                "Allt du gjort hittills kommer gå förlorat.\n" +
                                "[0] Ja\n" +
                                "[1] Nej");

                        String exit = sc.nextLine();

                        switch (exit) {
                            case "0":
                                return; // Avslutar programmet
                            case "1":
                                askExit = false; // Avbryter loopen - tillbaka till huvudmenyn
                                break;
                            default:
                                System.out.println("Ogiltigt val, prova igen.");
                        }
                    }
                    break;
                default:
                    System.out.println("Ogiltigt val, prova igen.");

            }
        }

    }
}
