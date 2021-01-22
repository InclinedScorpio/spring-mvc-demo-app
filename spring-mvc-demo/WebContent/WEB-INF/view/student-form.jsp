<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Student Form</title>
</head>

	<h2>Hey, this is Student Form</h2>
	<br>
	
	<form:form action="submitForm" modelAttribute="student">
		FirstName: <form:input type="text" path="firstName" />
		<br/><br/>
		LastName: <form:input type="text" path="lastName" />
		
		<input type="submit" value="submit" />
		<br/><br/>
		
		<!-- 
		<form:select path="country">
			<form:option value="India" label="India" />
			<form:option value="Pakistan" label="Pakistan" />
			<form:option value="Usa" label="Usa" />
		</form:select>  
		-->
		
		<!-- Behind the scene student.getCountries_list() is called -->
		<form:select path="country">
			<!-- <form:options items="${student.countries_list}" />	-->
			<form:options items="${countriesList}" />	
		</form:select>	
		</form:form>

</html>