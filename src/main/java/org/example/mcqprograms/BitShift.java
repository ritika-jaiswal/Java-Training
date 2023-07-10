package org.example.mcqprograms;

class BitShift
{
    public static int bitShiftOp(int x)
    {
//        int x = 0x80000000;
//        System.out.print(x + " and  ");
        x = x >>> 31;
        System.out.println(x);
        return x;
    }
}