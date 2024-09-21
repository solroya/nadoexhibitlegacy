package com.exhibit.nado.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Slf4j
@WebAppConfiguration
public class ExhibitonBoradTEST {

	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
//	public void testList() throws Exception {
//		log.info("testList ===> " + mockMvc.perform(MockMvcRequestBuilders
//				.get("/exboard/list"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());
//	}
	
//	@Test
//	public void testRegister() throws Exception {
//		log.info("testRegister ===> " + mockMvc.perform(MockMvcRequestBuilders
//				.post("/exboard/register")
//				.param("mememail", "test0@test.com")
//				.param("memid", "testdummy")
//				.param("title", "TestCode title")
//				.param("picture", "picture.com")
//				.param("content", "TestCode content"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());
//	}
	
//	@Test
//	public void testRead() throws Exception {
//		log.info("testRead ===> " + mockMvc.perform(MockMvcRequestBuilders
//				.get("/exboard/read")
//				.param("exno", "41"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());
//	}
	
//	@Test
//	public void testModify() throws Exception {
//		log.info("testModify ===> " + mockMvc.perform(MockMvcRequestBuilders
//				.post("/exboard/modify")
//				.param("exno", "41")
//				.param("mememail", "test0@test.com")
//				.param("memid", "testdummy")
//				.param("title", "TestCode title Modify")
//				.param("picture", "picture.com")
//				.param("content", "TestCode content Modify"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());
//	}
	
	@Test
	public void testRemove() throws Exception {
		log.info("testDelete ===> " + mockMvc.perform(MockMvcRequestBuilders
				.post("/exboard/remove")
				.param("exno", "10"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	}
	
	
	

}
