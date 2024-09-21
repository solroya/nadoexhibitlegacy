<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>전시관 게시판</title>
    <link rel="stylesheet" href="../css/exhibition_board_list_style.css">
</head>
<body>
    <div class="board-container">
        <h1 class="board-title">전시관 게시판</h1>

        <!-- 글쓰기 버튼을 우측 상단으로 이동 -->
        <div class="board-header">
            <button class="write-button" onclick="location.href='exhibition_board_write.html'">글쓰기</button>
        </div>

        <!-- 게시판 목록 -->
        <table class="board-table">
            <thead>
                <tr>
                    <th>글번호</th>
                    <th>작성자</th>
                    <th>제목</th>
                    <th>작성일자</th>
                    <th>조회수</th>
                    <th>좋아요</th> <!-- 좋아요 컬럼 추가 -->
                </tr>
            </thead>
            <tbody>
                <!-- 이곳에서 각 게시글 데이터를 반복하여 출력 -->
                <tr>
                    <td>1</td>
                    <td>example01</td>
                    <td><a href="exhibition_board_view.html?exno=1">첫 번째 전시</a></td>
                    <td>2023-09-18</td>
                    <td>50</td>
                    <td>100</td> <!-- 좋아요 수 출력 -->
                </tr>
                <tr>
                    <td>2</td>
                    <td>example02</td>
                    <td><a href="exhibition_board_view.html?exno=2">두 번째 전시</a></td>
                    <td>2023-09-17</td>
                    <td>30</td>
                    <td>75</td> <!-- 좋아요 수 출력 -->
                </tr>
            </tbody>
        </table>

        <!-- 페이지 네이션을 추가할 하단 -->
        <div class="board-footer">
            <div class="pagination">
                <a href="#">&laquo;</a>
                <a href="#">1</a>
                <a href="#">2</a>
                <a href="#">3</a>
                <a href="#">4</a>
                <a href="#">5</a>
                <a href="#">&raquo;</a>
            </div>
        </div>
    </div>
</body>
</html>
