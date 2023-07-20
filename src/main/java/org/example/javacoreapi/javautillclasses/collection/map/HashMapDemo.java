package org.example.javacoreapi.javautillclasses.collection.map;

import java.util.HashMap;

public class HashMapDemo {
    private HashMap<String, Integer> myHashMap;

    public HashMapDemo() {
        myHashMap = new HashMap<>();
    }

    public void addToHashMap(String key, int value) {
        myHashMap.put(key, value);
    }

    public void removeFromHashMap(String key) {
        myHashMap.remove(key);
    }

    public boolean containsKey(String key) {
        return myHashMap.containsKey(key);
    }

    public boolean containsValue(int value) {
        return myHashMap.containsValue(value);
    }

    public int getSize() {
        return myHashMap.size();
    }

    public boolean isEmpty() {
        return myHashMap.isEmpty();
    }

    public HashMap<String, Integer> getHashMap() {
        return myHashMap;
    }
}
