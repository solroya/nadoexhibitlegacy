package com.exhibit.nado.contest;

import static org.junit.Assert.fail;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class MybatisTest {

	//필드 주입 방식
	@Autowired
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		log.info("sqlFactory : {}", sqlFactory);
	}
	
	@Test
	public void testSession() {
		try (SqlSession session = sqlFactory.openSession()){
			log.info("session : {}", session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
