package com.exhibit.nado.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

	private int memno; //회원 번호
	private String memid;//회원 ID
	private String mememail; //회원 이메일
	private String mempass; //회원 비밀번호
	private char ischeckterms; //회원 약관동의 여부
	private Timestamp regdate; //회원 가입일
	private Timestamp updatedate; //회원 정보 수정일
}
