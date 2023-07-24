package org.example.javacoreapi.javautillclasses.collection.map;

import org.example.javacoreapi.javautillclasses.collection.set.HashSetDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class HashMapMCQClientInterface {

    private HashMapDemo hashMapDemo;

    @BeforeEach
    public void setup() {
        hashMapDemo = new HashMapDemo();
    }

    @Test
    public void testHashMapOperations() {
        // Adding elements to the HashMap
        hashMapDemo.addToHashMap("Wednesday Adam", 1);
        hashMapDemo.addToHashMap("Stranger Things", 2);
        hashMapDemo.addToHashMap("Squed Little", 3);
        hashMapDemo.addToHashMap("Money Hoiest", 4);

        // Checking the size of the HashMap
        Assertions.assertEquals(4, hashMapDemo.getSize());

        // Checking if the HashMap contains certain keys and values
        Assertions.assertTrue(hashMapDemo.containsKey("Wednesday Adam"));
        Assertions.assertTrue(hashMapDemo.containsKey("Stranger Things"));
        Assertions.assertFalse(hashMapDemo.containsKey("Little Things"));
        Assertions.assertTrue(hashMapDemo.containsValue(1));
        Assertions.assertTrue(hashMapDemo.containsValue(4));
        Assertions.assertFalse(hashMapDemo.containsValue(10));

        // Removing an element from the HashMap
        hashMapDemo.removeFromHashMap("Money Hoiest");

        // Checking the size after removal
        Assertions.assertEquals(3, hashMapDemo.getSize());

        // Checking the values associated with certain keys
        HashMap<String, Integer> hashMap = hashMapDemo.getHashMap();
        Assertions.assertEquals(1, hashMap.get("Wednesday Adam"));
        Assertions.assertEquals(3, hashMap.get("Squed Little"));
        Assertions.assertNull(hashMap.get("Money Hoiest"));

        // Checking if the HashMap is empty after removing all elements
        hashMapDemo.removeFromHashMap("Wednesday Adam");
        hashMapDemo.removeFromHashMap("Stranger Things");
        hashMapDemo.removeFromHashMap("Squed Little");
        Assertions.assertTrue(hashMapDemo.isEmpty());
    }
}
