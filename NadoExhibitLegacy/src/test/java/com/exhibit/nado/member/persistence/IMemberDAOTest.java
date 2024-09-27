package com.exhibit.nado.member.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.Session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exhibit.nado.domain.MemberDTO;
import com.exhibit.nado.persistence.IMemberDAO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class IMemberDAOTest {

	@Autowired
	private IMemberDAO mDao;

	// 회원 가입 테스트
//	@Test
//	public void joinMemberTest() throws Exception {
//		MemberDTO mDto = new MemberDTO();
//		mDto.setMemid("DAOTestDummy2");
//		mDto.setMememail("DAOTestDummy2@test.com");
//		mDto.setMempass("DAOTestPass");
//		mDto.setIscheckterms('Y');
//		mDao.joinMember(mDto);
//		log.info("mDto 객체 : {}", mDto.toString());
//	}
	
	// 회원 정보 조회 테스트
//	@Test
//	public void selMemberTest() throws Exception {
//		//Given: 테스트할 회원 정보
//		MemberDTO mDto = new MemberDTO();
//		mDto.setMememail("test0@test.com");
//		//When: 회원 정보를 조회
//		boolean result = mDao.selMember(mDto);
//		//Then
//		assertTrue(result);
//		log.info("selMemberTestReult : {}", result);
//	}
	
	// 회원 로그인 테스트
//	@Test
//	public void loginMemberTest() throws Exception{
//		MemberDTO mDto = mDao.loginMember("testdummy", "password");
//		log.info("mDto : {}", mDto);
//	}
	
	// 회원 정보 수정 테스트
//	@Test
//	public void updateMember() throws Exception{
//		MemberDTO newMem = new MemberDTO();
//		newMem.setMememail("test0@test.com");
//		newMem.setMempass("newpassword"); 
//		
//		int reuslt = mDao.updateMember(newMem);
//		assertEquals(1, reuslt);
//	}
	
	// memid 중복 체크
//	@Test
//	public void idCheckTest() throws Exception{
//		String memid = "testdummy";
//		int result = mDao.idCheck(memid);
//		
//		assertEquals(1, result);
//	}
	
	// 이메일 중복 체크
	@Test
	public void emailCheckTest() throws Exception {
		String memeamil = "test1@test.com";
		int result = mDao.emailCheck(memeamil);
		assertEquals(1, result);
	}
}
