<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header2.jsp" %>
<br><br><br><div class="container">  
<div class="row">
		<div class="col-md-6 col-md-offset-3">  
		<form:form method="POST" action="save.html">
								<div class="form-group">
									<label for="inputusername">Firstname</label>
									<form:input path="firstName" class="form-control" placeholder="First Name" id="firstName"/>
									<td><form:errors path="firstName" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="inputusername">Lastname</label>
									<form:input path="lastName" class="form-control" placeholder="Last Name" id="lastName"/>
									<td><form:errors path="lastName" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="inputpassword">Password</label>
									<form:input path="password" class="form-control" placeholder="Password" id="password"/>
									<td><form:errors path="password" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="email">Email</label>
									<form:input path="email" class="form-control" placeholder="Email" id="email"/>
									<td><form:errors path="email" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="mobile">Mobile Number</label>
									<form:input path="mobileNum" class="form-control" placeholder="Mobile Number" id="mobileNum"/>
									<td><form:errors path="mobileNum" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label>Gender&nbsp;&nbsp;</label>
									<label class="radio-inline">
									<form:radiobutton path="gender" class="form-control" id="male"/>Male
     								</label>
    								<label class="radio-inline">
      								<form:radiobutton path="gender" class="form-control" id="female"/>Female
    								</label>
								</div>
								<div class="form-group">
									<label for="address">Address</label>
									<form:textarea path="address" class="form-control" placeholder="Address" id="address" rows="5"/>
									<td><form:errors path="address" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="city">City</label>
									<form:input path="city" class="form-control" placeholder="City" id="city"/>
									<td><form:errors path="city" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="pincode">Pincode</label>
									<form:input path="pincode" class="form-control" placeholder="Pincode" id="pincode"/>
									<td><form:errors path="pincode" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="state">State</label>
									<form:input path="state" class="form-control" placeholder="State" id="state"/>
									<td><form:errors path="state" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="country">Country</label>
									<form:input path="country" class="form-control" placeholder="Country" id="country"/>
									<td><form:errors path="country" cssStyle="color : red;"/></td>
								</div>
								<button class="btn btn-primary">Register</button>
							</form:form>
</div>
</div>
</div><br>
			<%@include file="footer.jsp" %>