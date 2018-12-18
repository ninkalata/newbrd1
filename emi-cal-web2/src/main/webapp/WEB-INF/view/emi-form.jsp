<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<!-- 
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<div id="nav-placeholder"></div>
<script src="simple-slider.js"></script>
<link href="simple-slider.css" rel="stylesheet" type="text/css" />

 -->
<!--  <script>
$(function(){
  $("#nav-placeholder").load("page.jsp");
});
</script>-->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	</head>
<body>

	<div id="wrapper">
		<div id="header"></div>
	</div>

	<div id="container">



		<form:form action="saveEmi" modelAttribute="emi" method="POST">

			<table>
				<tbody>

					<tr>
						<td><label>Loan Amount :</label></td>
						<td><form:input path="loanamount"/></td>
					</tr>
					<tr>
						<td><label>Rate of Interest :</label></td>
						<td><form:input path="rateofinterest" /></td>
					</tr>
					<tr>
						<td><label>Tenure:</label></td>
						<td><form:input path="tenure" /></td>
					</tr>

					<tr>
						<td><label>NoofInstallments :</label></td>
						<td><form:input path="noofinstallments" /></td>
					</tr>






					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>



				</tbody>
			</table>


		</form:form>

	</div>


</body>

</html>



