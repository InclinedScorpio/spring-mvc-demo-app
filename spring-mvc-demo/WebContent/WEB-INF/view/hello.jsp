<html>
<head>
<title>Hello</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">

<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>

</head>

	<h3 class="red">Hello to you</h3>
	<!-- this username is model's attribute name set in controller -->
	<h5>${username}</h5>
	
	<!--  this param is parameter coming from request ! -->
	<h1>${param.username}</h1>
	
	<img height="100" width="100" src="${pageContext.request.contextPath}/resources/images/carbon.png">

</html>