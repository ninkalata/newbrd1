<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	<h1>My bank</h1>
	<div id="wrapper">
		<div id="header">
			<h2 style="background-color: Violet;">CUSTOMER TABLE</h2>
		</div>
	</div>

	<div id="container">
		<h3 style="background-color: MediumSeaGreen;">Save Customer</h3>
	
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><font color="blue"><label>Customer Code:</label></font></td>
						<td><form:input path="code" /></td>
					</tr>
					<tr>
						<td><font color="blue"><label>Customer Name:</label></font></td>
						<td><form:input path="customerName" pattern="[a-zA-Z0-9 ]+"
								title="invalid name" /></td>
					</tr>
						<tr>
						<td><font color="blue"><label>Customer Address:</label></font></td>
						<td><form:input path="CustomerAddress" /></td>
					</tr>
<tr>
						<td><font color="blue"><label>Customer Pin Code:</label></font></td>
						<td><form:input path="CustomerPinCode" pattern=".{6}"
								title="Pin code should be 6 digits"/></td>
					</tr>

<tr>
						<td><font color="blue"><label>Customer Email:</label></font></td>
						<td><form:input path="CustomerEmail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
								title="Invalid Email format" /></td>
					</tr>
					<tr>
						<td><font color="blue"><label> Contact Number:</label></font></td>
						<td><form:input path="ContactNumber" /></td>
					</tr>
					
					
<tr>
						<td><font color="blue"><label>Registration Date:</label></font></td>
						<td><form:input path="RegistrationDate" pattern="^([0-2]?\d|3[0-1])-(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)-\d{4}"
							title="invalid date"/></td>
					</tr>
					<tr>
						<td><font color="blue"><label>Created By:</label></font></td>
						<td><form:input path="CreatedBy" /></td>
					</tr>
					<tr>
						<td><font color="blue"><label>Modified Date:</label></font></td>
						<td><form:input path="ModifiedDate" pattern="^([0-2]?\d|3[0-1])-(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)-\d{4}"
							title="invalid date" /></td>
					</tr>
					
					
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
						

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>



