<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<!-- 
Refresh page every 5 seconds -->
<script type="text/javascript">
  setInterval("my_function();",10000); 
 
    function my_function(){
        window.location = location.href;
    }
</script>
<div id="nav-placeholder">

</div>
<script src="simple-slider.js"></script>
<link href="simple-slider.css" rel="stylesheet" type="text/css" />

<script>
$(function(){
  $("#nav-placeholder").load("page.jsp");
});
</script>
<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2> EMI</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

		
  <input class="form-control" id="myInput" type="text" placeholder="Search..">
<br>
			<!--  add our html table here -->
 <table  class="table table-bordered table-striped">
			
				<tr>
					<th bgcolor="gray">Payment No</th>
					<th bgcolor="gray">Outstanding Principal</th>
					<th bgcolor="gray">Interest Rate </th>
					<th bgcolor="gray">Principal </th>
					<th bgcolor="gray">emi </th>
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempEmi" items="${emis}">

					
					<tr>
						<td> ${tempEmi.paymentno} </td>
						<td> ${tempEmi.outstandingprincipal} </td>
						<td> ${tempEmi.interestrate} </td>
						<td> ${tempEmi.principalcomponent} </td>
						<td> ${tempEmi.emi} </td>
						

						
					</tr>

				</c:forEach>

			</table>

		</div>

	</div>


</body>

</html>









