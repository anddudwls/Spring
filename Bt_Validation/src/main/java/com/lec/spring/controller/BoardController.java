package com.lec.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lec.spring.domain.WriteDTO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("write")   // /board/write
	public void write() {}
	
	@RequestMapping("writeOk")
	public String writeOk(@ModelAttribute("w") WriteDTO dto,
			BindingResult result) {  // ← validator 가 유효성 검사를 한 결과를 담은 객체
		System.out.println("writeOk() : " + dto.getUid() + ":" + dto.getName());
		System.out.println("validate() 전"); showErrors(result);
		
		// Validator 생성 및 validation 수행
		Validator validator = new BoardValidator();
		validator.validate(dto, result);
		
		System.out.println("validate() 후"); showErrors(result);
		
		String page = "board/writeOk";
		return page;
	}
	
	// 에러 출력 도우미 메소드
	public void showErrors(Errors errors) {
		if(errors.hasErrors()) {
			System.out.println("에러 개수: " + errors.getErrorCount());  // 담긴 결과의 개수(에러의 개수)
			System.out.println("\t[field]\t|[code] ");
			List<FieldError> errList = errors.getFieldErrors();
			
			for(FieldError err : errList) {
				System.out.println("\t" + err.getField() + "\t|" + err.getCode());
			}			
		} else {
			System.out.println("에러 없슴");
		}
	}
	
}













