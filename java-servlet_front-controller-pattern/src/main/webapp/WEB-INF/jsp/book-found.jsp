<%--
  Created by Evgenii Zhuravel on 14.06.2022
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Bookshelf: Title found</title>
</head>
<body>
    <p>${param.get("title")}</p>
    <p>Our Bookshelf contains this title:</p>
    <h2>${book.getTitle()}</h2>
    <p>Author: ${book.getAuthor()}</p>
    <input type="submit" value="Buy it: ${book.getPrice()}">
</body>
</html>
