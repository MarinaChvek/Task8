package com.homework.booklib;

import java.util.Arrays;

public class Book {
    private static int nextId = 1;
    private final int id = nextId++;
    private final String name;
    private final String[] authors; //массив на случай если авторов несколько
    private final String publisher;
    private final int year;
    private final int pages;
    private int price;
    private final String TypeOfBinding;

    public Book(String name, String[] authors, String publisher, int year, int pages, int price, String TypeOfBinding) {
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.TypeOfBinding = TypeOfBinding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getTypeOfBindin() {
        return TypeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + TypeOfBinding+ '\'' +
                '}';
    }
}