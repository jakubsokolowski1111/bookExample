<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>

<html>
<body>


<form method="POST" action="j_security_check">
	<input type="text" name="j_username" placeholder="Login"/>
	<input type="password" name="j_password" placeholder="Password"/>
	<input type="submit" value="LOGIN" />
</form>

<br/>
<br/>

<form method="GET" action="books">
	<input type="submit" value="Show list of books." />
</form>

</body>
</html>