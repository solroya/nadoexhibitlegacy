<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>

<body>
    <div id="signup-container">
        <h1 class="signup-title">비밀번호 변경</h1>
        <form id="updatemem-form" action="${ctx}/member/updatemember" method="POST">
           
            <!-- 이메일 주소-->
            <div>
                <label for="email">이메일(검증용)</label>
                <input type="email" id="email" name="mememail" required>
            </div>    
    
            <!-- 아이디 필드 -->
            <div>
                <label for="memid">아이디</label>
                <input type="text" id="id" name="memid" required>
            </div>
    
            <!-- 비밀번호 필드 -->
            <div>
                <label for="password">비밀번호</label>
                <input type="password" id="password" name="mempass" required>
            </div>
    
            <!-- 비밀번호 확인 필드 -->
            <div>
                <label for="confirm-password">비밀번호 확인</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
            </div>
            <!-- 가입 및 취소 버튼 섹션 -->
            <div class="action-buttons">
                <button type="submit">수정하기</button>
                <button type="button" onclick="location.href='${ctx}'">취소</button>
            </div>
        </form>
    </div>
<%@ include file="../includes/footer.jsp" %>
    
</body>
