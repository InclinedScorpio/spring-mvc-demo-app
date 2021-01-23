<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Customer</title>
<style>
	.red{
		color: red;
	}

</style>
</head>
<body>
	<h2>This is Customer Form</h2>
	
	<!-- ModelAttribute>comes in model, path>the fields inside -->
	<form:form modelAttribute="customer" action="submit">
		First Name : <form:input path="firstName" type="text" />
		
		<br/><br/>
		
		Last Name: <form:input path="lastName" type="text"/>
		<form:errors path="lastName" cssClass="red" />
		
		<br/>
		tickets: <form:input path="tickets" /> 
		<form:errors path="tickets" cssClass="red" />
		
		<br/>
		
		Postal Code: <form:input type="text" path="postalCode" />
		<form:errors path="postalCode" cssClass="red" />
		
		<br/>
		<form:button type="submit">Submit</form:button>
	</form:form>
	
</body>
</html>