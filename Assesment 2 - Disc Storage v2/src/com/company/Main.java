package com.company;
import javax.swing.plaf.ColorUIResource;
import java.io.File;
import java.util.Scanner;

public class Main {



    public static void main(String[] args)
    {

        displayMenu();
    }

    public static void displayMenu()
    {
        int userChoice;
        Scanner in = new Scanner(System.in);

        System.out.print("\nDisc Storage, Assessment 2\n\t\t\tBy Travis Chapple\n1)Enter a Disc's Details\n2)Edit a Disc's Details\n3)Remove a Disc's Details\n4)Search for a Disc by Name\n5)Display File in Reverse Order\n6)Rename File\n7)Exit\nPlease Enter your Choice: ");

        userChoice = userInput.userInt();


        switch (userChoice) {
            case 1: {
                //Add
                fileEdit.addDisc();
                break;
            }
            case 2: {
                //Edit
                fileEdit.basecasedisplayContents();
                System.out.print("What is the title of the Disc you would like the edit?: ");
                fileEdit.editLine();
                break;
            }
            case 3: {
                //Remove
                fileEdit.basecasedisplayContents();
                System.out.print("\nWhich Line Would you Like to Delete?: ");
                fileEdit.removeLine(userInput.userInt() - 1);
                break;
            }
            case 4: {
                //Search
                System.out.print("What is the Name of the file you would like to search for?: ");
                System.out.println(fileEdit.getbyTitle(userInput.userString()));
                break;
            }
            case 5: {
                //Display done using recursion
                fileEdit.basecasedisplayContents();
                break;
            }
            case 6:
            {
                //Rename
                System.out.print("What is the name of the file you would like to rename?: ");
                File Current = new File(userInput.userString());
                System.out.print(fileEdit.renameFile(Current));
                break;
            }
            case 7: {
                System.exit(0);
            }
        }
        System.out.print("\n\tPress Enter to Continue");
        userInput.userString();
        displayMenu();
    }




}
