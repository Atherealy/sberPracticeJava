package ru.sber.stream;

public class StreamContainer {
    public String name;

    public int count;


    public StreamContainer(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return name + " | " + count;
    }

}

