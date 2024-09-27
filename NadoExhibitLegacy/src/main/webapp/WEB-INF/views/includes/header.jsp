<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath}" scope="application"/>

    <!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>NadoExhibit</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="../static/assets/favicon.ico" />
        <!-- Custom Google font-->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@100;200;300;400;500;600;700;800;900&amp;display=swap" rel="stylesheet" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="${ctx}/static/css/styles.css" rel="stylesheet" />
	    <style>
	        body {
	            padding-top: 20px; /* 고정된 네비게이션 바 높이만큼 padding 추가 */
	        }
	    </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
        
            <!-- Navigation-->
            <nav class="navbar navbar-expand-lg navbar-light bg-white py-3 fixed-top">
                <div class="container px-5">
                    <a class="navbar-brand" href="${ctx}/"><span class="fw-bolder text-primary">NadoExhibit</span></a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0 small fw-bolder">
                            <li class="nav-item"><a class="nav-link" href="#">회사소개</a></li>
                            <li class="nav-item dropdown">
					          <a class="nav-link dropdown-toggle" href="${ctx }/exboard/exlist" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					            아마추어 전시관
					          </a>
					          <ul class="dropdown-menu">
					            <li><a class="dropdown-item" href="#">전시관</a></li>
					            <li><a class="dropdown-item" href="#">전시관 만들기</a></li>
					          </ul>
					        </li>
                            <li class="nav-item"><a class="nav-link" href="#">전시리뷰</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">이벤트</a></li>
                            <li class="nav-item dropdown">
					          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					            고객센터
					          </a>
					          <ul class="dropdown-menu">
					            <li><a class="dropdown-item" href="${ctx }/member/signup">회원가입</a></li>
					            <li><a class="dropdown-item" href="${ctx }/member/updatemember">회원정보수정</a></li>
					          </ul>
					        </li>
                              <c:catch>
								<c:choose>
								    <c:when test="${empty sessionScope.loginUser}">
								        <li class="nav-item">
								            <a class="nav-link" href="${ctx}/member/login">로그인</a>
								        </li>
								    </c:when>
								    <c:otherwise>
								        <li class="nav-item">
								            <a class="nav-link">${sessionScope.loginUser.memid}님</a>
								        </li>
								        <li class="nav-item">
								            <a class="nav-link" href="${ctx}/member/logout">로그아웃</a>
								        </li>
								    </c:otherwise>
								</c:choose>
					        </c:catch>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- Header-->
     </main>
 