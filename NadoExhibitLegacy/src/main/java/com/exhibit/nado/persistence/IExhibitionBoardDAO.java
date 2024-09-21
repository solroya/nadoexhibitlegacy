package com.exhibit.nado.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

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
	
}
