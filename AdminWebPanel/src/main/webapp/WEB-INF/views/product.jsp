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
 
	<div class="col-md-10 col-sm-6 col-xs-12">
    	</br>
	  </br>	
	  <div class="row">
	  	<div class="col-md-4 col-sm-6 col-xs-12">
		<a href='<s:url value="/admin/newProduct"></s:url>' class="btn btn-primary btn-sm active" role="button" aria-pressed="true">New Product</a>
		<a href='<s:url value="/admin/productAPI"></s:url>' class="btn btn-primary btn-sm active" role="button" aria-pressed="true">JSON API</a>
		</div>
		<div class="col-md-6 col-sm-6 col-xs-12">
	  	</div>
		<div class="col-md-2 col-sm-6 col-xs-12">
		<a href='<s:url value="/admin/home"></s:url>' class="btn btn-primary btn-sm active" role="button" aria-pressed="true">Back</a>
		</div>
		</div>
		<h1>Product List</h1>
		<table class="table table-hover">
		  <thead>
		    <tr>
		      <th scope="col">Short Description</th>
		      <th scope="col">Detailed Description</th>
		      <th scope="col">Price</th>
		      <th scope="col">Action</th>
		    </tr>
		  </thead>
		  <tbody>
		  
		  <c:if test="${ not empty data }">
		  	<c:forEach items="${ data }" var="item">
			    <tr>
			      <td>${item.pdesc1 }</td>
			      <td>${item.pdesc2}</td>
			      <td>${item.pprice}</td>
			      <td>
			      <a href='<s:url value="/admin/deleteProduct/${item.pid }"></s:url>' class="btn btn-danger" role="button" aria-pressed="true">Delete</a>
			      </td>
			    </tr>
		    </c:forEach>
		  </c:if>
		  
		  <c:if test="${ data.size() == 0 }">
		   	 	<tr>
		    		<td><p>Table is Empty!</p></td>
		    	</tr>
		   </c:if>
		    
		    
		  </tbody>
		</table>
	</div>
		
		
      	</div><!--/row-->
    
      </hr>
      </br>
	  </br>
	  </br>

    </div><!--/.container-->
    
    <c:import url="/footer_r"></c:import>
    <c:import url="/js"></c:import>

</body>
</html>