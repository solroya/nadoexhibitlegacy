package com.exhibit.nado.member.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exhibit.nado.IMemberDAO;
import com.exhibit.nado.domain.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class IMemberDAOTest {

	@Autowired
	private IMemberDAO mDao;

//	@Test
//	public void joinMemberTest() throws Exception {
//		MemberDTO mDto = new MemberDTO();
//		mDto.setMemid("DAOTestDummy2");
//		mDto.setMememail("DAOTestDummy2@test.com");
//		mDto.setMempass("DAOTestPass");
//		mDto.setIscheckterms('Y');
//		mDao.joinMember(mDto);
//		//TODO Log
//		log.info("mDto 객체 : {}", mDto.toString());
//	}
	
	@Test
	public void loginMemberTest() throws Exception{
		MemberDTO mDto = mDao.loginMember("testdummy", "password");
		log.info("mDto : {}", mDto);
	}

}
