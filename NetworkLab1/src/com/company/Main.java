package com.company;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {

    private static String userString;
    private static final int Integer1 = 68;
    private static final int Integer2 = 420;
    private static final int Integer3 = 489;

    public static void main(String[] args) {
        ///Dipslays Name in Centre
        System.out.print("Write Here:\t");
        userString = userInput();

        outputStringCentre(userString);

        ///Displays Float
        float Result = (Integer1 + Integer2 + Integer3 )/ 3f;
        System.out.printf("%1.1f%n", Result);


        System.out.print("Enter a Keyword: ");
        userString = userInput();
        char userStringLastChar = userString.charAt(userString.length()-1);
        System.out.println(userStringLastChar);

        while(true)
        {

        }


    }


    private static String userInput() {
        Scanner input = new Scanner(System.in);

        try {
            userString = input.nextLine();
            return userString;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }

    private static void outputStringCentre(String userString){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + userString);
    }
}