<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="form.css">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #EAEDED;
  padding: 10px;
  height:50%;
  font-size: 35px;
  color: black;
}

/* Create two columns/boxes that floats next to each other */
nav {

  width: 25%;
  height: 800px; /* only for demonstration, should be removed */
  background: white;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}
.card {
  float: left;
    padding: 10px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  width: 400px;
  height:800px;
  margin-left:20px;
  margin-top:30px;
  text-align: center;
  background-color: #EAEDED;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}


/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 50%;
    height: auto;
  }
}
ul {
  list-style-type: none;
  margin: 0;
 
   margin-left:60px;
  margin-top:30px;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
.active {
  background-color: #EAEDED;
  
}
#user
{
float:right;
}

</style>
</head>
<body>

<header>
<form action="/grizzly-store-admin-web/LogoutController" method="post">
Grizzly
<img alt="not available" src="login.jpg" width="50">
Store
<input type="text" id="text" placeholder="search">
<div id="user">Welcome,<%=session.getAttribute("username") %>

<input type="submit" value="logout" id="btn" ></div>

</form>
  
</header>



</body>
</html>