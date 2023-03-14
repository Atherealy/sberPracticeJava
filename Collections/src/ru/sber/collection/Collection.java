package ru.sber.collection;

public interface Collection extends Iterable<Object>{
    int size();

    boolean isEmpty();

    boolean contains(Object item);

    boolean add(Object item);

    boolean remove(Object item);

    void clear();
}
