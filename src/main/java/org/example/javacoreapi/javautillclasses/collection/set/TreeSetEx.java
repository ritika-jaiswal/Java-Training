package org.example.javacoreapi.javautillclasses.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
    private TreeSet<Integer> myTreeSet;

    public TreeSetEx() {
        myTreeSet = new TreeSet<>();
    }

    public void addToTreeSet(int element) {
        myTreeSet.add(element);
    }

    public void removeFromTreeSet(int element) {
        myTreeSet.remove(element);
    }

    public boolean containsElement(int element) {
        return myTreeSet.contains(element);
    }

    public int getSize() {
        return myTreeSet.size();
    }

    public boolean isEmpty() {
        return myTreeSet.isEmpty();
    }

    public TreeSet<Integer> getTreeSet() {
        return myTreeSet;
    }
}

