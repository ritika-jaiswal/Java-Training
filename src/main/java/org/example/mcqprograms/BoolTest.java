package org.example.mcqprograms;

public class BoolTest
{
    public static void main(String [] args)
    {
        boolean b1 = false;
        boolean b2;
        b2 = b1;
        if (!b2)
        {
            b2 = true;
            System.out.print("x ");
        }
        if (b1 & b2) /* Line 13 */
        {
            System.out.print("y ");
        }
        System.out.println("z");
    }
}
