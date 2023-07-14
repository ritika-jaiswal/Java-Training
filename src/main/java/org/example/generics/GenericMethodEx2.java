package org.example.generics;

public class GenericMethodEx2 {
    public static <T> T getLastElement(T[] array){
        if(array == null || array.length == 0){
            return null;
        }
        return array[array.length -1];
    }

    public static void main(String[] args) {
        Integer[] numbers = {24,22,20,14};
        Integer lastnumber = GenericMethodEx2.getLastElement(numbers);
        System.out.println("last digit of the array is : " + lastnumber);

        String[] names = {"Mayuri", "Ritika", "Muskan", "Himanshu"};
        String lastname = GenericMethodEx2.getLastElement(names);
        System.out.println("Last name of the string array is: " + lastname);

    }
}
