<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
      <body class="d-flex flex-column">
        <main class="flex-shrink-0">
           <!-- Page content-->
            <section class="py-5">
                <div class="container px-5">
                    <!-- 전시관 수정 -->
                    <div class="bg-light rounded-4 py-5 px-4 px-md-5">
	                <!-- 전시관 수정 제목 -->
	                <h4 class="board-title mb-4">전시관 수정</h4>
                        <div class="row gx-5 justify-content-center">
                            <div class="col-lg-8 col-xl-6">
                                <form role="form" action="${ctx}/exboard/modify" method="post">
                                    
                                    <!-- 게시글 번호 (exno) readonly -->
                                    <div class="form-floating mb-3">
                                        <input name="exno" class="form-control bg-light text-muted" type="text" placeholder="게시글 번호" value="${exboard.exno}" readonly="readonly" />
                                        <label for="exno">게시글 번호</label>
                                    </div>

                                    <!-- 제목 입력 -->
                                    <div class="form-floating mb-3">
                                        <input name="title" class="form-control" type="text" placeholder="제목을 입력해주세요" value="${exboard.title}" data-sb-validations="required" />
                                        <label for="title">제목</label>
                                        <div class="invalid-feedback" data-sb-feedback="title:required">전시관 이름을 입력해주세요.</div>
                                    </div>

                                    <!-- 내용 입력 -->
                                    <div class="form-floating mb-3">
                                        <input name="content" class="form-control" type="text" placeholder="내용을 입력해주세요" value="${exboard.content}" data-sb-validations="required" />
                                        <label for="content">컨텐츠</label>
                                        <div class="invalid-feedback" data-sb-feedback="content:required">전시관 컨텐츠를 입력해주세요.</div>
                                    </div>

                                    <!-- 작성자 입력 -->
                                    <div class="form-floating mb-3">
                                        <input name="memid" class="form-control bg-light text-muted" type="text" placeholder="사용자를 입력해주세요" value="${exboard.memid}" data-sb-validations="required" readonly="readonly"/>
                                        <label for="memid">작성자</label>
                                        <div class="invalid-feedback" data-sb-feedback="content:required">사용자를 입력해주세요.</div>
                                    </div>

                                    <!-- 이메일 readonly -->
                                    <div class="form-floating mb-3">
                                        <input name="mememail" class="form-control bg-light text-muted" type="email" placeholder="이메일을 입력해주세요" value="${exboard.mememail}" readonly="readonly" />
                                        <label for="mememail">이메일</label>
                                        <div class="invalid-feedback" data-sb-feedback="content:required">사용자를 입력해주세요.</div>
                                    </div>

	                                <!-- 이미지 업로드 -->
	                                <div class="mb-3">
	                                    <label for="imageUpload" id="picture" class="form-label">작품 등록</label>
	                                    <input name="picture" class="form-control" type="file" id="imageUpload" accept="image/*" onchange="previewImage(event)">
	                                </div>

	                                <!-- 이미지 미리보기 -->
	                                <div class="mb-3">
	                                    <img id="imagePreview" src="#" alt="이미지를 선택하세요" style="display: none; width: 100%; max-width: 400px; height: auto;">
	                                </div>

                                    <!-- 제출 버튼 -->
                                    <div class="d-grid"><button class="btn btn-primary btn-lg" id="regBtn" type="submit">수정하기</button></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>

<%@ include file="../includes/footer.jsp" %>
