package com.lec.spring;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("HomeController() 생성");		
	}
	
	@RequestMapping("/")
	public String now(Model model) {
		LocalDateTime t = LocalDateTime.now();
		model.addAttribute("serverTime", t);
		return "home";   // "/WEB-INF/views/home.jsp" 으로 forwarding
		
	}
	
	// URL -> Handler mapping,  
	// url, handler 이름, 뷰 이름  ← 꼭 같은 필요는 없다. (그러나, 일반적으로는 같거나 동일한 맥락으로 작명한다)
	@RequestMapping("/common")
	public String cccmmm() {  // 핸들러 이름은 중요하진 않다.
		return "comn";
	}
	
	
	
}
