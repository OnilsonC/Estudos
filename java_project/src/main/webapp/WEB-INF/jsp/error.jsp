<%-- 
    Document   : error
    Created on : 11 de ago de 2021, 10:34:40
    Author     : onils
--%>

<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${cadastroFormErrors[param.path] != null}">
    <div class="error">
        <span>${cadastroFormErrors[param.path]}</span>
        
    </div>
   </c:if>
