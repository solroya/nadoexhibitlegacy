package com.exhibit.nado.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exhibit.nado.domain.Criteria;
import com.exhibit.nado.domain.ExhibitionBoardDTO;

@Repository
public interface IExhibitionBoardDAO {

	// 전시관 등록
	public void create(ExhibitionBoardDTO exDto) throws Exception;
	
	// 특정 전시관 조회
	public ExhibitionBoardDTO read(int exno) throws Exception;
	
	// 전시관 수정 기능
	public boolean update(ExhibitionBoardDTO exDto) throws Exception;
	
	// 전시관 삭제 기능
	public boolean delete(int exno) throws Exception;
	
	// 전시관 목록 조회
	public List<ExhibitionBoardDTO> listAll() throws Exception;
	
	// 전시관 페이징 뷰
	public List<ExhibitionBoardDTO> getListWithPaging(Criteria cri);
	
	// 전시관 조회수
	public void updateViewCnt(int exno) throws Exception;
	
	// 좋아요 증가
	public void increaseLikes(int exno) throws Exception;
	
	// 좋아요 감소
	public void decreaseLikes(int exno) throws Exception;
	
	// 좋아요 반환
	public void getLikes(int exno) throws Exception;
}
