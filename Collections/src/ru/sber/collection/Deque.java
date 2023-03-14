package ru.sber.collection;

import java.util.NoSuchElementException;
public interface Deque extends Collection {

    void addFirst(Object item);

    void addLast(Object item);

    Object getFirst() throws NoSuchElementException;

    Object getLast() throws NoSuchElementException;

    Object pollFirst();

    Object pollLast();

    Object removeFirst() throws NoSuchElementException;

    Object removeLast() throws NoSuchElementException;
}