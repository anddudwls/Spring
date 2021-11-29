package com.lec.spring;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")  // "/" 로 request 가 오면 아래 메소드가 수행된다.
	public String now(Model model) {
		System.out.println("now() 실행");
		LocalDateTime t = LocalDateTime.now();
		model.addAttribute("serverTime", t.toString());
		//return "/WEB-INF/views/home.jsp";   // 리턴하는 문자열의 리소스를 '뷰'로 response
		return "home";
	}
	
	@RequestMapping("/aaa")
	public String aaa(Model model) {
		System.out.println("/aaa 실행");
		int a = new Random().nextInt(10);
		int b = new Random().nextInt(5);
		model.addAttribute("first", a);
		model.addAttribute("second", b);
		//return "/WEB-INF/views/aaa/my.jsp";
		return "aaa/my";
	}
	
	@RequestMapping("/aaa/bbb")
	public String aaabbb(Model model) {  // 핸들러 이름은 별로 중요하지 않다.
		System.out.println("/aaa/bbb 실행");
		int a = new Random().nextInt(10);
		int b = new Random().nextInt(5);
		model.addAttribute("first", a);
		model.addAttribute("second", b);
		return "aaa/bbb/title";   // => "/WEB-INF/views/aaa/bbb/title.jsp";
	}
	
}


















