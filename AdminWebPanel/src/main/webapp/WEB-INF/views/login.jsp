<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>    

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <br><br><br><br><br>
  <title>AdminPanel | Login</title>
   
  <c:import url="/css"></c:import>  
  
</head>

<body>
    
<div class="container">
<div class="row">
	<div class="col-sm-4"></div>
	<div class="col-sm-4">
		<h1>Login</h1>
		
		<form action='<s:url value="/login"></s:url>' method="post" class="form form--login">

        <div class="form__field">
          <label class="fontawesome-user" for="login__username"><span class="hidden">Username</span></label>
          <input class="form-control" id="email" name="email" type="text" class="form__input" placeholder="User e-mail" required>
        </div>
		
        <div class="form__field">
          <label class="fontawesome-lock" for="login__password"><span class="hidden">Password</span></label>
          <input class="form-control" id="password" name="password" type="password" class="form__input" placeholder="Password" required>
        </div>
        
        <br>
        <div class="form__field">
          <button type="submit" class="btn btn-primary">Login</button>
          <a href='<s:url value="/createAccount"></s:url>' class="btn btn-primary btn-md active" role="button" aria-pressed="true">Sign Up</a>
        </div>
       		
		 <c:if test="${param.error != null}">
                        <p class="text--center">User or password is invalid.</p>
                </c:if>
                <c:if test="${param.logout != null}">
                        <p class="text--center">You signed out successfully.</p>
                </c:if>
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />      
      </form>
	</div>
	<div class="col-sm-4"></div>
</div>
</div>
	<br><br><br><br><br><br><br><br><br><br>
        <c:import url="/footer_md"></c:import>
    	<c:import url="/js"></c:import>
</body>
</html>