package com.composition;

public class CompositionMain {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("110A", "Hp", "240", dimensions);
        Monitor monitor = new Monitor("32 inch", "Dell", 27, new Resolution(1080,1080));
        Motherboard motherBoard = new Motherboard("112B", "Asus", 4, 6, "V2.00" );

        // building pc from three other classes
        PC pc = new PC(theCase, monitor, motherBoard);

        // accessing method in monitor class
        pc.getMonitor().drawPixelAt(1500,2000,"red");

        // accessing method in motherBoard class
        pc.getMotherboard().loadProgram("java Program");

        // accessing method in case class
        pc.getTheCase().pressPowerButton();
    }
}
