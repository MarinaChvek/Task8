package com.homework.booklib;
import java.util.ArrayList;
import java.util.List;

public class UserOfBooks {
    public static void main(String[] args) {
        /*
        создаем массив объектов
         */
        List<Book> list=new ArrayList<>();
        String[] authorsBook1 ={"Bruce Eckel"} ; //слудет создать массив для имен авторов, на случай если авторов несколько
        list.add( new Book("Thinking in Java", authorsBook1,"USA Publishing", 1997, 700, 300, "limp"));

        String[] authorBook2 = {"Bruce Eckel"};
        list.add(new Book("Java OPP", authorBook2, "PrintCenterUA", 2001, 200, 120, "hard"));

        String[] authorBook3 = {"Garry Kornel", "Bruce Eckel", "И кто-то там еще"};
         list.add(new Book("Java", authorBook3, "Reader's Digest", 2007, 288, 198, "hard"));

        System.out.println("Bruce Eckel's book " + booksOfAuthor("Bruce Eckel", list));
        System.out.println("Book by USA Publishing: " + booksOfPublisher("USA Publishing", list));
        System.out.println("Book after 2009: " + booksAfterYear(2001, list));



    }

    public static List<Book> booksOfAuthor(String author, List<Book> list) {
        List<Book> result = new ArrayList<>();

        for (Book book : list) {
            for (String authorBook : book.getAuthors()) {
                if (author.equals(authorBook)) {
                    result.add(book);
                }
            }
        }

        return result;
    }

    public static List<Book> booksOfPublisher(String publisher, List<Book> list) {
        List<Book> result = new ArrayList<>();

        for (Book book : list) {
            if (publisher.equals(book.getPublisher())) {
                result.add(book);
            }
        }

        return result;
    }

    public static List<Book> booksAfterYear(int year, List<Book> list) {
        List<Book> result = new ArrayList<>();

        for (Book book : list) {
            if (year < book.getYear()) {
                result.add(book);
            }
        }

        return result;
    }
}