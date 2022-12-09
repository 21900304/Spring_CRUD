<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Table</h1>
<form action="addok" method="post">
    <table id="edit">
        <tr><td>category:</td><td><input type="text" name="category"/></td></tr>
        <tr><td>Professor:</td><td><input type="text" name="professor"/></td></tr>
        <tr><td>Grade:</td><td><input type="text" name="grade"/></td></tr>
        <tr><td>Major:</td><td><input type="text" name="major"/></td></tr>
        <tr><td>Place:</td><td><input type="text" name="place"/></td></tr>
        <tr><td>Content:</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
        <tr><td>DueDate:</td><td><input type="text" name="duedate"/></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>