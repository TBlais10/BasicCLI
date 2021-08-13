package com.company;

public class Option_3 {

    public static void addNumbers(){
        System.out.print("You have selcted option 3! Give us your first number to add.\nInput: ");

        Main.scanner.nextLine();
        int firstNumber = Main.scanner.nextInt();
        System.out.println("Give us your second number.");

        int secondNumber = Main.scanner.nextInt();
        int total = firstNumber + secondNumber;

        System.out.println("---\n" + firstNumber + " + " +secondNumber + " = " + total + "\n---");

    }

}
