<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>

<body class="d-flex flex-column">
    <main class="flex-shrink-0">
        <!-- Page content -->
        <section class="py-5">
            <div class="container px-5">

                <!-- 전시관 조회 제목 -->
                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h4 class="board-title">전시관 조회</h4>
                </div>

                <!-- 테이블 형식으로 전시관 정보 출력 -->
                <table class="table table-bordered">
                    <tbody>
                        <tr class="table-light text-center" >
                            <td>등록일</td>
                            <td><fmt:formatDate value="${exboard.regdate}" pattern="yyyy-MM-dd / HH:mm:ss"/></td>
                            <td>수정일</td>
                            <td><fmt:formatDate value="${exboard.updatedate}" pattern="yyyy-MM-dd / HH:mm:ss"/></td>
                        </tr>
                        <tr class="table-light text-center">
                            <td>조회수</td>
                            <td><c:out value="${exboard.viewcnt}"/></td>
                            <td>좋아요</td>
                            <td><c:out value="${exboard.likes}"/></td>
                        </tr>
                    </tbody>
                </table>

				<!-- 제목 출력 및 좋아요 버튼 -->
				<div class="d-flex justify-content-between align-items-center mb-4">
				    <div>
				        <h5 class="fw-bold">제목</h5>
				        <p class="border-bottom mb-0"><c:out value="${exboard.title}"/></p>
				    </div>
				    <!-- 좋아요 버튼 -->
				    <button id="likeButton" class="btn btn-outline-primary" onclick="toggleLike()">
				        <i id="likeIcon" class="bi bi-heart"></i> <span id="likeText">좋아요</span>
				    </button>
				</div>

                <!-- 사진 출력 -->
                <div class="mb-4">
                    <h5 class="fw-bold">사진</h5>
                    <div class="border p-3 mb-4">
                        <img src="${ctx}/static/uploads/${exboard.picture}" alt="Exhibition Image" class="img-fluid rounded">
                    </div>
                </div>

				<!-- 구분선 -->
				<hr class="my-4">

                <!-- 내용 출력 -->
                <div class="mb-4">
                    <h5 class="fw-bold">내용</h5>
                    <div class="border p-3">
                        <p><c:out value="${exboard.content}"/></p>
                    </div>
                </div>
                
				<!-- 구분선 -->
				<hr class="my-4">

                <!-- 수정 및 목록 버튼 -->
                <div class="d-flex justify-content-center">
                	<!-- 목록 버튼 -->
                	<a href="${ctx}/exboard/exlist" class="btn btn-success me-3">목록으로</a>
              	    <!-- 수정 버튼 -->
                	<a href="${ctx}/exboard/modify?exno=${exboard.exno}" class="btn btn-primary me-3">수정하기</a>
                	<!-- 삭제 버튼 -->
                	<form action="${ctx}/exboard/remove" method="post" onsubmit="return confirm('정말 삭제하시겠습니까?');">
					    <input type="hidden" name="exno" value="${exboard.exno}">
					    <button type="submit" class="btn btn-danger">삭제하기</button>
					</form>
                </div>
            </div>
        </section>
    </main>

    <!-- Include Footer -->
    <%@ include file="../includes/footer.jsp" %>
    
	<script>
        // 좋아요 버튼 클릭 시 동작
        function toggleLike() {
            var likeButton = document.getElementById("likeButton");
            var likeIcon = document.getElementById("likeIcon");
            var likeText = document.getElementById("likeText");

            if (likeButton.classList.contains("btn-outline-primary")) {
                // 좋아요 활성화
                likeButton.classList.remove("btn-outline-primary");
                likeButton.classList.add("btn-primary");
                likeIcon.classList.remove("bi-heart");
                likeIcon.classList.add("bi-heart-fill");
                likeText.innerText = "좋아요";
            } else {
                // 좋아요 비활성화
                likeButton.classList.remove("btn-primary");
                likeButton.classList.add("btn-outline-primary");
                likeIcon.classList.remove("bi-heart-fill");
                likeIcon.classList.add("bi-heart");
                likeText.innerText = "좋아요";
            }
        }
	</script>
</body>