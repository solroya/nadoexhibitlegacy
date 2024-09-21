package com.exhibit.nado.member.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exhibit.nado.domain.ExhibitionBoardDTO;
import com.exhibit.nado.persistence.IExhibitionBoardDAO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class ExhibitionBoardDAOTest {

	@Autowired
	private IExhibitionBoardDAO ebDao;

//	@Test
//	public void existTest() {
//		log.info("ebDao: {}", ebDao);
//	}

//	@Test
//	public void createTest() throws Exception {
//		ExhibitionBoardDTO exBoardDto = new ExhibitionBoardDTO();
//		exBoardDto.setMememail("DAOTestDummy1@test.com");
//		exBoardDto.setMemid("DAOTestDummy1");
//		exBoardDto.setTitle("코드 수정이 반영된 전시관");
//		exBoardDto.setPicture("pictuer.png");
//		exBoardDto.setContent("테스트 코드 수정된 전시관");
//		try {
//			log.info("CreatedExhibition: {}", ebDao);
//			ebDao.create(exBoardDto);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	public void listAllTest() {
//		try {
//			ebDao.listAll().forEach(exhibition -> log.info(exhibition.toString()));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	public void readTest() {
//		try {
//			log.info("exno: {}", ebDao.read(11));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	public void updateTest() throws Exception {
//		// 수정 전 전시관 내용 확인
//		ExhibitionBoardDTO exBoardDto = ebDao.read(5);
//
//		// 전시관 내용 수정
//		exBoardDto.setTitle("업데이트된 제목");
//		exBoardDto.setContent("업데이트된 내용");
//		exBoardDto.setContent("업데이트된 컨텐츠");
//		ebDao.update(exBoardDto);
//	}

	@Test
	public void deleteTest() throws Exception {
		log.info("deleted exhibitionBoard : {}", ebDao.delete(4));
	}
}
