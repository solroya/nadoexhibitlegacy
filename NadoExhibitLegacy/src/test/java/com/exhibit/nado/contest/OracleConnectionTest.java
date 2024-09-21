package com.exhibit.nado.contest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OracleConnectionTest {

	private final static String DRIVER = "oracle.jdbc.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final static String USER = "nado";
	private final static String PASS = "0000";

	// static 초기화 블럭 장점: 처음 한번만 기동되고, 첫 기동시 사용이 필요한 경우에 사용(드라이버를 먼저 로드)
	// try 사용 : DB와 IO 객체에서 사용 됨
	static {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test // 어노테이션이 없으면 테스트 코드로 인식할 수 없음.
	public void test() {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
			log.info("conn: {}", conn);
			System.out.println("conn : " + conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
