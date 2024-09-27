package com.exhibit.nado.persistence.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exhibit.nado.domain.MemberDTO;
import com.exhibit.nado.persistence.IMemberDAO;

@Repository
public class MemberDAOImpl implements IMemberDAO {

	// 세션 객체 주입
	@Autowired
	private SqlSession session;

	private static final String NAMESPACE = "memberMapper";

	// 회원 가입기능
	@Override
	public void joinMember(MemberDTO mDto) throws Exception {
		session.insert(NAMESPACE + ".joinMember", mDto);
	}

	// 로그인 기능
	@Override
	public MemberDTO loginMember(MemberDTO mDto) throws Exception {
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("memid", memid);
//		paramMap.put("mempass", mempass);
		return session.selectOne(NAMESPACE + ".loginMember", mDto);
	}
	
	// 회원 정보 조회
	@Override
	public boolean selMember(MemberDTO mDto) {
		MemberDTO resultOfSearch = session.selectOne(NAMESPACE + ".selMember", mDto.getMememail());
		return resultOfSearch != null;

	}

	// 로그아웃 기능
	@Override
	public int logout(MemberDTO mDto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	// 회원 정보 수정
	@Override
	public int updateMember(MemberDTO mDto) throws Exception {

        // MyBatis update 쿼리 호출
        return session.update(NAMESPACE + ".updateMember", mDto);
	}

	// 아이디 중복 체크
	@Override
	public int idCheck(String memid) throws Exception {
		return session.selectOne(NAMESPACE + ".idCheck", memid);
	}

	// 이메일 중복 체크
	@Override
	public int emailCheck(String mememail) throws Exception {
		return session.selectOne(NAMESPACE +".emailCheck", mememail);
	}

}
