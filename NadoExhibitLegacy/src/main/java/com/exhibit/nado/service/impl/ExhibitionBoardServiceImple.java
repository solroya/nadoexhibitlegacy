package com.exhibit.nado.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exhibit.nado.domain.Criteria;
import com.exhibit.nado.domain.ExhibitionBoardDTO;
import com.exhibit.nado.persistence.IExhibitionBoardDAO;
import com.exhibit.nado.service.IExhibitionBoardService;

@Service
public class ExhibitionBoardServiceImple implements IExhibitionBoardService{
	
	//필드 주입 방식
	@Autowired
	private IExhibitionBoardDAO exDao;

	@Override
	public void create(ExhibitionBoardDTO exDto) throws Exception {
		exDao.create(exDto);
		
	}

	@Override
	public ExhibitionBoardDTO read(Integer exno) throws Exception {
		return exDao.read(exno);
	}

	@Override
	public boolean update(ExhibitionBoardDTO exDto) throws Exception {
		return exDao.update(exDto);
	}

	@Override
	public boolean delete(Integer exno) throws Exception {
		return exDao.delete(exno);
	}

	@Override
	public List<ExhibitionBoardDTO> listAll() throws Exception {
		return exDao.listAll();
	}

	@Override
	public void updateViewCnt(Integer exno) throws Exception {
		exDao.updateViewCnt(exno);
	}

	@Override
	public void increaseLikes(Integer exno) throws Exception {
		exDao.increaseLikes(exno);
	}

	@Override
	public void decreaseLikes(Integer exno) throws Exception {
		exDao.increaseLikes(exno);
	}

	@Override
	public List<ExhibitionBoardDTO> getListAll(Criteria cri) throws Exception {
		return exDao.getListWithPaging(cri);
	}



}
