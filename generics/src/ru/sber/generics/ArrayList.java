package ru.sber.generics;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayList<E> implements List<E> {

    private static class Iterator<T> implements java.util.Iterator<T> {

        private final ArrayList<T> list;

        private int currentIndex = 0;

        public Iterator(ArrayList<T> list) {
            this.list = list;
        }

        public boolean hasNext() {
            return currentIndex < list.size();
        }

        public T next() throws NoSuchElementException {
            if (hasNext()) {
                return list.get(currentIndex++);
            }

            throw new NoSuchElementException();
        }
    }

    private static final int listSize = 10;

    private Object[] data;

    private int size = 0;

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Индекс вышел за границы списка");
        }
    }

    private ArrayList(E[] data, int size) {
        this.data = data;
        this.size = size;
    }

    public ArrayList() {

        this.data = new Object[listSize];
    }

    public int size() {

        return this.size;
    }

    public boolean isEmpty() {

        return this.size == 0;
    }

    public boolean remove(E item) {

        return false;
    }

    public boolean contains(E item) {

        return indexOf(item) >= 0;
    }

    public boolean add(E item) {
        if (this.size + 1 >= this.data.length) {
            Object[] newData = new Object[((this.size + 1) * 3) / 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, this.data.length);
            this.data = newData;
        }

        this.data[this.size++] = item;
        return true;
    }

    public boolean remove(E item) {
        int previousSize = this.size;
        int index = indexOf(item);

        while (index != -1) {
            removeAt(index);
            index = indexOf(item);
        }

        return this.size == previousSize;
    }

    public void clear() {
        this.data = new Object[listSize];
        this.size = 0;
    }

    public void add(int index, E item) {
        if (index == this.size) {
            add(item);
            return;
        }

        if (index > this.size) {
            return;
        }

        Object[] oldArray = this.data;

        if (this.size + 1 >= this.data.length) {
            Object[] newData = new Object[((this.size + 1) * 3) / 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, index);
            this.data = newData;
        }

        System.arraycopy(oldArray, index, this.data, index + 1, this.size - index);
        this.data[index] = item;
        this.size++;
    }

    public void set(int index, E item) {
        if (index == this.size) {
            add(item);
        } else if (index < this.size) {
            this.data[index] = item;
        }
    }

    public E get(int index) throws IndexOutOfBoundsException {
        checkIndex(index);

        return (E) this.data[index];
    }

    public int indexOf(E item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < this.size; i++) {
            if (Objects.equals(this.data[i], item)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(E item) {
        if (item == null) {
            return -1;
        }

        for (int i = this.size - 1; i >= 0; i--) {
            if (this.data[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public E removeAt(int index) throws IndexOutOfBoundsException {
        checkIndex(index);

        E objectToReturn = (E) this.data[index];
        this.data[index] = null;
        System.arraycopy(this.data, index + 1, this.data, index, this.size - index);
        this.size--;

        return objectToReturn;
    }


    public List<E> subList(int from, int to) throws IndexOutOfBoundsException {
        checkIndex(from);
        checkIndex(to);

        int sizeToCopy = to - from;
        Object[] newSublist = new Object[Math.min(sizeToCopy, 10)];
        System.arraycopy(this.data, from, newSublist, 0, sizeToCopy);

        return new ArrayList<>((E[]) newSublist, to - from);
    }

    public Iterator<E> iterator() {

        return new Iterator<>(this);
    }

}
