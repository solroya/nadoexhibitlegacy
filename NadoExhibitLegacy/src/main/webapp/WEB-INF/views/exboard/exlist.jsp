<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
     <body class="d-flex flex-column">
        <main class="flex-shrink-0">
            <!-- Page content-->
            <section class="py-5">
                <div class="container px-5">
                            <h4 class="board-title">전시관</h4>
					        <div class="d-flex justify-content-end mb-3">
					            <button type="button" id="writeBtn" class="btn btn-primary btn-sm">글쓰기</button>
					        </div>
					
					        <!-- 게시판 목록 -->
					        <table class="table table-bordered" >
					            <thead class="table-light">
					                <tr class="table-primary text-center">
					                    <th>글번호</th>
					                    <th>작성자</th>
					                    <th>제목</th>
					                    <th>작성일자</th>
					                    <th>조회수</th>
					                    <th>좋아요</th> <!-- 좋아요 컬럼 추가 -->
					                </tr>
					            </thead>
					            <tbody>
					            	<c:forEach items="${list}" var="exboard">
						                <tr class="text-center">
						                    <td><c:out value="${exboard.exno }"/></td>
						                    <td><c:out value="${exboard.memid }"/></td>
						                    <td><a href="${ctx}/exboard/read?exno=<c:out value='${exboard.exno }'/>">
						                    	<c:out value="${exboard.title}"></c:out>
						                    </a></td>
						                    <td><fmt:formatDate value="${exboard.regdate }" pattern="yyyy-MM-dd / HH:mm:ss"/> </td>
						                    <td><c:out value="${exboard.viewcnt }"/></td>
						                    <td><c:out value="${exboard.likes }"/></td> <!-- 좋아요 수 출력 -->
						                </tr>
					            	
					            	</c:forEach>
					            </tbody>
					        </table>
					        
							<div class="d-flex justify-content-end">
							    <ul class="pagination">
							        <c:if test="${pageMaker.prev }">
							            <li class="page-item">
							                <a class="page-link" href="#">Pre</a>
							            </li>
							        </c:if>
							
							        <c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage }">
							            <li class="page-item">
							                <a class="page-link" href="#">${num }</a>
							            </li>
							        </c:forEach>
							
							        <c:if test="${pageMaker.next }">
							            <li class="page-item">
							                <a class="page-link" href="#">Next</a>
							            </li>
							        </c:if>
							    </ul>
							</div>
                </div>
            </section>
        </main>

		<div class="modal" id="myModal" tabindex="-1">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title">알림</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      </div>
		      <div class="modal-body">
		        <p>Modal body text goes here.</p>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Close</button>
		      </div>
		    </div>
		  </div>
		</div>

        <script>
        	$(document).ready(function() {
        		const result = "${result}";
        		
        		checkModal(result);
        		
        		history.replaceState({}, null, null);
        		
        		// 글쓰기 버튼 클릭 시 글쓰기 페이지로 이동
                $("#writeBtn").on("click", function() {
                    window.location.href = "${ctx}/exboard/register"; // 글쓰기 페이지로 이동
                });
        		
        		function checkModal(result) {
        			if (result === "" || history.state) {
						return;
					}
        			
        			if (parseInt(result) > 0) {
						$(".modal-body").html("게시글 " + parseInt(result) + " 번이 등록되었습니다.");
					}
        			
        			if (result === "modify") {
	       				$(".modal-body").html("게시글이 성공적으로 수정되었습니다.");
	       	            $("#myModal").modal("show");
        			}
        			
        			if (result === "delete") {
	       				$(".modal-body").html("게시글이 성공적으로 삭제되었습니다.");
	       	            $("#myModal").modal("show");
        			}
    	    			
        			$("#myModal").modal("show");
        		}
        		
        		// Register New Board 이벤트 등록
        		$("#regBtn").on("click", function() {
        			self.location = "${ctx}/exboard/register";
        		});
        	});
        </script>

<%@ include file="../includes/footer.jsp" %>