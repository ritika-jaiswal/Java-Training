package org.example.generics;

import org.example.basicprogram.LeapYear;

import java.util.ArrayList;
import java.util.List;

abstract class Person{
    abstract void role();
}
class Employee extends Person{
    public void role(){
        System.out.println("The person is employee in office");
    }
}
class Manager extends Person{
    public void role(){
        System.out.println("The person is manager in the office");
    }
}
public class WildClassInGenerics {
    public static void rolePerson(List<? extends Person> lists){
        for(Person person: lists){
            person.role();
        }
    }

    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee());

        List<Manager> list2 = new ArrayList<>();
        list2.add(new Manager());
        list2.add(new Manager());

        rolePerson(list1);
        rolePerson(list2);
    }
}
