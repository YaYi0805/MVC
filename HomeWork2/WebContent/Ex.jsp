<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<HEAD>
<meta charset="UTF-8">
<TITLE>JSP Expressions</TITLE>
</HEAD>
<body>

   <H2>JSP Expressions</H2>
   <UL>
   <LI>Current time: <%= new java.util.Date() %>
   <LI>Your hostname: <%= request.getRemoteHost() %>
   <LI>Your session ID: <%= session.getId() %>
   <LI>The <CODE>Input Parameter</CODE> form parameter:<%= request.getParameter("testParam") %>
   </UL>
   
</body>
</html>