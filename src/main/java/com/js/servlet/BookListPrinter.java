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
import java.util.ArrayList;
import java.util.List;

public class BookListPrinter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getServletContext().getAttribute("books") == null){
            req.getServletContext().setAttribute("books", BookFactory.getListOfBooks());
        }


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);
    }


}
