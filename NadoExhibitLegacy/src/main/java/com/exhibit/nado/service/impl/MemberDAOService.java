package com.exhibit.nado.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exhibit.nado.domain.MemberDTO;
import com.exhibit.nado.persistence.IMemberDAO;
import com.exhibit.nado.service.IMemberService;

@Service
public class MemberDAOService implements IMemberService{
	
	@Autowired
	private IMemberDAO mDao;

	@Override
	public void joinMember(MemberDTO mDto) throws Exception {
		mDao.joinMember(mDto);
	}

	@Override
	public boolean selMember(MemberDTO mDto) throws Exception {
		return mDao.selMember(mDto);
	}

	@Override
	public int logout(MemberDTO mDto) throws Exception {
		return 0;
	}

	@Override
	public int updateMember(MemberDTO mDto) throws Exception {
		return mDao.updateMember(mDto);
	}

	@Override
	public MemberDTO loginMember(MemberDTO mDto) throws Exception {
		return mDao.loginMember(mDto);
	}

	@Override
	public int idCheck(String memid) throws Exception {
		return mDao.idCheck(memid);
	}

	@Override
	public int emailCheck(String mememail) throws Exception {
		return mDao.emailCheck(mememail);
	}

}
