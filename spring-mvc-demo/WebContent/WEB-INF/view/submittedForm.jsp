<%@ taglib 	uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Welcome</title>
</head>
<body>
	<h2>Welcome</h2>
	<br/>
	<h3>Hey! ${ student.firstName} ${ student.lastName }</h3>
	<br/>
	<h2>Country: ${student.country}</h2>
	<br/>
	<!--  Calls student.getFavouriteLang() -->
	<h3>Favourite Language Choosen : ${student.favouriteLang}</h3>
	<br/><br>
	<h2>OS Selected</h2>
	<ul>
	<c:forEach var="os" items="${student.operatingSystems}">
	<li> ${os} </li>
	</c:forEach>
	</ul>
</body>
</html>