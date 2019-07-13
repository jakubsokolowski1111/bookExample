package com.js.book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {



    public static Book getBook(BooksTypes type, String title, String author, String ISBN) {
        if ("CRIMINAL".equals(type.name())) {
            return new CriminalBook(title, author, ISBN);
        } else if ("ADVENTURE".equals(type.name())) {
            return new AdventureBook(title, author, ISBN);
        }

        return null;
    }

    public static List<Book> getListOfBooks(){
        List<Book> list = new ArrayList<>();
        list.add(getBook(BooksTypes.ADVENTURE, "Chatka Puchatka", "pisarzyna",
                "asdangr7123912"));
        list.add(getBook(BooksTypes.ADVENTURE, "Przygody Ludwiczka", "bazgrała",
                "asdangr71234912"));
        list.add(getBook(BooksTypes.ADVENTURE, "W linii prostej", "literacik",
                "aksd12931"));
        list.add(getBook(BooksTypes.ADVENTURE, "Pan mercedes", "gryzipiórek",
                "1238fsja"));
        list.add(getBook(BooksTypes.ADVENTURE, "Gringo wśród dzikich plemion", "literacina",
                "laiwnx81028"));

        return list;
    }


}
