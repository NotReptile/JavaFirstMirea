package ru.mirea.task2;

public class Book {
    private String name;
    private int pages;
    public String toString(){
        return "Book name is " + name + "\nNumber of pages = " + pages;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
