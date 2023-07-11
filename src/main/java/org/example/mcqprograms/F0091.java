package org.example.mcqprograms;

public class F0091
{
    public void main( String[] args )
    {
        System.out.println( "Hello" + args[0] );
    }
}
//    Exception in thread "main" java.lang.NoSuchMethodError: main
//
//        The Java Language Specification clearly states:
//        "The main method must be declared public, static, and void. It must accept a single
//        argument that is an array of strings."