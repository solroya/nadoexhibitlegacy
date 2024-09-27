package com.exhibit.nado.service;

import com.exhibit.nado.domain.MemberDTO;

public interface IMemberService {

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
	
	//아이디 중복 체크
	public int idCheck(String memid) throws Exception;
	
	//이메일 중복 체크
	public int emailCheck(String mememail) throws Exception;
}
