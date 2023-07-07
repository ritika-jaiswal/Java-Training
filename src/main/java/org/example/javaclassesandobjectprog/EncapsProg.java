package org.example.javaclassesandobjectprog;


class Humans {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsProg {
    public static void main(String[] args) {
        Humans humans = new Humans();
        humans.setName("Ritika");
        humans.setAge(22);

        System.out.println(humans.getName());
        System.out.println(humans.getAge());
    }

}
