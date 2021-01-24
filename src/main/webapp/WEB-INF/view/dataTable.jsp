<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
       <!--   https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css -->
  <link href="${pageContext.request.contextPath}/resources/css/datatable.css" rel="stylesheet" media="all">
<script>
function deleteid(){
	alert();
}

</script>
</head>
<body>
<h1 align="center">${massage}</h1>
<table id="dt-select" class="table table-striped table-bordered" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th>Name</th>
      <th>Last-Name</th>
      <th>Company</th>
      <th>Number</th>
      <th>Subject</th>
      <th>AreaCode</th>
      <th>DateOfBirth</th>
      <th>UserName</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tfoot>
  <c:forEach items="${welcomeMsg}" var="welcomeMsg">
    <tr>
      <th>${welcomeMsg.first_name}</th>
       <th>${welcomeMsg.last_name}</th>
        <th>${welcomeMsg.company}</th>
         <th>${welcomeMsg.number}</th>
         <th>${welcomeMsg.subject}</th>
         <th>${welcomeMsg.area_code}</th>
          <th>${welcomeMsg.dateOfBirth}</th>
         <th>${welcomeMsg.userName}</th>
        <%--  <th><a      href="usrDid/${welcomeMsg.id}" >Delete</a></th> --%>
      <th onclick="deleteid();">Delete</a></th>
    </tr>
   </c:forEach>
  </tfoot>
</table>
</body>
</html>