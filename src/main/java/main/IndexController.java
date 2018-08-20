package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.kitri.bigdataShop.product.*;

@Controller
public class IndexController{
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/index.do")
	public ModelAndView main(){
		System.out.println("어노테이션 기반");
		//hit상품과 new상품을 조회하는 서비스의 메소드를 호출하고
		//ModelAndView에 hit상품과 new상품을 attribute로 저장
		
		ModelAndView mav = new ModelAndView();
		List<ProductDTO> hitproduct = service.hitproduct();
		List<ProductDTO> newproduct = service.newproduct();
		
		mav.addObject("hitproduct", hitproduct);
		mav.addObject("newproduct", newproduct);
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/admin/index.do")
	public String adminmain(){
		System.out.println("관리자 어노테이션 기반");
		return "admin/index";
	}
	
}
