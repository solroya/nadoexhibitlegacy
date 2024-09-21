package com.exhibit.nado.contest;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class DataSourceTest {

	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		//1.7 버젼 이상부터 가능함
		try (Connection con = dataSource.getConnection()){
			log.info("testConnection {}", con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Setter(onMethod_ = {@Autowired})
//	private SqlSessionFactory sqlSessionFactory;
//	
//	@Test
//	public void testMybatis() {
//		try(SqlSession session = sqlSessionFactory.openSession();
//				Connection con = dataSource.getConnection()) {
//			log.info("sqlSessionFactory : ", sqlSessionFactory);
//			log.info("con : ", con);
//		} catch (Exception e) {
//			fail(e.getMessage()); //이런식으로도 사용 가능함
//		}
//	}

}
