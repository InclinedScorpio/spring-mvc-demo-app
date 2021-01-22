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
		
		<br/><br/>
		
		<h4>Your favourite Langage</h4>
		<!-- Calls student.setFavouriteLang(....) when submitted -->
		<!--
		Java :	<form:radiobutton path="favouriteLang" value="Java" />
		C++ : 	<form:radiobutton path="favouriteLang" value="C++" />
		C :		<form:radiobutton path="favouriteLang" value="C" />
		JS :	<form:radiobutton path="favouriteLang" value="JS" />   
		-->
		
		<form:radiobuttons path="favouriteLang" items="${student.languagesList}" />
		
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
		
		<h2>OS - Worked With :</h2>
		Linux : <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS : <form:checkbox path="operatingSystems" value="MacOS" />
		Windows : <form:checkbox path="operatingSystems" value="Windows" />
		Kali : <form:checkbox path="operatingSystems" value="Kali" />
		
		<input type="submit" value="submit" />
		
		</form:form>

</html>