package org.example.javacoreapi.javautillclasses.collection.set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashSetDemoTest {

    private HashSetDemo hashSetDemo;

    @BeforeEach
    public void setup() {
        hashSetDemo = new HashSetDemo();
    }

    @Test
    public void testHashSetOperations() {

        hashSetDemo.addToHashSet("Alvine");
        hashSetDemo.addToHashSet("Devine");
        hashSetDemo.addToHashSet("Jorjs");
        hashSetDemo.addToHashSet("Anni");

        Assertions.assertEquals(4, hashSetDemo.getSize());

        Assertions.assertTrue(hashSetDemo.containsElement("Alvine"));
        Assertions.assertTrue(hashSetDemo.containsElement("Anni"));
        Assertions.assertFalse(hashSetDemo.containsElement("Kelvin"));


        hashSetDemo.removeFromHashSet("Jorjs");

        Assertions.assertEquals(3, hashSetDemo.getSize());

        hashSetDemo.removeFromHashSet("Alvine");
        hashSetDemo.removeFromHashSet("Anni");
        hashSetDemo.removeFromHashSet("Devine");
        Assertions.assertTrue(hashSetDemo.isEmpty());
    }
}
