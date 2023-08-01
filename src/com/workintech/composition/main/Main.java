package com.workintech.composition.main;

import com.workintech.composition.model.*;

public class Main {
    public static void main(String[] args) {
        //Create Enums
        LampType lampType = LampType.DESK_LAMP;
        PaintColor carpetColor = PaintColor.GREEN;
        PaintColor ceilingColor = PaintColor.RED;

        //Create Objects
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(300, ceilingColor);
        Bed bed = new Bed("Classic",2,100,2,1);
        Lamp lamp = new Lamp(5,true,lampType);
        Wardrobe wardrobe = new Wardrobe(200,300,100);
        Carpet carpet = new Carpet(300,400,carpetColor);

        //Create Bedroom Objects
        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("\nCELLING OBJECTS");

        //Test the Ceiling Object
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling Color: " + bedroom.getCeiling().getColor());

        System.out.println("\nBED OBJECTS");

        //Test the Bed Object
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Bed Pillow: " + bedroom.getBed().getPillow());
        System.out.println("Bed Height: " + bedroom.getBed().getHeight());
        System.out.println("Bed Sheets: " + bedroom.getBed().getSheets());
        System.out.println("Bed Quilt: " + bedroom.getBed().getQuilt());

        System.out.println("\nLAMP OBJECTS");

        //Test the Lamp Object
        System.out.println("Lamp Type: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp Battery: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp Globrating: " + bedroom.getLamp().getGlobRating());

        System.out.println("\nWARDROBE OBJECTS");

        //Test the Wardrobe Object
        System.out.println("Wardrobe Height: " + bedroom.getWardrobe().getHeight());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Wardrobe Weight: " + bedroom.getWardrobe().getWeight());

        System.out.println("\nCARPET OBJECTS");

        //Test the Carpet Object
        System.out.println("Carpet Width: " + bedroom.getCarpet().getWidth());
        System.out.println("Carpet Height: " + bedroom.getCarpet().getHeight());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

        System.out.println("\nBEDROOM OBJECTS");

        //Test the Bedroom Object
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling Color: " + bedroom.getCeiling().getColor());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp Type: " + bedroom.getLamp().getStyle());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
        bedroom.getLamp().turnOn();
        bedroom.getWall1().create();



    }
}