package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Willbur", 60);

        System.out.println ("Vapen: " + sword.name + ", skada: " + sword.damage);
    }
}