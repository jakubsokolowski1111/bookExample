<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ page import="java.util.List, com.js.book.Book"%>

<html>
<body>

<form method="POST" action="addbook">
  <select name="type">
    <option value="ADVENTURE">ADVENTURE</option>
    <option value="CRIMINAL">CRIMINAL</option>
  </select>
	<input type="text" name="title" placeholder="Title"/>
	<input type="text" name="author" placeholder="Author"/>
	<input type="text" name="ISBN" placeholder="ISBN"/>
	<input type="submit" value="Add" />
</form>

<br/>
<br/>

<form method="GET" action="logout">
	<input type="submit" value="Logout" />
</form>

</body>
</html>
