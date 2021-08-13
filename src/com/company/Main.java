package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean runMenu = true;
        System.out.println("Welcome to Taylor's CLI.");

        do {
            System.out.println("Please choose an option to continue:\n1) Say Hello\n2) Reverse a string\n3) Add two numbers\n4) Exit the program");
            System.out.print("Selection: ");

            byte input = scanner.nextByte();

            switch (input) {

            case 1:
                Option_1.getName();
                break;
            case 2:
                Option_2.getReverse();
                break;
            case 3:
                Option_3.addNumbers();
                break;
            case 4:
                System.out.println("You have chosen option 4! We hope to see you soon. Goodbye!");
                runMenu = false;
                break;
            default:
                System.out.println("Invalid option! Please try again.");
                break;
        }

        }

        while (runMenu);

    }


}
//break
//continue
//do while loop
//check
//switch statements

/*Conditions for input:
* 1. Say Hello
* 2. Reverse a string
* 3. Add two Numbers
* 4. Exit the Program.
*
* will need to manage white space.*/