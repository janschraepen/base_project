<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Product - Lijst van producten</title>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="<c:url value="/resources/js/general.js" />" type="text/javascript"></script>

        <link href="<c:url value="/resources/css/general.css" />" rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/table.css" />" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="products">
            <div class="products__title">
                <h1>${title}</h1>
            </div>

            <form id="results" action="${pageContext.request.contextPath}/product/detail" method="GET">
                <div class="products__toolbar">
                    <input type="submit" value="view"/>
                </div>
                <div class="products__table">
                    <table class="products__table--results results">
                        <tr>
                            <th></th>
                            <th>ID</th>
                            <th>CODE</th>
                            <th>OMSCHRIJVING</th>
                            <th>PRIJS (incl BTW)</th>
                        </tr>
                        <c:forEach var="product" items="${products}">
                            <tr>
                                <td><input type="checkbox" name="uuid" value="${product.id}" /></td>
                                <td>${product.id}</td>
                                <td>${product.shortCode}</td>
                                <td>${product.name}</td>
                                <td>${product.price}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </form>
        </div>
    </body>
</html>