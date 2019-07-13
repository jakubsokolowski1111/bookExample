package com.js.book;

public class AdventureBook implements Book{
    private String title;
    private String author;
    private String ISBN;

    public AdventureBook(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String getISBN() {
        return null;
    }

    @Override
    public String toString() {
        return "AdventureBook: \n" +
                "title = " + title + '\n' +
                "&nbsp;&nbsp;&nbsp;author = " + author + '\n' +
                "&nbsp;&nbsp;&nbsp;ISBN = " + ISBN ;
    }
}
