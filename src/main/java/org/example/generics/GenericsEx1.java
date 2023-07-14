package org.example.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsEx1 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ritika");
        list.add("jaiswal");
      //list.add(32);//compile time error

        String s = list.get(0);//type casting is not required
        System.out.println("First name is: "+s);

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
