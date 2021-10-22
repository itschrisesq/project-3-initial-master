package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag <B> implements Container{

        ArrayList<Object> items = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return (items.size() == 0);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(Object item) {
        items.add(item);
    }

    @Override
    public Iterator iterator() {
        return items.iterator();
    }
}