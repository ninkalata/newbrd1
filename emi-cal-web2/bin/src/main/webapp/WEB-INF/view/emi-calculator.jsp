<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Calculator</title>
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
input {
	width: 250px;
	border: 1px solid #666; 
	border-radius: 5px; 
	padding: 4px; 
	font-size: 16px;
}
body {
  background-color: #F2F4DB;
}
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

<body>
	<div class="container" >

		<form:form action="calculate" modelAttribute="emiParam"   method="POST">
			<table>
				<tbody>
					<tr>
						<td><label>Principal</label></td>
						<td><form:input path="principal"  pattern="(5000000.0|5000000|([1-4][0-9][0-9][0-9][0-9][0-9][0-9].[0-9])|([1-9][0-9][0-9][0-9][0-9][0-9].[0-9])|([1-9][0-9][0-9][0-9][0-9].[0-9])|([1-9][0-9][0-9][0-9].[0-9])|([1-9][0-9][0-9].[0-9])|([1-9][0-9].[0-9])|[1-9].[0-9])" title="please enter values between '1' and '5000000.'"/></td>
 						<td><form:errors path="principal" class="error" /></td>
 						
					</tr>
					<tr>
						<td><label>Rate Of Interest(in percentage)</label></td>
						<td><form:input path="rateOfInterest" pattern="(120.0|120|([0-1][0-1][0-9])|([1-9][0-9])|([1-9])|([0-1][0-1][0-9].[0-9])|([1-9][0-9].[0-9])|([1-9].[0-9])"  title="please enter the value between '1' and '120'"/></td>
					</tr>
					<tr>
						<td><label>Period (in months)</label></td>
						<td><form:input path="periodInMonths" pattern="(120|([0-1][0-1][0-9])|([1-9][0-9])|[1-9])" title="we are providing services from 1 month upto 120 months only." /></td>
<!-- 					  <td align="left"><form:errors path="periodInMonths" cssClass="error"/></td>
 -->						
					</tr>
					<tr>
						<td><label>No Of Installments(per year)</label></td>
						<td><form:input path="noOfInstallments" required="" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Calculate Emi" class="btn btn-success" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td></td>
					</tr>
					<tr>
						<td><label>Emi</label></td>
						<td><form:input path="emi" required="" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td>
							<button class="btn btn-info"
							formaction="schedule">View Repayment Schedule</button>
						</td>
					</tr>
					<tr>
						<td><label></label></td>
						<td></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td></td>
					</tr>
					<tr>
						<td><label>Installment No:</label></td>
						<td><form:input path="breakup" required="" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><button  class="btn btn-primary" 
						formaction="breakschedule">Components
								for particular installment</button></td>
			            <td><form:errors path="principal" class="error" /></td>
								
					</tr>

				</tbody>
			</table>


		</form:form>

	</div>



</body>
</html>
