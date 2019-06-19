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
<div id="column1" >

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
<p><b>${viewpro.name}</b> by ${viewpro.brand}&nbsp;&nbsp;&nbsp;&nbsp;<img src="icon.jpg" width="20"></p>

<img src="star.jpg" width="20">&nbsp;${viewpro.rating}<br><br>
<div style="float:left"><img src="page.jpg" width="520"></div>
<div style="float:center"><h1>&nbsp;&nbsp;Product Description&nbsp;<img src="icon.jpg" width="20"></h1><br><br>
<p>&nbsp;${viewpro.description }</p><br><br>
<p><b>Rs</b>.${viewpro.prize }/-&nbsp;&nbsp;&nbsp;${viewpro.discount}off&nbsp;&nbsp;<img src="icon.jpg" width="20"></b>
<div style="float:right;">
<form action="ListProductController"><input type="submit" value="Finish" id="text"><br><br>
<input type="submit" value="Cancel" id="text"></form>
</div>
</div>