<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="req" value="${pageContext.request}" />
   <c:set var="baseURL" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
       <!--   https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css -->
  <link href="${pageContext.request.contextPath}/resources/css/datatable.css" rel="stylesheet" media="all">
<script>
function deleteid(id){
	var uid=id.split(" ");
	document.WF_MAIN_FORM.WF_mode.value=id;
	document.WF_MAIN_FORM.method='get';
 /* 	document.WF_MAIN_FORM.action=${baseURL}/usrDid/id; */
     window.location.href = '${baseURL}/Pdf/'+uid;
	alert("value delet")
	return false;
}

function viewPdf(nefilename) 
{
	       var docLocation='';
	       docLocation = '';
	    /*    window.open(docLocation,"resizeable,scrollbar"); */ 
	      
	   
}
 </script>
 
 <%
 String mode = null;
String  strCertIssuer = null;
 %>
 
 
</head>
<form name ="WF_MAIN_FORM"  method="post">
<input type="hidden" name="WF_mode" id="WF_mode" VALUE="<%=mode%>">
<body>

<h1 align="center">${massage}</h1>
<table id="dt-select" class="table table-striped table-bordered" cellspacing="0" width="100%">
  <thead>
    <tr>
       <th>Id</th> 
      <th>FileName</th>
      <th>NewFileName</th>
      <th>Create_dat_File</th>
          <th>View File</th>    
          <th>Delete File</th>
    </tr>
  </thead>
  <tfoot>
  <c:forEach items="${welcomeMsg}" var="welcomeMsg">
    <tr>
       <th>${welcomeMsg.id}</th>
       <th>${welcomeMsg.filename}</th>
       <th>${welcomeMsg.newfileName}</th>
        <th>${welcomeMsg.fileuploaddate}</th>
        <th onclick="viewPdf('${welcomeMsg.newfileName}')">View File</th>
       
   <%-- <th><a      href="usrDid/${welcomeMsg.id}" >Delete</a></th> --%>
      <th onclick="deleteid('${welcomeMsg.id}');">Delete</a></th>
    </tr>
   </c:forEach>
  </tfoot>
</table>

</body>
</form>
</html>