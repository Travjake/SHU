package com.company;

import java.util.Scanner;

public class userInput {

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

    public static String userString() // String ""
    {
        Scanner in = new Scanner(System.in);
        try
        {
            return in.nextLine();
        }
        catch (Exception e){
            System.out.print(e + "\nPlease enter a String Input: ");
            userString();}

        return "a";
    }

    /*
    public static Date userDate()
    {
        Scanner in = new Scanner(System.in);
        Date date2 = null;
        try
        {
            String date = in.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            try {
                //Parsing the String
                 return dateFormat.parse(date);
            } catch (ParseException e)
            {
                System.out.print(e);
                userDate();
            }
        }catch (Exception e){userDate();}
        return date2;
    }

    public static LocalTime userTime()
    {
        Scanner in = new Scanner(System.in);
        LocalTime LTime = null;

        try
        {
            LTime = LocalTime.parse(in.nextLine());
            return LTime;
        }catch (Exception e){
            System.out.print(e);
            userDate();}

        return LTime;
    }
    */ //NOTE: Chose against using this as using string provides more flexible formatting options all work if the appropriate lines in fileEdit.adddisc are changed i just personally chose against using them
}
