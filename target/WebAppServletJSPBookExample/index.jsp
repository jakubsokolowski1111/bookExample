<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ page import="java.util.List, com.js.book.Book"%>

<html>
<body>
<h2>Books: </h2>

<%
    List<Book> books = (List<Book>) application.getAttribute("books");
%>

<p>
    <% for(Book b : books){%>
        <li><%= b%> </li>
    <%}%>
</p>

<br/>
<br/>

<form method="GET" action="addbook.jsp">
	<input type="submit" value="Add Book" />
</form>




</body>
</html>
