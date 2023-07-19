package org.example.javacoreapi.javautillclasses;

public class ArraysEx {
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

        System.out.println(min);
    }

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    static int[] get(){
        return new int[]{10,30,50,90,60};
    }
    public static void main(String args[]) {
        System.out.println("Ex-1");
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
//-------------------------------------------------------------------------------------------------------
            System.out.println("Ex-2");
        int b[] = {33, 3, 4, 5};
        for (int i = 0; i < b.length; i++)
            System.out.println(a[i]);
        //---------------------------------------------------------------------------------------
        System.out.println("Ex-3");
        int c[]={33,3,4,5};
        min(c);
//-----------------------------------------------------------------------------------------------
        System.out.println("Ex-4");
        printArray(new int[]{10,22,44,66});//passing anonymous array to method
//------------------------------------------------------------------------------------------------
        System.out.println("Ex-5 : Returnuning array from a method");

        int arr[]=get();
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
//----------------------------------------------------------------------------------------------------

        System.out.println("Ex-6 : multidimensinol array");
        int array[][]={{1,2,3},{2,4,5},{4,4,5}};

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
//------------------------------------------------------------------------------------------------------
        System.out.println("Ex-7 : Copy array ex");
        char[] copyFrom = { 'r','i','t','i','k','a','j','a','i','s','w','a','l' };
        char[] copyTo = new char[6];
        System.arraycopy(copyFrom, 0, copyTo, 0, 6);
        System.out.println(String.valueOf(copyTo));

        }
}
