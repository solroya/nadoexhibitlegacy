package com.exhibit.nado.service;

import java.util.List;

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
	
	
}
