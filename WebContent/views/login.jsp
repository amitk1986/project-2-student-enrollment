<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
<br><br><br><br><div class="container">  
<div class="row">
		<div class="col-md-6 col-md-offset-3">  
  <form:form method="POST" action="login.html">
								<div class="form-group">
									<label style="color: red;" for="inputusername">${error}</label>
									<form:input path="loginName" class="form-control" placeholder="Login Username" id="loginName"/>
									<td><form:errors path="loginName" cssStyle="color : red;"/></td>
								</div>
								<div class="form-group">
									<label for="inputpassword">Password</label>
									<form:input path="loginPassword" class="form-control" placeholder="Login Password" id="loginPassword"/>
									<td><form:errors path="loginPassword" cssStyle="color : red;"/></td>
								</div>
								<div class="form-check">
  									<label class="form-check-label">
    								<input class="form-check-input" type="checkbox" value="">
    									Remember Me
  									</label>
								</div>
								<button class="btn btn-primary">Login</button>
							</form:form>
</div>
</div>
</div><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp" %>