package org.example.inheritance;


public class AggregationProgram {
    int id;
    String name;
    Address address;

    public AggregationProgram(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("indore", "MP", "india");
        Address address2 = new Address("Maheshwar", "MP", "india");

        AggregationProgram aggregationPrac = new AggregationProgram(101, "Ritika", address1);
        AggregationProgram aggregationPrac2 = new AggregationProgram(102, "Vaishnavi", address2);

        aggregationPrac.display();
        aggregationPrac2.display();
    }

}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;

    }
}
