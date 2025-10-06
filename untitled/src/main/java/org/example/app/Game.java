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
import org.example.util.Delay;

import java.util.Scanner;


public class Game {
    Hero hero;
    Weapon sword;
    Menu menu;
    public void game() {
        Scanner sc = new Scanner(System.in);

        menu = new Menu();
        menu.startMenu(this);

        System.out.println("Hej krigare! \n" +
                "Härligt att se dig. Nu ska vi ge oss ut på äventyr.\n" +
                "Men först och främst, vad heter du?");
        String name = sc.nextLine();
        hero = new Hero(name);
        sword = new Weapon("Svärd" , 10);
        System.out.println("Fint att träffa dig " + name + ". Jag heter Janne. \nInnan vi ger oss ut på äventyr så ska du få detta svärd av mig.\n" +
                " _____________________________\n" +
                "| Enkelt träsvärd | Skada: 10 |\n" +
                " -----------------------------");

        menu.gameMenu(this, hero);
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
            System.out.println("\n  ___  _  _ _                  _      _      \n" +
                    " / __|(_)(_) |_____ _ _   _ __| |__ _| |_ ___\n" +
                    " \\__ \\/ _` | / / -_) '_| | '_ \\ / _` |  _(_-<\n" +
                    " |___/\\__,_|_\\_\\___|_|   | .__/_\\__,_|\\__/__/\n" +
                    "                         |_|                 \n");
        }
    }

    public void fight(Monster monster) {
        monster.encounter();
        while (hero.getHp() > 0 && monster.getHp() > 0) {
            hero.attack(sword.getDamage(), monster);
            Delay.delay(1000);
            if (hero.getHp() > 0 && monster.getHp() > 0) {
                monster.attack(monster.getDamage(), hero);
                Delay.delay(1000);
            }
        }

        if (hero.getHp() > 0 && monster.getHp() <= 0) {
            System.out.println("Du vann fighten!\n");
            hero.gainXp(monster.getXpReward());
            hero.gainGold(monster.getGold());
            System.out.println("HP: " +  hero.getHp()+ "\n");
        }else if (hero.getHp() <= 0 && monster.getHp() > 0) {
            System.out.println("   _____                         ____                 \n" +
                    "  / ____|                       / __ \\                \n" +
                    " | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __ \n" +
                    " | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__|\n" +
                    " | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |   \n" +
                    "  \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|   \n" +
                    "                                                      \n" +
                    "                                                      ");
            menu.playAgainMenu();
        }
        levelTen();
    }

    public void levelTen(){
        if (hero.getLevel() == 10){
            System.out.println(" __      ___                            _ \n" +
                    " \\ \\    / (_)                          | |\n" +
                    "  \\ \\  / / _ _ __  _ __   __ _ _ __ ___| |\n" +
                    "   \\ \\/ / | | '_ \\| '_ \\ / _` | '__/ _ \\ |\n" +
                    "    \\  /  | | | | | | | | (_| | | |  __/_|\n" +
                    "     \\/   |_|_| |_|_| |_|\\__,_|_|  \\___(_)\n" +
                    "                                          \n" +
                    "                                          ");
            menu.playAgainMenu();
        }else{

        }
    }

}
