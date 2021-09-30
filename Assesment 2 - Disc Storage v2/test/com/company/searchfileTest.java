package com.company;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class searchfileTest {

    @Test // Red
    public void testfileEdit()
    {
        fail();
    }

    @Test // if searchWords == Legends Never Die return Legends Never Die,Juice WRLD,Hip Hop,03-04-2020,22,58:00,Music
    //This shows that a title can be sent to getbyTitle(); and then can recieve and compare the returning string using the minimum amount of code necessary
    public void testifsameName()
    {
        fileEdit ref = new fileEdit();
        String Expected = "Legends Never Die,Juice WRLD,Hip Hop,03-04-2020,22,58:00,Music";
        String Actual = ref.getbyTitle("Legends Never Die");
        assertEquals(Expected, Actual);
    }

    @Test // This will check whether the string returned is what is wanted in this case of this isn't the case the user will be told that the file doest exist
    //This is done by using a if statement followed by an else statement for if the content doesn't exist in fileEdit in which case it will send back nothing
    public void testiftitleExist()
    {
        fileEdit ref = new fileEdit();
        String Expected = "This File Does not Exist";
        String Actual = ref.getbyTitle("I don't exist");
        assertEquals(Expected, Actual);
    }

    @Test //test for if there is a line in the file starting with the Title in this case "Legends Never Die" but this time expanded to retrieve from the file instead of the method just sending it back
    public void fileretriveTest()
    {
        fileEdit ref = new fileEdit();
        String Expected = "Legends Never Die,Juice WRLD,Hip Hop,03-04-2020,22,58:00,Music";
        String Actual = ref.getbyTitle("Legends Never Die");
        assertEquals(Expected, Actual);
    }
}
