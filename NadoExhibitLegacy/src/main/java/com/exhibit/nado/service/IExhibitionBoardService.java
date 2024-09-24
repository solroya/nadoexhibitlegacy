package com.exhibit.nado.service;

import java.util.List;

import com.exhibit.nado.domain.Criteria;
import com.exhibit.nado.domain.ExhibitionBoardDTO;

public interface IExhibitionBoardService {
	// 전시관 등록
	public void create(ExhibitionBoardDTO exDto) throws Exception;
	
	// 특정 전시관 조회
	public ExhibitionBoardDTO read(Integer exno) throws Exception;
	
	// 전시관 수정 기능
	public boolean update(ExhibitionBoardDTO exDto) throws Exception;
	
	// 전시관 삭제 기능
	public boolean delete(Integer exno) throws Exception;
	
	// 전시관 목록 조회
	public List<ExhibitionBoardDTO> listAll() throws Exception;
	
	// 전시관 목록 페이징 뷰
	public List<ExhibitionBoardDTO> getListAll(Criteria cri) throws Exception;
 	
	// 전시관 조회수 증가
	public void updateViewCnt(Integer exno) throws Exception;
	
	// 좋아요 증가
	public void increaseLikes(Integer exno) throws Exception;
	
	// 좋아요 감소
	public void decreaseLikes(Integer exno) throws Exception;
	
}
