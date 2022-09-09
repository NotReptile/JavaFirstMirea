package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("SomeAuthor", "SomeBookName", 2001, 545);
        System.out.println("\nBook constructor: \n");
        System.out.println(book);
        book.setBookName("newBookName");
        book.setAuthor("NewAuthor");
        book.setPages(725);
        book.setYear(1998);
        System.out.println("\nBook setters: \n");
        System.out.println(book);
    }
}
