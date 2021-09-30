package com.company;

import java.util.Scanner;

public class inputHandle {
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

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
