package com.company;

public class Option_2 {

    public static void getReverse(){
        System.out.print("You have selected option 2! Please give us a word or phrase.\n Input: ");
        Main.scanner.nextLine();
        String input = Main.scanner.nextLine().trim();
        String newString = "";

        for (int i = input.length() - 1; i >= 0; i--){
            newString += input.charAt(i);
        }

        System.out.println("Here is your word or phrase!\n---\n" + newString + "\n---");

    }

}
