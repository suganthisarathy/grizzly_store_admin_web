

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div id="column2" style="padding-left:50px;">
<a href="/grizzly-store-admin-web/ListProductController"><input type="button" value="PRODUCT" class="tab"></a>
<a href=#home><input type="button" value="VENDOR" class="tab"></a>
<a href=#home><input type="button" value="" class="tab"></a>
<br/>
<br/>
<br/>
<br/>
<br/>
<div style="float:left;"><img alt="not available" src="product-add.jpg" width="550" height="550"></div>
<div style="float:center;">
<form align="left" action="AddProductController" method="post">
<input type="text" placeholder="Enter Product ID" name="pid" id="text" ><br><br>
<select id="text" name="category">
<option>Category</option>
<option value="Personal care">Personal care</option>
<option value="Airsuppliers">Airsuppliers</option>
<option value="Laptops">Laptops</option>
</select><br><br>
<input type="text" placeholder="Name" name="name" id="text"><br><br>
<input type="text" placeholder="Description" name="desc" id="text"><br><br>
<input type="text" placeholder="Price" name="price" id="text"><br><br>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div style="float:right;">
<input type="submit" value="Add" id="text"><br><br></form>
<form action="ListProductController"><input type="submit" value="Cancel" id="text"></form>
</div>

</div>
</div>
<div id="column3">
</div>
</body>
</html>
