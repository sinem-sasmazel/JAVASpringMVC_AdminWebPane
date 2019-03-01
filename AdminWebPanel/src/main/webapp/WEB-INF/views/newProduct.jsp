<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>    

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminPanel | Dashboard</title>
   
  <c:import url="/css"></c:import>  
  
  
</head>

<body class="hold-transition skin-blue sidebar-mini">
    <c:import url="/menu"></c:import>  
      <div class="container">
      	<div class="row">
      	<div class="col-md-2 col-sm-6 col-xs-12">
      	</div>
      	
      	<div class="col-md-5 col-sm-6 col-xs-12">
      	
      	</br></br>
      	<h1>Product Insert</h1>
      	
      	<form action='<s:url value="/admin/insert"></s:url>' method="post">
		<div class="form-group">
		    <input name="pdesc1" type="text" class="form-control" placeholder="Short description">
		  </div>
		<div class="form-group">
		    <textarea name="pdesc2" class="form-control"  placeholder="Detailed description" rows="3"></textarea>
		  </div>
		  <div class="form-group">
		    <input name="pprice" type="text" class="form-control" placeholder="Price">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		</div>

		
      	</div><!--/row-->
    
      </hr>
      </br></br></br></br></br></br></br></br>
	  

    </div><!--/.container-->
    
    <c:import url="/footer_r"></c:import>
    <c:import url="/js"></c:import>

</body>
</html>