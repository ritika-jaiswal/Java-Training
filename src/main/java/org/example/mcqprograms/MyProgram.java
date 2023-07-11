package org.example.mcqprograms;

import java.io.*;
public class MyProgram
{
    public static void main(String args[])
    {
        FileOutputStream out = null;
        try
        {
            out = new FileOutputStream("test.txt");
            out.write(122);
        }
        catch(IOException io)
        {
            System.out.println("IO Error.");
        }
        finally
        {
//            out.close();   //due to this line the program fails
        }
    }
}