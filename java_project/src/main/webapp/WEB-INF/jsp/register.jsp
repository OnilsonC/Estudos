<%--
  Created by IntelliJ IDEA.
  User: onils
  Date: 03/08/2021
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="header.jsp"/>
</head>
<body>
    <h1 style="text-align: center">Página de Cadastro</h1>

<form action="${pageContext.servletContext.contextPath}/page/register" method="POST">
    <div class="row">
        <label for="nome">Nome</label>
        <input type="text" name="nome" placeholder="Digite seu Nome"/>
    </div>
    <div class="row">
        <label for="sobrenome">Sobrenome</label>
        <input type="text" name="sobrenome" placeholder="Digite seu Sobrenome"/>
    </div>
    <div class="row">
        <label for="email">E-mail</label>
        <input type="email" name="email" placeholder="Digite seu E-mail"/>
    </div>
    <div class="row">
        <label for="idade">Idade</label>
        <input type="number" name="idade" placeholder="Digite sua Idade"/>
    </div>

    <button type="submit">Enviar</button>
</form>
</body>
</html>
