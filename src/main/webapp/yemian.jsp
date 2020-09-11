<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>



<!-- (注释)此文件由 GB2UTF8 1.2 Beta 生成于 2009-3-31 12:46:59，软件作者：阿勇(fxy_2002@163.com) pc-soft.cn -->


<!-- (注释)此文件由 GB2UTF8 1.2 Beta 生成于 2009-3-31 12:46:59，软件作者：阿勇(fxy_2002@163.com) pc-soft.cn -->
<html>
<head>
	<title>MIR 实验室工作进度登录网页</title>
	<meta HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=big5">
	<meta HTTP-EQUIV="Expires" CONTENT="0">
	<style>
		td {font-family: "标楷体", "helvetica,arial", "Tahoma"}
		A:link {text-decoration: none}
		A:hover {text-decoration: underline}
	</style>
</head>

<!basefont face="标楷体">
<body>
<h2 align=center>MIR 实验室工作进度登录网页</h2>
<hr>

<!-- (注释)此文件由 GB2UTF8 1.2 Beta 生成于 2009-3-31 12:46:59，软件作者：阿勇(fxy_2002@163.com) pc-soft.cn -->


<h3><img src="redball.gif">
填写进度</h3>

<center>
<form name=form1 action="form.asp" method=post target=_blank>
<select name="person" onChange="this.form.submit()">
<option>=== 请选您的姓名 ===
<option>金雨薇
</select>
</form>
</center>
<ol>
<li>请务必在每星期五下午五点前填写完毕。过了星期六午夜，系统自动跳到下一周，就无法再填写本周的进度了。
<li>请务必每一栏都要填写，尤其是「本周预定完成事项」，一定要填入相关的「预定完成时间」。
</ol>
<hr>

<h3><img src="redball.gif">
资料列表</h3>
<ul>
<li>每周填写之资料：
	<!--<a target=_blank href="listEachWeek.asp?weekDiff=0">本周</a>、-->
	 <a href ="benzhou.jsp">本周、</a>
	<a target=_blank href="listEachWeek.asp?weekDiff=-1">前一周</a>、
	<a target=_blank href="listEachWeek.asp?weekDiff=-2">前两周</a>、
	<a target=_blank href="listEachWeek.asp?weekDiff=-3">前三周</a>、
	<a target=_blank href="listEachWeek.asp?weekDiff=-4">前四周</a>
<li>每个人的历史资料：
<a target=_blank href=listEachPerson.asp?person=金雨薇>金雨薇</a>
<li><a target=_blank href="listAllPersonLastRecord.asp">每个人的最後一笔资料</a>
</ul>
<hr>

<h3><img src="redball.gif">
有关本系统</h3>
<ul>
<li>本系统特点：超级简单易用，适合忙碌的管理者
<li>想要把整套系统移植到自己的实验室使用吗？没问题，请直接和本系统发展者<a href="http://www.cs.nthu.edu.tw/~jang">张智星</a>接洽。
</ul>
<hr>
<p align=right><font size=-1>By <a href="http://www.cs.nthu.edu.tw/~jang">Roger Jang</a></font>

</ul>
<!!--#include file="foot.asp"-->