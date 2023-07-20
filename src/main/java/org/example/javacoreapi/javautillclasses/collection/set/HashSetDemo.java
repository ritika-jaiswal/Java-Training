package org.example.javacoreapi.javautillclasses.collection.set;
import java.util.HashSet;

public class HashSetDemo {
    private HashSet<String> myHashSet;

    public HashSetDemo() {
        myHashSet = new HashSet<>();
    }

    public void addToHashSet(String element) {
        myHashSet.add(element);
    }

    public void removeFromHashSet(String element) {
        myHashSet.remove(element);
    }

    public boolean containsElement(String element) {
        return myHashSet.contains(element);
    }

    public int getSize() {
        return myHashSet.size();
    }

    public boolean isEmpty() {
        return myHashSet.isEmpty();
    }
}
