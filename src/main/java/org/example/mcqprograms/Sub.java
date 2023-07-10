package org.example.mcqprograms;

class Super
{
    public int i = 0;

    //A default no-args constructor is not created because there is a constructor
    // supplied that has an argument, line 8 Therefore the sub-class constructor
    // must explicitly make a call to the super class constructor:
//    public Super(String text)
//    {
//        i = 1;
//    }
}

class Sub extends Super
{
    public Sub(String text)
    {
        i = 2;
    }

    public static void main(String args[])
    {
        Sub sub = new Sub("Hello");
        System.out.println(sub.i);
    }
}