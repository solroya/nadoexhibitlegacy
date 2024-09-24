package com.exhibit.nado.persistence.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.exhibit.nado.domain.Criteria;
import com.exhibit.nado.domain.ExhibitionBoardDTO;
import com.exhibit.nado.persistence.IExhibitionBoardDAO;

import lombok.extern.slf4j.Slf4j;

@Repository
public class ExhibitionBoardDAOImpl implements IExhibitionBoardDAO {

	// 필드 주입
	@Autowired
	private SqlSession session;

	private static final String NAMESPACE = "exhibitonBoardMapper";

	// 전시관 목록 조회
	@Override
	public List<ExhibitionBoardDTO> listAll() throws Exception {
		return session.selectList(NAMESPACE + ".listAll");
	}

	// 전시관 등록
	@Override
	public void create(ExhibitionBoardDTO exDto) throws Exception {
		session.insert(NAMESPACE + ".create", exDto);
	}

	// 전시관 수정
	@Override
	public boolean update(ExhibitionBoardDTO exDto) throws Exception {
		if (session.update(NAMESPACE + ".update", exDto) == 1) {
			return true;
		} else {
			return false;
		}
	}

	// 전시관 삭제
	@Override
	public boolean delete(int exno) throws Exception {
		if (session.delete(NAMESPACE + ".delete", exno) == 1) {
			return true;
		} else {
			return false;
		}
	}

	// 특정 전시관 조회
	@Override
	public ExhibitionBoardDTO read(int exno) throws Exception {
		return session.selectOne(NAMESPACE + ".read", exno);
	}

	// 전시관 조회수 증가
	@Override
	public void updateViewCnt(int exno) throws Exception {
		session.update(NAMESPACE + ".updateViewCnt", exno);
	}

	@Override
	public void increaseLikes(int exno) throws Exception {
		session.update(NAMESPACE + ".increaseLikes", exno);
	}

	@Override
	public void decreaseLikes(int exno) throws Exception {
		session.update(NAMESPACE + ".decreaseLikes", exno);
	}

	@Override
	public void getLikes(int exno) throws Exception {
		session.selectOne(NAMESPACE + "getLikes", exno);
	}

	@Override
	public List<ExhibitionBoardDTO> getListWithPaging(Criteria cri) {
		return session.selectList(NAMESPACE + ".getListWithPaging", cri);
	}
	
	

}
