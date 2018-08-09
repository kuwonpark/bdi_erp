<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div class="contaier">
	<form action="<%=rPath%>/user/join">
		이름: <input type = "text" name="name">
		아이디:	<input type = "text" name="id">
		비밀번호:<input type = "text" name="pwd">
		비밀번호 체크:<input type = "text" name="pwd1"><br>
		<button>회원가입</button>
	</form>
</div>
</body>
</html>