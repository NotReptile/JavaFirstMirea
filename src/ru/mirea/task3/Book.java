package ru.mirea.task3;

public class Book {
    public String author;
    public String bookName;
    public int year;
    public int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String author, String bookName, int year, int pages) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
        this.pages = pages;
    }

    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
