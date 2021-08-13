package com.company;

public class Option_1 {

    public static void getName(){

        System.out.print("You choose option 1! What is your name?\nInput: ");
        Main.scanner.nextLine();
        String name = Main.scanner.nextLine().trim();

        System.out.println("---\nHello " + name + "!\n---");

    }

}
