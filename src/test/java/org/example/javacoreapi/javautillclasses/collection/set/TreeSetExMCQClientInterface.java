package org.example.javacoreapi.javautillclasses.collection.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.TreeSet;

public class TreeSetExMCQClientInterface {

    private TreeSetEx treeSetEx;

    @BeforeEach
    public void setup() {
        treeSetEx = new TreeSetEx();
    }

    @Test
    public void testTreeSetEx() {
        treeSetEx.addToTreeSet(5);
        treeSetEx.addToTreeSet(2);
        treeSetEx.addToTreeSet(8);
        treeSetEx.addToTreeSet(1);
        treeSetEx.addToTreeSet(6);

        Assertions.assertEquals(5, treeSetEx.getSize());

        Assertions.assertTrue(treeSetEx.containsElement(5));
        Assertions.assertTrue(treeSetEx.containsElement(2));
        Assertions.assertFalse(treeSetEx.containsElement(10));

        treeSetEx.removeFromTreeSet(2);

        Assertions.assertEquals(4, treeSetEx.getSize());

        TreeSet<Integer> treeSet = treeSetEx.getTreeSet();
        Integer[] expectedOrder = {1, 5, 6, 8};
        int index = 0;
        for (Integer element : treeSet) {
            Assertions.assertEquals(expectedOrder[index++], element);
        }

        treeSetEx.removeFromTreeSet(1);
        treeSetEx.removeFromTreeSet(5);
        treeSetEx.removeFromTreeSet(6);
        treeSetEx.removeFromTreeSet(8);
        Assertions.assertTrue(treeSetEx.isEmpty());
    }
}
