package org.example.app;
import org.example.model.bosses.Boss;
import org.example.model.bosses.BossDragon;
import org.example.model.bosses.BossSeaMonster;
import org.example.model.bosses.BossTree;
import org.example.model.characters.Hero;
import org.example.model.characters.Monster;
import org.example.model.items.Weapon;
import org.example.model.monsters.Goblin;
import org.example.model.monsters.GoblinForest;
import org.example.model.monsters.GoblinMontain;
import org.example.model.monsters.GoblinSea;
import org.example.ui.Menu;

import java.util.Scanner;


public class Game {
    Hero hero;

    public void game() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hej krigare! \n" +
                "Härligt att se dig. Nu ska vi ge oss ut på äventyr.\n" +
                "Men först och främst, vad heter du?");
        String name = sc.nextLine();
        hero = new Hero(name);
        Weapon sword = new Weapon("Svärd" , 10);
        System.out.println("Fint att träffa dig " + name + ". Jag heter Janne. \nInnan vi ger oss ut på äventyr så ska du få detta svärd av mig.\n" +
                " _____________________________\n" +
                "| Enkelt träsvärd | Skada: 10 |\n" +
                " -----------------------------");
        Menu menu = new Menu();
        menu.gameMenu(this, hero);
        //Encounter
        // System.out.println("Aah, se där! \n" +
        //        "Det är ett " + monster + "!!");
    }

    public void encounter(int move) {
        double rnd = Math.random();
        if (rnd < 0.7) {
            Goblin goblin;
            switch (move) {
                case 1:
                    goblin = new GoblinForest(hero);
                    break;
                case 2:
                    goblin = new GoblinMontain(hero);
                    break;
                case 3:
                    goblin = new GoblinSea(hero);
                    break;
                default:
                    goblin = new GoblinSea(hero);
            }
            System.out.println(move);
            fight(goblin);
        } else if (rnd < 0.8) {
            Boss boss;
            switch (move) {
                case 1:
                    boss = new BossTree(hero);
                    break;
                case 2:
                    boss = new BossDragon(hero);
                    break;
                case 3:
                    boss = new BossSeaMonster(hero);
                    break;
                default:
                    boss = new BossDragon(hero);
            }
            System.out.println(move);
            fight(boss);
        }else {
            System.out.println("Safe place");
        }
    }

    public void fight(Monster monster) {
        monster.encounter();
        /* while (hero.getHp()< 0 && monster.getHp()< 0) {

        }*/
    }

}
