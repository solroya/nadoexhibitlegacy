package com.exhibit.nado.persistence;

import org.springframework.stereotype.Repository;

import com.exhibit.nado.domain.MemberDTO;

@Repository
public interface IMemberService {

	//회원 가입 기능
	public void joinMember(MemberDTO mDto) throws Exception;
	
	//로그인 기능
	public MemberDTO loginMember(String memid, String mempass) throws Exception;
}
