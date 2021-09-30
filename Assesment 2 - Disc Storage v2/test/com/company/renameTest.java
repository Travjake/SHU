package com.company;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class renameTest {

    @Test
    public void renamefile()
    {
        fail();
    }

    @Test
    public void correctnameFormat() // test to see if .txt has been added onto the name of the file on return also allows for me to get used to changing a file name to string
    {
        fileEdit edit = new fileEdit();
        File Current = new File("CDStore");
        String Expected = "CDStore.txt";
        String Actual = fileEdit.renameFile(Current);
        assertEquals(Expected,Actual);
    }

    @Test
    public void retrievefileContent()// Checks to see if the files contents are properly collected and store so I can restore this later
    {
        fileEdit edit = new fileEdit();
        File Current = new File("CDStore");
        ArrayList<String> Expected = fileEdit.getfileContent();
        //ArrayList<String> Actual = fileEdit.renameFile(Current);
        //assertEquals(Expected,Actual);
    }

    public void deletablefileTest() // This is to check if the file can be deleted if this is that case it will be done and the string success will be returned else it will say that the fail was unable to be deleted
    { // renameFile first deletes the file before recreating one with a new name but the same contents hence why this is necessary I also changes what the class returns to string to allow for these messages
        fileEdit edit = new fileEdit();
        File Current = new File("CDStore");
        String Expected = "Success"; // Can be changed to "Failed to delete the file" to see if the file in unable to be deleted
        String Actual = fileEdit.renameFile(Current);
        assertEquals(Expected,Actual);
    }
}
