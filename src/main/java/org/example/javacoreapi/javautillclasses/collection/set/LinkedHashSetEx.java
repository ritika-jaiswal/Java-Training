package org.example.javacoreapi.javautillclasses.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    private LinkedHashSet<Integer> linkedHashSet;

    public LinkedHashSetEx(){
        linkedHashSet = new LinkedHashSet<>();
    }

    public void addToLinkedHashSet(Integer element) {
        linkedHashSet.add(element);
    }

    public void removeFromLinkedHashSet(Integer element) {
        linkedHashSet.remove(element);
    }

    public boolean containsElement(Integer element) {
        return linkedHashSet.contains(element);
    }

    public int getSize() {
        return linkedHashSet.size();
    }

    public boolean isEmpty() {
        return linkedHashSet.isEmpty();
    }

    public LinkedHashSet<Integer> getLinkedHashSet() {
        return linkedHashSet;
    }
}
