package com.js.book;

import java.util.Objects;

public class CriminalBook implements Book {
    private String title;
    private String author;
    private String ISBN;

    public CriminalBook(String title, String author, String ISBN) {
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
        return "CriminalBook: \n" +
                "title = " + title + '\n' +
                "&nbsp;&nbsp;author = " + author + '\n' +
                "&nbsp;&nbsp;ISBN = " + ISBN ;
    }
}
