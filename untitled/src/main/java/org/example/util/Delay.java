package org.example.util;

//delay så det är ett snyggare flyt i spelet
public class Delay {
    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
