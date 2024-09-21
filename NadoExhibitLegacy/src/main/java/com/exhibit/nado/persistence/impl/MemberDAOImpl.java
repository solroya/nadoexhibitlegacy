package com.exhibit.nado.persistence.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.exhibit.nado.IMemberDAO;
import com.exhibit.nado.domain.MemberDTO;

public class MemberDAOImpl implements IMemberDAO {

	// 세션 객체 주입
	@Autowired
	private SqlSession session;

	private static final String NAMEPACE = "memberMapper";

	@Override
	public void joinMember(MemberDTO mDto) throws Exception {
		session.insert(NAMEPACE + ".joinMember", mDto);
	}

	@Override
	public MemberDTO loginMember(String memid, String mempass) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memid", memid);
		paramMap.put("mempass", mempass);
		return session.selectOne(NAMEPACE+".loginMember", paramMap);
	}

	@Override
	public MemberDTO selMember(MemberDTO mDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
