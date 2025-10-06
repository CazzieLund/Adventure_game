package org.example.ui;

import org.example.app.Game;
import org.example.model.characters.Hero;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public void startMenu(Game game)
    {
        System.out.println("Välkommen till Äventyret! \n" +
                "Du ska nu få kliva in i värld full utav monster och fina skatter.\n" +
                "Är du redo?\n\n");


        while(true){
            System.out.println(
                    "[1] Starta spelet\n" +
                    "[2] Stäng av");
            String ready = sc.nextLine();
            if (Objects.equals(ready, "1")){
                return;
            }else if (Objects.equals(ready, "2")){
                System.out.println("Spelet stängs nu av, hoppas vi ses igen!");
                System.exit(0);
            }else {
                System.out.println("Ogiltigt val, prova igen.");
            }
        }

    }

    public void gameMenu(Game game, Hero hero)
    {
        while(true){
            System.out.println("Vad vill du göra här näst?\n" +
                    "[1] Utforska Skogen\n" +
                    "[2] Utforska Bergen\n" +
                    "[3] Utforska Sjön\n" +
                    "[4] Visa statistik\n" +
                    "[5] Avsluta spelet\n");
            String move = sc.nextLine();
            switch (move) {
                case "1":
                    System.out.println("Utforska Skogen");
                    game.encounter(1);
                    break;
                case "2":
                    System.out.println("Utforska Bergen");
                    game.encounter(2);
                    break;
                case "3":
                    System.out.println("Utforska Sjön");
                    game.encounter(3);
                    break;
                case "4":
                    hero.getStats();
                    break;
                case "5":
                    boolean askExit = true;

                    while (askExit) {
                        System.out.println("Är du säker på att du vill avsluta spelet? \n" +
                                "Allt du gjort hittills kommer gå förlorat.\n" +
                                "[1] Ja\n" +
                                "[2] Nej");

                        String exit = sc.nextLine();

                        switch (exit) {
                            case "1":
                                return; // Avslutar programmet
                            case "2":
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

    public void playAgainMenu()
    {
        System.out.println("Vill du spela igen?\n" +
                "[1] Ja\n" +
                "[2] Nej, avsluta spelet");
        String again = sc.nextLine();
        switch (again) {
            case "1":
                Game game = new Game();
                startMenu(game);   // väntar tills spelaren väljer "Starta spelet"
                game.game();       //starta ett nytt spel!
                return;
            case "2":
                System.out.println("Spelet stängs nu av, hoppas vi ses igen!");
                System.exit(0);return;
        }
    }
}
