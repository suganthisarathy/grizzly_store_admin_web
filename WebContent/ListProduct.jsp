

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="form.css">
<title>Insert title here</title>
<style>
#column1
{
float:left;
width:20%;
border-style="solid";
border-width: 5px;
}
#column2
{
float:left;
width:60%;
border-style="solid";
border-width: 5px;
padding-left:30px;
}
#column3
{
float:left;
width:20%;
border-style="solid";
border-width: 5px;
}
#col2col1
{
float:left;
width:50%;
}
#col2col2
{
float:left;
width:50%;
padding-left:40px;
}
.tab
{
background-color: #f1f1f1;
border: none;
float:left;
color:black;
width:33.33%;
height:50px;
font-size: 25px;
text-align: left;
font-weight:550;

}
.tab:hover {
 background-color: #777D7D;
}
table
{
border-collapse:collapse;
}
table th
{
border-right:2.5px solid #D1D5D5;
}
table th:last-child
{
border-right:0;
}
table th:nth-child(6)
{
border-right:0;
}
table th:nth-child(7)
{
border-right:0;
}
table td
{
border:2.5px solid #D1D5D5;
border-left:0;
}
table tr:first-child td
{
border-top:0;
}
table tr:last-child td
{
border-bottom: 0;
}
table tr td:last-child
{
border-right:0;
}
table tr td:nth-child(6)
{
border-right:0;
}
table tr td:nth-child(7)
{
border-right:0;
}
table td:first-child
{
border-right:0;
border-bottom:0;
}
table th:first-child
{
border-right:0;
}
</style>
</head>
<body>
<div style="background-color:#EAEDED;height:70px;">
<%@ include file="header.jsp" %>
</div>
<br/>
<br/>
<br/>
<div id="column1">
<form style="background-color:#EAEDED;">
<br/>
<br/>
<center>
<h2>PROFILE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="EDIT" id="sub"></h2>
</center>
<div align="center">
<br/>
<br/>
<img alt="not available" src="profile.jpg" width=200>

<br/>
<br/>
<br/>

<%=session.getAttribute("username") %>
<br/>
<br/>
<br/>
<h3>ID</h3>
<%=session.getAttribute("userid") %>
<br/>
<br/>
<br/>
<h3>Designation</h3>
<%=session.getAttribute("designation") %>
<br/>
<br/>
<br/>
<h3>Office</h3>
<%=session.getAttribute("office") %>
<br/>
<br/>
<br/>
</div>
</form>
</div>
<div id="column2"  >
<a href="/grizzly-store-admin-web/ListProductController"><input type="button" value="PRODUCT" class="tab"></a>
<a href=#home><input type="button" value="VENDOR" class="tab"></a>
<a href=#home><input type="button" value="" class="tab"></a>
<br/>
<br/>
<br/>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select id="btn">
<option>choose action</option>
<option>add</option>
<option>delete</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" id="text" placeholder="categoryname">
&nbsp;&nbsp;&nbsp;
<select id="btn">
<option>sortBy</option>
<option>ProductId</option>
<option>productName</option>
</select>
<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div style="float:right;"><a href ="AddProduct.jsp"><input type="submit" value="Add" id="btn"></a></div>
<c:if test="${!empty custlist}"> 
  <table>
  <tr>
  	<th width="20"></th>
   <th width="180" align="center">ProductList</th>
   <th width="180"  align="center">	Brand</th>
   <th width="180" align="center">Category</th>
   <th width="180" align="center">Rating</th>
   <th width="140" align="center"></th>
   <th width="90" align="center"></th>
   <th width="90" align="center"></th>
   </tr>
   <c:forEach items="${custlist }" var="product">
    <tr>
    <td><input type="radio" name="product"> </td>

    <td align="center">${product.name}</td>
    <td align="center">${product.brand}</td>
    <td align="center">${product.category}</td>
    <td align="center">${product.rating}</td>
    <td><form action="/grizzly-store-admin-web/ViewController?productid=${product.productid }" method="post" style="padding-left:50px;"><input type="submit" value="view" style="border-radius:20px;"></form></td>
    <td><form action="/grizzly-store-admin-web/ViewController?productid=${product.productid }" method="post"><input type="submit" value="block" style="border-radius:20px;"></form></td>
    <td><form action="/grizzly-store-admin-web/DeleteController?productid=${product.productid }" method="post"><input type="submit" value="remove" style="border-radius:20px;"></form></td>
    </tr>
 	</c:forEach>
  </table>
  </c:if>
  </div>
<div id="column3">
</div>
</body>
</html>
