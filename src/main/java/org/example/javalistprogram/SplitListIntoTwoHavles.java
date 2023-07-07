package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.List;

// First Way
// public class SplitListIntoTwoHavles {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>();
//         list.add(29);
//         list.add(10);
//         list.add(45);
//         list.add(5);
//         list.add(56);
//         list.add(34);
//         int len = list.size();
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();
//         for (int i = 0; i < len / 2; i++) {
//             list1.add(list.get(i));
//         }
//         for (int j = len / 2; j < len; j++) {
//             list2.add(list.get(j));
//         }
//         System.out.println("Original list: " + list);
//         System.out.println("First Halves of List: " + list1);
//         System.out.println("Second Halves of List: " + list2);

//     }
// }

// Second Way
public class SplitListIntoTwoHavles {
    public static List[] split(List<Integer> strList) {
        int size = strList.size();
        List<Integer> frstList = new ArrayList<>(strList.subList(0, size / 2));
        List<Integer> scndList = new ArrayList<>(strList.subList(size / 2, size));
        return new List[] { frstList, scndList };
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(10);
        list.add(45);
        list.add(5);
        list.add(56);
        list.add(34);
        System.out.println("Original List: " + list);
        List[] lists = split(list);
        System.out.println("First Halves: " + lists[0]);
        System.out.println("Second Halves: " + lists[1]);
    }
}
