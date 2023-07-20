package org.example.javacoreapi.javautillclasses.collection.set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

public class LinkedHashSetExTest {

    private LinkedHashSetEx linkedHashSetEx;

    @BeforeEach
    public void setup() {
        linkedHashSetEx = new LinkedHashSetEx();
    }

    @Test
    public void testLinkedHashSetOperations() {
        // Adding elements to the LinkedHashSet
        linkedHashSetEx.addToLinkedHashSet(10);
        linkedHashSetEx.addToLinkedHashSet(20);
        linkedHashSetEx.addToLinkedHashSet(30);
        linkedHashSetEx.addToLinkedHashSet(40);

        // Checking the size of the LinkedHashSet
        Assertions.assertEquals(4, linkedHashSetEx.getSize());

        // Checking if the LinkedHashSet contains certain elements
        Assertions.assertTrue(linkedHashSetEx.containsElement(20));
        Assertions.assertTrue(linkedHashSetEx.containsElement(40));
        Assertions.assertFalse(linkedHashSetEx.containsElement(60));

        // Removing an element from the LinkedHashSet
        linkedHashSetEx.removeFromLinkedHashSet(40);

        // Checking the size after removal
        Assertions.assertEquals(3, linkedHashSetEx.getSize());

        LinkedHashSet<Integer> linkedHashSet = linkedHashSetEx.getLinkedHashSet();
        Integer[] expectedOrder = {10,20,30};
        int index = 0;
        for (Integer element : linkedHashSet) {
            Assertions.assertEquals(expectedOrder[index++], element);
        }

        linkedHashSetEx.removeFromLinkedHashSet(10);
        linkedHashSetEx.removeFromLinkedHashSet(20);
        linkedHashSetEx.removeFromLinkedHashSet(30);
        Assertions.assertTrue(linkedHashSet.isEmpty());
    }
}
