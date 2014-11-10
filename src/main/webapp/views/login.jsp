<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/kite/j_spring_security_check" method="post">
		username:<input type="text" name="j_username"><br>
		password:<input type="text" name="j_password"><br> 
	
		
		<input type="submit" value="提交" />
	</form>


</body>
</html>