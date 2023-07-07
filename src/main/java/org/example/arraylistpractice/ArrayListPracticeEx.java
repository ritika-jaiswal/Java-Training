package org.example.arraylistpractice;


import java.util.*;

public class ArrayListPracticeEx {

    public static void main(String[] args) {

        // Create a student list and print using iterator interface:

        // ArrayList<String> students = new ArrayList<String>();
        // students.add("Ritika");
        // students.add("Sajal");
        // students.add("Shivani");
        // students.add("Aman");

        // // for (String string : students) {
        // // System.out.print(string + " ");
        // // }

        // Iterator itr = students.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // }

        // create a student object add the value in object using arraylist and iterate
        // the value of this object using itretor inteface:

        ArrayList<Students> data = new ArrayList<>();
        data.add(new Students(1, "Ritika Jaiswal", 22));
        data.add(new Students(2, "Sajal Jain", 21));
        data.add(new Students(3, "Shivani Rathore", 23));
        data.add(new Students(4, "Aman Jachpure", 23));

        Iterator<Students> studData = data.iterator();
        while (studData.hasNext()) {
            Students students = studData.next();
            System.out.print("Student Id: " + students.id);
            System.out.print("Student Name: " + students.name);
            System.out.println("Student Age: " + students.age);
        }

        // for (Students students : data) {
        // System.out.println("Id: " + students.id + " name: " + students.name + " Age:
        // " + students.age);
        // }

    }
}

class Students {
    public int id;
    public String name;
    public int age;

    public Students(int i, String n, int a) {
        id = i;
        name = n;
        age = a;

    }
    // public void printData(){
    // System.out.println("Id\tName\tAge");
    // System.out.println(id + "\t "+ name + "\t" + age);
    // }
}

// import java.util.ArrayList;

// public class ArrayListPractice {
// public static void main(String args[]) {
// ArrayList<Book> arrayOfBooks = new ArrayList<>();
// arrayOfBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", 3));
// arrayOfBooks.add(new Book("1984", "George Orwell", 4));
// arrayOfBooks.add(new Book("Harry Potter and the Philosopher's Stone", "J.K.
// Rowling", 4));
// arrayOfBooks.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 4.5));

// for (Book book : arrayOfBooks) {
// System.out
// .println("BookTitle: " + book.bookName + ", by" + book.author + "with a
// rating of " + book.rating);
// }
// }
// }

// class Book {
// String bookName;
// String author;
// double rating;

// Book(String bookName, String author, double rating) {
// this.bookName = bookName;
// this.author = author;
// this.rating = rating;

// }
// }
