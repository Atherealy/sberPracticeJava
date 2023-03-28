package ru.sber.generics;

import java.util.NoSuchElementException;
public interface Deque<E> extends Collection<E> {

    void addFirst(E item);
    void addLast(E item);
    E getFirst() throws NoSuchElementException;
    E getLast() throws NoSuchElementException;
    E pollFirst();
    E pollLast();
    E removeFirst() throws NoSuchElementException;
    E removeLast() throws NoSuchElementException;
}