package com.charkun704;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("980","Dell","500",dimensions);
        Monitor theMonitor = new Monitor("24in OLED","Dell",24, new Resolution(1920,
                1080));
        Motherboard theMobo = new Motherboard("B850","ASUS",4,2,"v18");

        PC deskun = new PC(theCase,theMonitor,theMobo);
        deskun.powerUp();
    }
}
