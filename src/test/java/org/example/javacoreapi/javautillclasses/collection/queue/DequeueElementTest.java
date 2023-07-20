package org.example.javacoreapi.javautillclasses.collection.queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DequeueTest {

    private Dequeue<Integer> dequeue;

    @BeforeEach
    public void setup() {
        dequeue = new Dequeue<>();
    }

    @Test
    public void testDequeueOperations() {

        dequeue.addFirst(1);
        dequeue.addLast(2);
        dequeue.addFirst(3);
        dequeue.addLast(4);


        Assertions.assertEquals(4, dequeue.size());

        Assertions.assertEquals(3, dequeue.peekFirst());

        Assertions.assertEquals(4, dequeue.peekLast());

        Assertions.assertEquals(3, dequeue.removeFirst());
        Assertions.assertEquals(4, dequeue.removeLast());

        Assertions.assertEquals(2, dequeue.size());

        Assertions.assertFalse(dequeue.isEmpty());

        dequeue.removeFirst();
        dequeue.removeLast();

        Assertions.assertTrue(dequeue.isEmpty());
    }
}
