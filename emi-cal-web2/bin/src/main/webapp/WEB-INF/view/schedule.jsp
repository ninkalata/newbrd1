<%-- <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 --%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html lang="en">
<head>
<title>Schedule</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<style>
tr:nth-child(even) {background: FFA500}
tr:nth-child(odd) {background: #FFFFFF}
</style>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Moneymatters.com</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a
				href="${pageContext.request.contextPath}/home/emi">Calculate
					Installment</a></li>
			<li class="active"><a
				href="${pageContext.request.contextPath}/home/emi">Repayments
					Schedule</a></li>
			<li class="active"><a
				href="${pageContext.request.contextPath}/home/emi">Component for
					particular installment</a></li>
		</ul>
		<button class="btn btn-danger navbar-btn">Our Products</button>
	</div>
</nav>

<body >
<div id="container" >
		<div id="content">
			<table class="table table-striped">
				<tr>
					<th>Installment Number  </th>
					<th>Outstanding Principal </th>
					<th>Interest Component</th>
					<th>Principal Component</th>
					<th>Emi</th>
				</tr>
				<c:forEach var="tempComponent" items="${components}">				
				<tr>
						<td> ${tempComponent.installmentNO} </td>
						<td> ${tempComponent.outstandingPrincipal} </td>
						<td> ${tempComponent.interestComponent} </td>
						<td> ${tempComponent.principalComponent} </td>
					    <td> ${tempComponent.emi} </td>
					</tr>
					
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>


</body>
</html>
