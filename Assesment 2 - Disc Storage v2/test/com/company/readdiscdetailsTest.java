package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class readdiscdetailsTest {

    @Test
    public void renamefile()
    {
        fail();
    }

    @Test
    public void getfileLine() //This Checks to see if a line can be returned from using the bufferedread and filereader and if the return is not equal to nothing than something has been read from the file
    {
        fileEdit edit = new fileEdit();
        //String Line = fileEdit.getfileContent();
        //assertNotSame(Line, null);
    }

    @Test
    public void checktoseeifNull() //This Checks for if the passes back variable becomes null if an empty line is read
    { // if this is the case than I can use a while loop to read until the filereader has reached the bottom of the line
        fileEdit edit = new fileEdit();
        //String Line = fileEdit.getfileContent();
        //assertEquals(Line, "");
    }
}
