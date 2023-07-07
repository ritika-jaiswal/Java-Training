package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InitilizingListProg {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>() {
            {
                add(28);
                add(89);
                add(29);
            }
        };

        List<Integer> num1 = new ArrayList<>() {
            {
                add(19);
                add(67);
                add(39);
            }
        };

        List<Integer> num2 = new Stack<>() {
            {
                add(10);
                add(20);
                add(30);
            }
        };
        System.out.println("ArrayList: " + num);
        System.out.println("LinkedList: " + num1);
        System.out.println("Stack: " + num2);
    }

}

