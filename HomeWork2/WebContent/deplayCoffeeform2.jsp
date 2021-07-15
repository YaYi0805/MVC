<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>填寫結果</title>
<style>
header {
	background: #003D79;
	color: lightblue;
	padding: 10px;
	text-align: center;
	margin-bottom: 10px;
	font-size: 20px;
}

fieldset {
	width: 500px;
	border: 1px solid blue;
	border-radius: 20px;
	margin: 15px auto;
}

legend {
	color: blue;
	margin-left: 160px;
}

input, select, textarea {
	background-color: #ECFFFF;
}

.sub {
	width: 500px;
	margin: 10px auto;
	text-align: center;
}
</style>
</head>
<body>
	<header>
		<h2>填寫完畢~感謝您的光顧</h2>
		<p>( 憑此畫面可至櫃台領取優惠券 )</P>
	</header>
	<fieldset>
		<legend>part1.消費資料</legend>
		<br>貴賓暱稱：<%=request.getParameter("name")%></br> 
		<br>消費日期：<%=request.getParameter("date")%></br>
		<br>消費時間：<%=request.getParameter("time")%></br> 
		<br>性別：<%=request.getParameter("gender")%></br>
	</fieldset>

	<fieldset>
		<legend>part2.消費動機及品項(多選)</legend>
		<br>如何得知本店：<br>
		<%
		String[] how = request.getParameterValues("how");
		for (int i = 0; i < how.length; i++)
			out.println(how[i] + "<br>");
		%>
		<br>今日消費品項：<br>
		<%
		String[] consume = request.getParameterValues("consume");
		for (int i = 0; i < consume.length; i++)
			out.println(consume[i] + "<br>");
		%>
	</fieldset>

	<fieldset>
		<legend>part3.滿意度調查</legend>
		<br>口味滿意度：<%=request.getParameter("taste")%></br>
		<br>環境滿意度：<%=request.getParameter("place")%></br>
		<br>服務滿意度：<%=request.getParameter("survice")%></br>
	</fieldset>
	
	<fieldset>
		<legend>part4.我有話要說</legend>
		<br>寶貴意見：<%=request.getParameter("comment")%></br>
	</fieldset>

</body>
</html>