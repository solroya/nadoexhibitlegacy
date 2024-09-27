<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>

<body>
    <div>
        <h1>나도전시 회원 로그인</h1>
        <form action="${ctx}/member/login" method="POST">

            <!-- 이메일 필드 -->
            <div>
                <label for="email">이메일 주소</label>
                <input type="email" id="email" name="mememail" required>
            </div>
    
            <!-- 비밀번호 필드 -->
            <div>
                <label for="password">비밀번호</label>
                <input type="password" id="password" name="mempass" required>
            </div>
    
            <!-- 가입 및 취소 버튼 섹션 -->
            <div class="action-buttons">
                <button type="submit">로그인</button>
                <button type="button" onclick="location.href='${ctx}'">취소</button>
            </div>
        </form>
    </div>
<%@ include file="../includes/footer.jsp" %>
    
</body>
