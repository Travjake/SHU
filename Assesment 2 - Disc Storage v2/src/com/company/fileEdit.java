package com.company;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class fileEdit {

    /*private String Title;                    NOTE: Encapsulation but I couldn't get this functioning due to classes being static and couldnt find a way to stop this
    private String Artist;                             i left it here do show how i would have done it if i could pass this issue
    private String Genre;
    private String releaseDate;
    private int numberofSongs;
    private String Duration;
    private int PEGIRating;
    private String Platform;

    public fileEdit(String Title,String Artist,String Genre,String releaseDate, int numberofSongs, String Duration, int PEGIRating, String Platform)
    {
        this.Title = Title;
        this.Artist = Artist;
        this.Genre = Genre;
        this.releaseDate = releaseDate;
        this.numberofSongs = numberofSongs;
        this.Duration = Duration;
        this.PEGIRating = PEGIRating;
        this.Platform = Platform;
    }

    public String getmusicTitle() {return Title;}
    public String getmusicArtist() {return Artist;}
    public String getmusicGenre() {return Genre;}
    public String getmusicreleaseDate() {return releaseDate;}
    public int getmusicnumberofSongs() {return numberofSongs;}
    public String getmusicDuration() {return Duration;}
    public int getPEGIRating() {return PEGIRating;}
    public String getPlatform() {return Platform;}

     */

    public static void addDisc() // collects to users infomation that they would like to add to the disc
    {
        String toSend = "";

        System.out.print("You Have Chosen to Add a Disc!\nPlease leave the field blank if it is non applicable\nPlease Enter the Title of the Disc: ");
        String Title = userInput.userString();
        System.out.print("Please Enter the Artist: ");
        String Artist = userInput.userString();
        System.out.print("Please Enter the Genre: ");
        String Genre = userInput.userString();
        System.out.print("Please Enter the Release Data in Format DD-MM-YYYY: ");
        String releaseDate = userInput.userString();

        if(Artist == "") // Only if Game
        {
            System.out.print("Please Enter the PEGI Rating: ");
            int PEGIRating = userInput.userInt();
            System.out.print("Please Enter the Games Platform: ");
            String Platform = userInput.userString();
            toSend = Title + ","  + "," + Genre + "," + releaseDate + "," + PEGIRating + "," + Platform + ",Game";

        }
        else // "" Music
        {
            System.out.print("Enter the Number of Songs on the CD: ");
            int numberofSongs = userInput.userInt();
            System.out.print("Enter the Duration of the CD (mm:ss): ");
            String Duration = userInput.userString();
            toSend = (Title + ","  + Artist + "," + Genre + "," + releaseDate + "," + numberofSongs + "," + Duration + ",Music");

        }
        fileEdit.writetoFile(toSend);
    }

    public static void writetoFile(String toSend) // This writes to the file alos couldnt make this dynamic due to problems with the encapsulation it can only write to CDStore.txt
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CDStore.txt",true)))
        {
            writer.write(toSend);
            writer.newLine();
        }
        catch(IOException e) // error catching
        {
            System.out.print(e.getMessage());
        }
    }

    public static ArrayList getfileContent() // Gets the content of the file and writes it to an array list  each line being a new element then returns if to the caller
    {
        BufferedReader Read = null;
        ArrayList<String> SavedElements = new ArrayList<>();
        try{
        Read = new BufferedReader(new FileReader("CDStore.txt"));
        String line = Read.readLine();
        while (line != null)
        {
            SavedElements.add(line);
            line = Read.readLine();
        }
        }catch(IOException e)
        {
            System.out.print(e);
        }


        return SavedElements;
    }

    public static void removeLine(int deleteLine) // removes the line specified by deleteline
    {
        ArrayList<String> fileContent = getfileContent();

        fileContent.remove(deleteLine);
        clearFile();
        int Pointer = 0;

        while(Pointer < fileContent.size())
        {
            String temp = fileContent.get(Pointer);
            writetoFile(temp);

            Pointer++;
        }
    }

    public static void basecasedisplayContents() // this is the base case of the recursive showing of the files contents just grabbing the information need for the recursive case
    {
        BufferedReader Read= null;
        try { Read = new BufferedReader(new FileReader("CDStore.txt"));
        } catch (FileNotFoundException e) {e.printStackTrace();}

        ArrayList<String> ListContents = getfileContent();
        Iterator<String> fileContents = ListContents.iterator();


        recursivecasedisplayContents(fileContents, 0);
    }

    public static void recursivecasedisplayContents(Iterator<String> fileContents, int Line) // the recusive method that runs itself as many time as the file contents are long printing contents once this amount has been reached
    {
        while(fileContents.hasNext())
        {
            String Element = fileContents.next();
            Line++;
            recursivecasedisplayContents(fileContents, Line);
            System.out.println(Line + ")" + Element);
        }
    }

    public static void clearFile() // this emties to file for things like renaming etc
    {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("CDStore.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.close();
    }

    public static String getbyTitle(String searchWord) // this looks for the title of the disc and then will display to the user if it exists
    {
        ArrayList<String> fileContent = getfileContent();
        int Increment = 0;

        while(Increment < fileContent.size())
        {
            String split[] = fileContent.get(Increment).split(",");
            if (searchWord.equals(split[0])) {
                return fileContent.get(Increment);
            }
            Increment++;
        }
        return "This File Does not Exist";
    }

    public static void editLine() // The logic for editing a soecific line of the file asking the user what line to change and what to etc
    {

        String requestedLine = getbyTitle(userInput.userString());
        System.out.print("Now to lines Number please: ");
        int deleteLine = userInput.userInt() - 1;

        if(requestedLine != "This File Does not Exist") {
            String[] splitrequestedLine = requestedLine.split(",");

            for (int i = 0; i < splitrequestedLine.length; i++) {
                System.out.println(i + 1 + ")" + splitrequestedLine[i]);
            }

            System.out.print("Now Choose Which line you would like to edit: ");

            int selectedEdit = userInput.userInt() - 1;

            removeLine(deleteLine);

            System.out.print("Now what would you like to change " + splitrequestedLine[selectedEdit] + " to?: ");
            splitrequestedLine[selectedEdit] = userInput.userString();

            StringJoiner joiner = new StringJoiner("");
            for (int i = 0; i < splitrequestedLine.length; i++) {
                joiner.add(splitrequestedLine[i]);

                if(i < splitrequestedLine.length - 1)
                  joiner.add(",");
            }
            String Send = joiner.toString();

            writetoFile(Send);
        }
        else{
            System.out.print("Enter a TITLE in the list: ");
            editLine();
        }
    }

    public static String renameFile(File Current) // To rename the file just basically gets the contents saves them removes the file and copies them to a file with the new name they wanted
    {
        System.out.print("What would you like the new file to be called?: ");
        String newfileName = userInput.userString() + ".txt";

        ArrayList<String> SavedElements = getfileContent();

        if (Current.delete()) {
            System.out.println("Deleted the file: " + Current.getName());
            for (int i = 0; i < SavedElements.size(); i++) {
                writetoFile(SavedElements.get(i));
                return "Success";
            }
        } else {
            return "Failed to delete the file";
        }
        return "a";
    }


}
