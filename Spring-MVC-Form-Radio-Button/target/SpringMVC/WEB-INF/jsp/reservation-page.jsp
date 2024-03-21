<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Reservation Form</title>
</head>
<h3>Railway Reservation Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">
First Name:<form:input path="firstName" />
		<br>
		<br>
Last Name:<form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="Submit" />
		<br>
		<br>
Gender :
Male<form:radiobutton path="Gender" value="male" />
Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>
		<input type="submit" value="submit" />
	</form:form>

</body>
</html>