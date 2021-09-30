package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int Num1;
        int Num2;

        System.out.println("Enter Number 1: ");
        Num1 = Scan.nextInt();
        System.out.println("Enter Number 2: ");
        Num2 = Scan.nextInt();

        int Rem = Num1 % Num2;
        int Quo = (Num1 - Rem) / Num2;

        System.out.println(Quo + "\t" + Rem);

    }
}
