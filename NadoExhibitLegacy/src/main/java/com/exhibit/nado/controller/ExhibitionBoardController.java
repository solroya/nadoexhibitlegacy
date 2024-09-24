package com.exhibit.nado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.exhibit.nado.domain.Criteria;
import com.exhibit.nado.domain.ExhibitionBoardDTO;
import com.exhibit.nado.domain.PageDTO;
import com.exhibit.nado.service.IExhibitionBoardService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/exboard")
@Slf4j
public class ExhibitionBoardController {

	@Autowired
	private IExhibitionBoardService service;
	
	// 전시관 목록 조회
	@GetMapping("/exlist")
	public void listAll(Criteria cri, Model model) throws Exception {
		log.info("Show All List..");
		model.addAttribute("list", service.getListAll(cri));
		model.addAttribute("pageMaker", new PageDTO(123, cri));
	}
	
	// 전시관 등록
	@GetMapping("/register")
	public void registerGET(ExhibitionBoardDTO exDto, Model model) throws Exception {
		log.info("registerGET....");
	}
	
	@PostMapping("/register")
	public String registerPOST(ExhibitionBoardDTO exDto, RedirectAttributes rttr) throws Exception {
		log.info("registerPOST.......");
		log.info("exDto : {}", exDto);
		
		service.create(exDto);
		rttr.addFlashAttribute("result", exDto.getExno());
		log.info("getExno : {} ", exDto.getExno());
		
		return "redirect:/exboard/exlist";
	}
	
	// 전시관 조회 & 조회수 증가 반영
	@GetMapping("/read")
	public void read(@RequestParam("exno") int exno, Model model) throws Exception {
		service.updateViewCnt(exno);
		model.addAttribute("exboard", service.read(exno));
	}
	
	// 전시관 수정
	@GetMapping("modify")
	public void modifyGET(@RequestParam("exno") int exno, Model model) throws Exception {
		model.addAttribute("exboard", service.read(exno));
	}
	
	@PostMapping("modify")
	public String modifyPOST(ExhibitionBoardDTO exDto, RedirectAttributes rttr) throws Exception {
		log.info("modiftPOST....{}", exDto);
		
		if (service.update(exDto)) {
			rttr.addFlashAttribute("result", "modify");
		}
		
		return "redirect:/exboard/exlist";
	}
	
	// 전시관 삭제
	@PostMapping("/remove")
	public String remove(@RequestParam("exno") int exno, RedirectAttributes rttr) throws Exception{
		log.info("remove.....{}", exno);
		if (service.delete(exno)) {
			rttr.addFlashAttribute("result", "delete");
		}
		
		return "redirect:/exboard/exlist";
	}
	
	
}
