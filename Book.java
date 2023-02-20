package ru.sber.oop1;

public class Book {

    private Author author;
    private String name;
    private int year;

    public Book(String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("Книга под названием \"%s\", выпущенная %s в %d году.\n", name, author, year);
    }
}

