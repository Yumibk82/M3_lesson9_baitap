<%--
  Created by IntelliJ IDEA.
  User: Tuan
  Date: 3/8/2021
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Sale</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <label>Product Description</label><br/>
    <input type="text" name="productDescription"/><br/>
    <label>List Price</label><br/>
    <input type="text" name="listPrice"/><br/>
    <label>Discount Percent</label><br/>
    <input type="text" name="discount"/><br/><br/>
    <button type="submit">Calculator</button>


  </form>
  </body>
</html>
