<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <link href="${pageContext.request.contextPath}/resources/regui/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/resources/regui/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="${pageContext.request.contextPath}/resources/regui/css/main.css" rel="stylesheet" media="all">
</head>
<script>
/* function usrReg(){
	alert();
	var form=$("#myform");
   var	data=form.serialize();
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      dataType : 'json',
	      url: "${pageContext.request.contextPath}/usrCreate",
	      data: data, // Note it is important
	      success :function(result) {
	       // do what ever you want with data
	     }
	  });
   } */

</script>

</script>
<body>
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Event Registration Form</h2>
                     <h2 class="title"><div>${message}</div></h2>
                </div>
                <div class="card-body">
                    <form action="/usrCreate" name="myform" id="myform" method="post">
                     
                        <div class="form-row m-b-55">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="first_name">
                                            <label class="label--desc">first name</label>
                                        </div>
                                    </div>
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="last_name">
                                            <label class="label--desc">last name</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Company</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="company">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="email" name="userName">
                                </div>
                            </div>
                        </div>
                        
                         <div class="form-row">
                            <div class="name">Date-Of-Birth</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="date" name="dateOfBirth">
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-row m-b-55">
                            <div class="name">Phone</div>
                            <div class="value">
                                <div class="row row-refine">
                                    <div class="col-3">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="area_code">
                                            <label class="label--desc">Area Code</label>
                                        </div>
                                    </div>
                                    <div class="col-9">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="number">
                                            <label class="label--desc">Phone Number</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Subject</div>
                            <div class="value">
                                <div class="input-group">
                                    <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="subject">
                                            <option disabled="disabled" selected="selected">Choose option</option>
                                            <option>Subject 1</option>
                                            <option>Subject 2</option>
                                            <option>Subject 3</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-row p-t-20">
                            <label class="label label--block">Are you an existing customer?</label>
                            <div class="p-t-15">
                                <label class="radio-container m-r-55">Yes
                                    <input type="radio" checked="checked" name="exist" value="yes">
                                    <span class="checkmark"></span>
                                </label>
                                <label class="radio-container">No
                                    <input type="radio" name="no">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                        </div>
                        <div>
                            <button class="btn btn--radius-2 btn--red"    type="submit" onclick="usrReg()">Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="${pageContext.request.contextPath}/resources/regui/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="${pageContext.request.contextPath}/resources/regui/vendor/select2/select2.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/regui/vendor/datepicker/moment.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/regui/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="${pageContext.request.contextPath}/resources/regui/js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->