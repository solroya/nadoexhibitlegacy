package com.exhibit.nado.member.persistence;

import static org.junit.Assert.*;

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
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", 
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Slf4j
@WebAppConfiguration
public class ExhibitionBoradServiceTest {

	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void createTest() throws Exception {
		log.info("createTest ========> " + mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("mememail", "test.test.com")
				.param("memid", "testdummy")
				.param("title", "Mock TEST")
				.param("picture", "picture.com")
				.param("content", "Mock Content"))
		.andReturn()
		.getModelAndView()
		.getModelMap());
	}

}
