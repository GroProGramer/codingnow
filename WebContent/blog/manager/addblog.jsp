
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>编辑博客</title>
<script src="../../js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="../../js/addblog.js?ver=8" type="text/javascript"></script>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<link href="style.css" type="text/css" rel="stylesheet"> 	
</head>
<body onload="addCategory()">
<div id="container">	
<div id="banner">
		<h1>博客的名字</h1>
</div>
<div id="menu">
	欢迎, xxx用户
	 | <a href="">发博文</a>
	 | <a href="">博文管理</a>
	 | <a href="">分类管理</a>
 	 | <a href="">评论管理</a>
	 | <a href="">修改密码</a>
	 | <a href="">退出</a>
</div>
<br/>
<div id="main">
<h2>
		发博文</h2>

    
<form action='' method="post">
<table id="tab">
<tr>
    <td>主题: </td>
    <td><input type="text" name="name" value="" size="50" maxlength="100"/></td>
</tr>

<tr>
    <td>分类: </td>
    <td>  
      <select name="categoryList" id="categoryList" >
       <!--  <option value="4" >Struts 2.x</option>
        <option value="1" >Java SE</option>
        <option value="2" >Java Web</option>
        <option value="3" >Hibernate 3.X</option> -->
    </select>
</td>
</tr>


<tr>
    <td colspan="2">内容: <br/>
		<textarea name="content" rows="18" cols="100"></textarea>

    </td>
</tr>

<tr>
    <td colspan="2">
					<input type="submit" name="submit" value="创建"/>
		    </td>
</tr>
</table>
</form>
</div>
</body>
</html>