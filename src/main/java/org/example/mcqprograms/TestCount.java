package org.example.mcqprograms;

interface Count
{
    short counter = 0;
    void countUp();
}
public class TestCount implements Count
{
    public static void main(String [] args)
    {
        TestCount t = new TestCount();
        t.countUp();
    }
    public void countUp()
    {
        //The code will not compile because the variable counter is an interface variable
        // that is by default final static. The compiler will complain at line 14 when
        // the code attempts to increment counter.
//        for (int x = 6; x>counter; x--, ++counter) /* Line 14 */
//        {
//            System.out.print(" " + counter);
//        }
    }
}
