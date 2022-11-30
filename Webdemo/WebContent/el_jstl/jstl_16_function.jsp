<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_16_function</title>
</head>
<body>

<%--jstl에서 제공되는 문자열 함수 --%>
<c:set var="str1" value="Functions" />
<c:set var="str2" value="java test" />

<!-- 9 -->
<p>${fn:length(str1)} </p>

<!-- FUNCTIONS -->
<p>${fn:toUpperCase(str1) }</p>

<!-- jsp test -->
<p>${fn:replace(str2, "java","jsp") }</p>

<!-- 1 -->
<p>${fn:indexOf(str2, "a")} </p>

<!-- false -->
<p>${fn:contains(str1, str2)}</p>
  
</body>
</html>