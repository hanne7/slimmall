<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>슬립몰</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link type="text/css" rel="stylesheet" href="<c:url value='/css/common.css' />" />
</head>
<body>
	<div class="w3-border-bottom">
		<c:import url="/admin/header.do" />
	</div>
	<div class="w3-border-bottom w3-border-blue">
		<c:import url="/admin/nav.do?menu=1" />
	</div>
	<div>
		<section class="block-center w3-container">
		
		<form action="addMember.do" method="post" onsubmit="return confirm('추가 하시겠습니까?')">
			<p>유저ID : </p>
			<p><input type="text" name="username" placeholder="유저ID"></p>
			<p>비밀번호 : </p>
			<p><input type="password" placeholder="password" name="password"></p>
			<p>이메일 : </p>
			<p><input type="text" placeholder="email" name="email"></p>
			<p>전화번호 : </p>
			<p><input type="text" placeholder="phone" name="phone"></p>
			<p>주소 : </p>
			<p><input type="text" placeholder="address" name="address"></p>
			<p><input type="submit" value="추가하기" class="w3-button w3-black"></p>
		</form>
		</section>
	</div>
	<c:import url="/admin/footer.do" />	
</body>
</html>
