<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a>File Upload:</a>
Select file: <br/>
<form action="fileUploaded" method="post"  enctype="multipart/form-data" name="frm">
<input type="file" name="file" size="50" />
<input type="submit" value="Upload File" />
</form>
</body>
</html>