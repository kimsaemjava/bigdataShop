package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{
	
	@RequestMapping("/index.do")
	public String main(){
		System.out.println("어노테이션 기반");
		return "index";
	}
	
	@RequestMapping("admin/index.do")
	public String adminmain(){
		System.out.println("어노테이션 기반");
		return "admin/index";
	}
}
