package com.charkun704;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        System.out.println("     _      _ _ \n" +
                "    | |    | | |\n" +
                "  __| | ___| | |\n" +
                " / _` |/ _ \\ | |\n" +
                "| (_| |  __/ | |\n" +
                " \\__,_|\\___|_|_|\n" +
                "                \n" +
                "                ");
        monitor.drawPixelAt(1640,430,"green");
    }

    private Case getTheCase() { return theCase; }

    private Monitor getMonitor() { return monitor; }

    private Motherboard getMotherboard() { return motherboard; }
}
