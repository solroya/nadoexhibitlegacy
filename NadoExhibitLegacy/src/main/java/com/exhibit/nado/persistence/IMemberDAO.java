package com.exhibit.nado.persistence;

import org.springframework.stereotype.Repository;

import com.exhibit.nado.domain.MemberDTO;

@Repository
public interface IMemberDAO {
	
	//추상 메서드 선언
	
	//회원 가입 기능
	public void joinMember(MemberDTO mDto) throws Exception;
	
	//로그인 기능
	public MemberDTO loginMember(MemberDTO mDto) throws Exception;
	
	//회원 정보 조회 기능
	public boolean selMember(MemberDTO mDto) throws Exception;
	
	//로그 아웃 기능
	public int logout(MemberDTO mDto) throws Exception;
	
	//회원 정보 수정 기능
	public int updateMember(MemberDTO mDto) throws Exception;
	
	//memid 중복 체크
	public int idCheck(String memid) throws Exception;
	
	//mememail 중복 체크
	public int emailCheck(String mememail) throws Exception;
}
