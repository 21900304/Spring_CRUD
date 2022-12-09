<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<body>
<h1>Edit Your Table</h1>
<%--@elvariable id="boardVO" type=""--%>
<form:form modelAttribute="boardVO" method="POST" action="../editok">
    <form:hidden path="seq"/>
    <table id="edit">
        <tr><td>category:</td><td><form:input path="category"/></td></tr>
        <tr><td>Professor:</td><td><form:input path="professor"/></td></tr>
        <tr><td>Grade:</td><td><form:input path="grade"/></td></tr>
        <tr><td>Major:</td><td><form:input path="major"/></td></tr>
        <tr><td>Place:</td><td><form:input path="place"/></td></tr>
        <tr><td>Content:</td><td><form:textarea cols="50" rows="5" path="content"/></td></tr>
        <tr><td>DueDate:</td><td><form:input path="duedate"/></td></tr>
    </table>
    <input type="submit" value="수정하기" />
    <input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</form:form>
</body>
</html>