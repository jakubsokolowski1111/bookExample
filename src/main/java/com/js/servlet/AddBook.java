package com.js.servlet;

import com.js.book.Book;
import com.js.book.BookFactory;
import com.js.book.BooksTypes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AddBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = (List<Book>) req.getServletContext().getAttribute("books");

        BooksTypes booksType;
        if (req.getParameter("type").equals(BooksTypes.ADVENTURE.toString())) {
            booksType = BooksTypes.ADVENTURE;
        } else {
            booksType = BooksTypes.CRIMINAL;
        }
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String ISBN = req.getParameter("ISBN");

        books.add(BookFactory.getBook(booksType,title,author,ISBN));

        req.getServletContext().setAttribute("books",books);

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h2>Adding the book successful</h2>");

        writer.println("<form method=\"GET\" action=\"books\">\n" +
                "<input type=\"submit\" value=\"Show List Of Books.\" />" +
                "</form>");

    }
}
