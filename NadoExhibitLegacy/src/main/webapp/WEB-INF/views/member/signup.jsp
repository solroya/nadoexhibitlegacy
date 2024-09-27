<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>

<head>
	<style type="text/css">
		.id_check_vailable {
			color: green;
			display: none;
		}
		.id_check_duplicate {
			color: red;
			display: none;
		}
	</style>

</head>

<body>
    <div id="signup-container">
        <h1 class="signup-title">나도전시 회원 가입</h1>
        <form id="signup-form" action="${ctx}/member/signup" method="POST">
            <!-- 아이디 필드 -->
            <div class="signup-group">
                <label for="userid">아이디</label>
                <input type="text" id="userid" name="memid" required>
	            <!-- 아이디 중복검사 기능 추가 -->
           		<span class="id_check_vailable" >사용 가능한 아이디입니다.</span>
    			<span class="id_check_duplicate">아이디가 이미 존재합니다.</span>
            </div>
            
    
            <!-- 이메일 필드 -->
            <div class="signup-group">
                <label for="email">이메일 주소</label>
                <input type="email" id="useremail" name="mememail" required>
                <button type="button" id="emailChkBtn">중복 확인</button>
            </div>
    
            <!-- 비밀번호 필드 -->
            <div class="signup-group">
                <label for="password">비밀번호</label>
                <input type="password" id="password" name="mempass" required>
            </div>
    
            <!-- 비밀번호 확인 필드 -->
            <div class="signup-group">
                <label for="confirm-password">비밀번호 확인</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
            </div>
            
            <!-- 테스트용 약관 동의 -->
            <div class="signup-group">
                <label for="ISCHECKTERMS">약관동의 "Y"</label>
                <input type="text" id="confirm-terms" name="ischeckterms" required>
            </div>
    
            <!-- 동의 섹션 -->
            <div class="signup-agreement">
                <div>
                    <input type="checkbox" id="agree-all" name="agree-all">
                    <label for="agree-all">전체 동의하기</label>
                </div>
                <div>
                    <input type="checkbox" id="agree1" name="agree1" required>
                    <label for="agree1">(필수) 만 14세 이상 회원입니다.</label>
                </div>
                <div>
                    <input type="checkbox" id="agree2" name="agree2" required>
                    <label for="agree2">(필수) 나도전시 이용약관</label>
                </div>
                <div>
                    <input type="checkbox" id="agree3" name="agree3" required>
                    <label for="agree3">(필수) 나도전시 개인정보 수집 제공 동의</label>
                </div>
                <div>
                    <input type="checkbox" id="agree4" name="agree4" required>
                    <label for="agree4">(필수) 나도전시 제3자 정보 제공 동의</label>
                </div>
            </div>
    
            <!-- 가입 및 취소 버튼 섹션 -->
            <div class="action-buttons">
                <button type="submit">가입하기</button>
                <button type="button" onclick="location.href='${ctx}'">취소</button>
            </div>
        </form>
    </div>
<%@ include file="../includes/footer.jsp" %>
    
    
    <!-- Modal HTML 추가 -->
<div class="modal" id="emailCheckModal" tabindex="-1" aria-labelledby="emailCheckModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="emailCheckModalLabel">이메일 중복 확인</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body" id="emailCheckModalBody">
        <!-- 성공여부 출력 -->
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
      </div>
    </div>
  </div>
</div>

</body>

	<script type="text/javascript">
	
		// 아이디 중복검사
		$("#userid").on("change keyup paste input", function(){
			//console.log("입력된 값을 감지 하기 위한 로그");
			var memid = $('#userid').val(); //input에 입력되는 값
			var data = {memid : memid}; //컨트롤러에 넘기는 데이터 이름
			
			$.ajax({
				type: "post",
				url: "${ctx}/member/memberidchk",
				data : data,
				success : function(e){
					console.log("ID중복체크 결과 : " + e);
					if(e != "fail") {
						$(".id_check_vailable").css("display", "inline-block");
						$(".id_check_duplicate").css("display", "none")
					} else {
						$(".id_check_duplicate").css("display", "inline-block");
						$(".id_check_vailable").css("display", "none")
					}
				}
			});
		});
		
		//이메일 중복 검사
		$("#emailChkBtn").click(function (){
			//console.log("이메일 주소 버튼 클릭!!")
			var mememail = $("#useremail").val(); //input에 입력된 이메일 ID!!!!
			var data = {mememail: mememail};
			
			$.ajax({
				type: "post",
				url: "${ctx}/member/emailcheck",
				data: data,
				success : function(result) {
					console.log("Email 중복체크 결과 : " + result);
					
					if (result != "fail") {
						$("#emailCheckModalBody").text("사용가능한 이메일 입니다.");
					} else {
						$("#emailCheckModalBody").text("사용가능이 불가능한 이메일 입니다.");
					}
					
					// 모달창 실행
					$("#emailCheckModal").modal("show");
				},
				error: function () {
					console.log("이메일 중복 체크 오류 발생")
				}
			})
			
		});
	</script>
