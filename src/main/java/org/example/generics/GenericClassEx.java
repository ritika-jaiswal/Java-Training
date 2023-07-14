package org.example.generics;

public class GenericClassEx<T> {
    public T content;

    public void setContent(T content){
        this.content = content;
    }
    public T getContent(){
        return content;
    }

    public static void main(String[] args) {
        GenericClassEx<Integer> intGenericClass = new GenericClassEx<>();
        intGenericClass.setContent(22);
        int age = intGenericClass.getContent();

        GenericClassEx<String> stringGenericClass = new GenericClassEx<>();
        stringGenericClass.setContent("Ritika");
        String name = stringGenericClass.getContent();

        System.out.println("Name: " + name + ", Age: " + age);


    }

}
