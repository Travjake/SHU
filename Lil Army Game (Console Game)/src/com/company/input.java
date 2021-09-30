package com.company;

import java.util.Scanner;

public class input {
    public static int userInt() // Lets User enter a int with exception covering
    {
        Scanner in = new Scanner(System.in);
        try
        {
            int userChoice = in.nextInt();
            return userChoice;
        }
        catch (Exception e){
            System.out.print(e + "\nPlease enter a Integer Input: ");
            userInt();
        }

        return 0;
    }
}
