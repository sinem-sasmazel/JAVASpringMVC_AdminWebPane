<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>    

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminPanel | Login</title>
   
  <c:import url="/css"></c:import>  
  
</head>

<body class="hold-transition skin-blue sidebar-mini">
    
      <div class="container">
      	<div class="row">
      	<div class="col-sm-4">
      	</div>
      	<div class="col-sm-4">
      	</br></br></br>
      	<h1>Sign Up</h1>
      	
      	<form action='<s:url value="/signup"></s:url>' method="post">
		<div class="form-group">
		    <input name="name" type="text" class="form-control" placeholder="Name">
		  </div>
		<div class="form-group">
		    <input name="surname" type="text" class="form-control" placeholder="Surname">
		  </div>
		  <div class="form-group">
		    <input name="email" type="text" class="form-control" placeholder="E-mail">
		  </div>
		  <div class="form-group">
		    <input name="password" type="password" class="form-control" placeholder="Password">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<div class="col-sm-4">
		</div>
		</div>
      	</div><!--/row-->
    
      </hr>
	
	 </br></br></br></br></br></br></br></br>
    </div><!--/.container-->
    
    <c:import url="/footer_md"></c:import>
    <c:import url="/js"></c:import>

</body>
</html>