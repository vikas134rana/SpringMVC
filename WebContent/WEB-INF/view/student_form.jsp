<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		FirstName: <form:input path="firstName" />
		<br>
		<br>
		LastName:  <form:input path="lastName" />
		<br>
		<br>
		
		Country: <form:select path="country">

			<form:options items="${student.countryMap}" />

		</form:select><br><br>
		
		City: <form:select path="city">

			<form:options items="${cityMap}" />

		</form:select><br><br>
		
		Favorite Languages: <br>
		Java <form:radiobutton path="favLanguage" value="Java"/>
		C++ <form:radiobutton path="favLanguage" value="C++"/>
		PHP <form:radiobutton path="favLanguage" value="PHP"/>
		Python <form:radiobutton path="favLanguage" value="Python"/><br><br>
		
		Known OS: <br>
		Windows <form:checkbox path="osList" value="Windows"/>
		MAC <form:checkbox path="osList" value="MAC"/>
		Linux <form:checkbox path="osList" value="Linux"/>
		Other <form:checkbox path="osList" value="Other"/>
		
		<br>
		<br>

		<input type="submit" />
	</form:form>

</body>
</html>