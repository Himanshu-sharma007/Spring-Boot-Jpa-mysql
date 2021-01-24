<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">

</head>
<script>
function userReg(){
alert();	
}
</script>
<body>
<div class="limiter">
		<div class="container-login100">
			 <form id="update-form" role="form" class="container" method="get" action='/loginProcess'><divclass="login100-form validate-form">
					<span class="login100-form-title p-b-40">
						Login
					</span>

					<div>
						<a href="#" class="btn-login-with bg1 m-b-10">
							<i class="fa fa-facebook-official"></i>
							Login with Facebook
						</a>

						<a href="#" class="btn-login-with bg2">
							<i class="fa fa-twitter"></i>
							Login with Twitter
						</a>
					</div>

					<div class="text-center p-t-55 p-b-30">
						<span class="txt1">
							Login with email
							 <div>${message}</div>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-16" data-validate="Please enter email: ex@abc.xyz">
						<input class="input100" type="text" name="email" id="email" placeholder="Email">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-20" data-validate = "Please enter password">
						<span class="btn-show-pass">
							<i class="fa fa fa-eye"></i>
						</span>
						<input class="input100" type="password" name="pass" id="pass " placeholder="Password">
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">
						
						<!--   <button type="submit" class="btn btn-default text-center" name="search_btn" >Search</button>      
                          <button type="submit" class="btn btn-default text-center"  name="submit_btn" formaction="update.php">Update</button> -->
							Login
						</button>
					</div>
					
						<div class="container-login100-form-btn">
						<!-- <button class="login100-form-btn" href='loginProcess' type="submit" formaction="usrreg" >Registration</button>
					 -->
					 
					    <button type="submit" class="btn btn-default text-center"  name="submit_btn" formaction="usrreg">Registration</button>
					</div>
					
					
					<div class="flex-col-c p-t-224">
						<span class="txt2 p-b-10">
							Don’t have an account?
						</span>

						<a href="#" class="txt3 bo1 hov1">
							Sign up now
						</a>
					</div>
					
				</form>
				
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/animsition/js/animsition.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/select2/select2.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/daterangepicker/daterangepicker.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/countdowntime/countdowntime.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>

</body>
</html>
