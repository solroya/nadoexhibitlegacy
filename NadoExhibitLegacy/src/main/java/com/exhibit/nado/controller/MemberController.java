package com.exhibit.nado.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.exhibit.nado.domain.MemberDTO;
import com.exhibit.nado.service.IMemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private IMemberService service;
	
	// 회원 가입 기능
	@GetMapping(value = "/signup")
	public void joinMemberGET(MemberDTO mDto, Model model) throws Exception {
		log.info("joinMemberData..................");
	}
	
	@PostMapping(value = "/signup")
	public String joinMemberPOST(MemberDTO mDto, RedirectAttributes rttr) throws Exception {
		log.info("signup ...........");
		log.info("mDto ===> {}" , mDto);
		
		service.joinMember(mDto);
		rttr.addFlashAttribute("result {}", mDto.getMemno());
		log.info("resultofMemno: {}", mDto.getMemno());
		
		return "redirect:/";
	}
	
	// 아이디 중복검사 기능
	@GetMapping(value = "/memberidchk")
	public void memberIdChkGET() throws Exception {
		log.info("memberIdChk GET 진입........");
	}
	
	@ResponseBody
	@PostMapping(value = "/memberidchk")
	public String memberIdChkPost(String memid) throws Exception {
		log.info("memberIdChk POST 진입........");
		int result = service.idCheck(memid);
		log.info("결과 : " + result);
		if (result != 0) {
			return "fail";
		} 
		return "success";
	}
	
	// 이메일 중복검사 기능
	@GetMapping(value = "/emailcheck")
	public void emailCheckGET() throws Exception {
		log.info("emailcheck GET 진입..........");
	}
	
	@PostMapping(value = "/emailcheck")
	@ResponseBody
	public String emailCheckPOST(String mememail) throws Exception {
		log.info("emailcheck POST 진입..........");
		int result = service.emailCheck(mememail);
		log.info("이메일 체크 결과: " + result);
		if (result != 0) {
			return "fail";
		} else {
			return "success";
		}
	}
	
	// 회원 정보 수정
	@GetMapping(value = "/updatemember")
	public void updateMemberGet(Model model) throws Exception {
	}
	
	@PostMapping(value = "updatemember")
	public String updateMemberPOST(MemberDTO mDto, RedirectAttributes rttr) throws Exception  {
		log.info("updatemDto.......");
		
		if (service.updateMember(mDto) == 1) {
			rttr.addFlashAttribute("updateMem", "updateComplete");
		}
		
		return "redirect:/";
	}
	
	// 로그인 
	@GetMapping(value = "/login")
	public void loginMemberGET() throws Exception {
		
	}
	
	@PostMapping(value = "login")
	public String loingMemberPOST(MemberDTO mDto, HttpSession session, RedirectAttributes rttr) throws Exception {
		log.info("JSP페이에서 넘어온 loginMember: ...........{}", mDto);
		
		MemberDTO loginUser = service.loginMember(mDto);
		
		if(loginUser != null) {
			session.setAttribute("loginUser", loginUser);
			return "redirect:/";
		}
		return "redirect:/member/login?error";
		
	}
	
	// 로그아웃
	@GetMapping(value = "/logout")
	public String logoutGET(HttpServletRequest req) throws Exception {
		log.info("로그아웃 컨트롤러.......");
		
		HttpSession session = req.getSession();
		session.invalidate();
		
		return "redirect:/";
	}
	
}
