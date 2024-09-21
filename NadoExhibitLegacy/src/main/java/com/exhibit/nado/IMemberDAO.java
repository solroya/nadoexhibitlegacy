package com.exhibit.nado;

import org.springframework.stereotype.Repository;

import com.exhibit.nado.domain.MemberDTO;

@Repository
public interface IMemberDAO {
	
	//추상 메서드 선언
	
	//회원 가입 기능
	public void joinMember(MemberDTO mDto) throws Exception;
	
	//로그인 기능
	public MemberDTO loginMember(String memid, String mempass) throws Exception;
	
	//회원 정보 조회 기능
	public MemberDTO selMember(MemberDTO mDto) throws Exception;

}
