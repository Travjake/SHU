package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Travis Chapple SHU,\n\tAttempt to read from a website");
        URL siteContent = new URL("https://www.tradingview.com/chart/kZHl7k5t");

        URLConnection con = siteContent.openConnection();
        InputStream is =con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null)
            System.out.println(line);

        userString();
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
}
