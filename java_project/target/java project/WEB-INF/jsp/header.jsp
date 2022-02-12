<%-- 
    Document   : header
    Created on : 10 de ago de 2021, 09:51:37
    Author     : onils
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
* {
    font-family: 'Arial';
    background-color: #ffffff;
}
input, select, option, textarea {
    margin: 10px auto;
    border: none;
    padding: 15px;
    background-color: #f1f1f1;
    border-radius: 10px;
    width: 100%;
}
button {
    margin: 10px auto;
    border: none;
    padding: 15px;
    text-align: center;
    width: 100%;
    background-color: #4bceff;
    border-radius: 10px;
    color: #fff;
    font-size: 18px;
}
.error {
    color: red;
    margin-bottom: 15px;
}
form {
    width: 400px;
    text-align: left;
    margin: 0 auto;
}
.row {
    display: block;
}
.content-form {
    width: 400px;
    text-align: center;
    margin: 0 auto;
}
.content {
        width: 80%;
        margin: 0 auto;
        border-radius: 10px;
        padding: 2px;
        margin-left: 0;
    }

    .table {
        width: 120%;
        margin: 0 auto;
        border: solid 0.5px #ccc;
        border-radius: 10px;
        padding: 10px;
        
    }

    table {
        width: 100%;
        margin: 0 auto;
        border-radius: 50px;
               
    }

    tr:last-child {
        border-bottom: solid 1px #ccc;
        width: 16%;
        padding: 15px;

    }

    th {
        border-bottom: solid 0.5px #ccc;
        width: 16%;
        padding: 15px;
    }

    td {
        border-bottom: solid 0.5px #ccc;
        border-right: solid 0.5px #ccc;
        width: 16%;
        padding: 0px;
        margin: 0 auto;
        
    }

    td:last-child {
        border-right: none;
        padding: 10px;
        
    }

    tr:last-child td {
        border-bottom: none;
    }

    .id-collum {
        width: 5%;
    }

    .register-button {
        width: auto;
    }

    .radio {
        width: 200px;
        display: inline-block;
    }

    .radio input {
        width: 30px;
        display: inline-block;
    }
</style>
