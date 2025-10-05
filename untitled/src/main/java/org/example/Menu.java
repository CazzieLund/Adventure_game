package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void startMenu()
    {
        System.out.println("Välkommen till Äventyret! \n" +
                "Du ska nu få kliva in i värld full utav monster och fina skatter.\n" +
                "Är du redo?");

        String ready = sc.nextLine();

        if (Objects.equals(ready, "1")){
            Game game = new Game();
            game.game();
        }
    }

    public void gameMenu()
    {

    }
}
