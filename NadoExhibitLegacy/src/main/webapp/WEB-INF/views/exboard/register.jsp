<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
      <body class="d-flex flex-column">
        <main class="flex-shrink-0">
           <!-- Page content-->
            <section class="py-5">
                <div class="container px-5">
                    <!-- Contact form-->
                    <div class="bg-light rounded-4 py-5 px-4 px-md-5">
                        <div class="text-center mb-5">
                            <div >
                            	<img alt="register" src="${ctx}/static/assets/register.png" style="width: 100%; max-width: 400px; height: auto;">
                            </div>
                            <h1 class="fw-bolder">새로운 전시관 창조!</h1>
                            <p class="lead fw-normal text-muted mb-0">당신의 꿈을 펼쳐 보세요!</p>
                        </div>
                        <div class="row gx-5 justify-content-center">
                            <div class="col-lg-8 col-xl-6">
                                <!-- * * * * * * * * * * * * * * *-->
                                <!-- * * SB Forms Contact Form * *-->
                                <!-- * * * * * * * * * * * * * * *-->
                                <!-- This form is pre-integrated with SB Forms.-->
                                <!-- To make this form functional, sign up at-->
                                <!-- https://startbootstrap.com/solution/contact-forms-->
                                <!-- to get an API token!-->
                                <form role="form" action="${ctx}/exboard/register" method="post"">
                                    <!-- Title input-->
                                    <div class="form-floating mb-3">
                                        <input name="title" class="form-control" type="text" placeholder="제목을 입력해주세요" data-sb-validations="required" />
                                        <label for="title">제목</label>
                                        <div class="invalid-feedback" data-sb-feedback="title:required">전시관 이름을 입력해주세요.</div>
                                    </div>
                                    <!-- content input-->
                                    <div class="form-floating mb-3">
                                        <input name="content" class="form-control" type="text" placeholder="내용을 입력해주세요" data-sb-validations="required" />
                                        <label for="content">컨텐츠</label>
                                        <div class="invalid-feedback" data-sb-feedback="content:required">전시관 컨텐츠를 입력해주세요.</div>
                                    </div>
                                    <!-- content input-->
                                    <div class="form-floating mb-3">
                                        <input name="memid" class="form-control" type="text" placeholder="사용자를 입력해주세요" data-sb-validations="required" />
                                        <label for="memid">작성자</label>
                                        <div class="invalid-feedback" data-sb-feedback="content:required">사용자를 입력해주세요.</div>
                                    </div>
                                    <!-- content input-->
                                    <div class="form-floating mb-3">
                                        <input name="mememail" class="form-control" type="email" placeholder="이메일을 입력해주세요" data-sb-validations="required,email" />
                                        <label for="mememail">이메일</label>
                                        <div class="invalid-feedback" data-sb-feedback="content:required">사용자를 입력해주세요.</div>
                                    </div>
	                                <!-- Image upload input -->
	                                <div class="mb-3">
	                                    <label for="imageUpload" id="picture" class="form-label">작품 등록</label>
	                                    <input name ="picture" class="form-control" type="file" id="imageUpload" name="imageUpload" accept="image/*" onchange="previewImage(event)">
	                                </div>
	
	                                <!-- Image preview -->
	                                <div class="mb-3">
	                                    <img id="imagePreview" src="#" alt="이미지를 선택하세요" style="display: none; width: 100%; max-width: 400px; height: auto;">
	                                </div>
                                    

                                    <!---->
                                    <!-- This is what your users will see when the form-->
                                    <!-- has successfully submitted-->
                                    <div class="d-none" id="submitSuccessMessage">
                                        <div class="text-center mb-3">
                                            <div class="fw-bolder">Form submission successful!</div>
                                            To activate this form, sign up at
                                            <br />
                                            <a href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
                                        </div>
                                    </div>
                                    <!-- Submit error message-->
                                    <!---->
                                    <!-- This is what your users will see when there is-->
                                    <!-- an error submitting the form-->
                                    <div class="d-none" id="submitErrorMessage"><div class="text-center text-danger mb-3">Error sending message!</div></div>
                                    <!-- Submit Button-->
                                    <div class="d-grid"><button class="btn btn-primary btn-lg" id="regBtn" type="submit">등록하기</button></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>

<%@ include file="../includes/footer.jsp" %>