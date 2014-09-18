<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Product - Detail van product</title>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="<c:url value="/resources/js/general.js" />" type="text/javascript"></script>
        
        <link href="<c:url value="/resources/css/general.css" />" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="product">
             <div class="product__name">
                 <h1>${product.name}</h1>
             </div>

             <form id="detail" action="${pageContext.request.contextPath}/product/detail" method="POST">
                 <div class="product__toolbar">

                 </div>
                 <div class="product__table">
                     <input type="hidden" name="uuid" value="${product.id}" />
                     <div class="field">
                         <label>Code:</label>
                         <input type="text" name="shortCode" value="${product.shortCode}" />
                     </div>
                     <div class="field">
                         <label>Beschrijving:</label>
                         <input type="text" name="name" value="${product.name}" />
                     </div>
                     <div class="field">
                         <label>Prijs (excl. BTW):</label>
                         <input type="text" name="price" value="${product.price}" />
                     </div>
                 </div>
             </form>
        </div>
    </body>
</html>