package org.example.generics;

 interface Container<T>{
    void add(T item);
    T get();
}

public class GenericInterface implements Container<Integer>{
    private Integer item;

    @Override
    public void add(Integer item) {
        this.item = item;
    }

    @Override
    public Integer get() {
        return item;
    }
    public static void main(String[] args) {
        GenericInterface gi = new GenericInterface();
        gi.add(42);
       System.out.println(gi.get());
    }

}
