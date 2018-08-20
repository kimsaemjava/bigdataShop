package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.kitri.bigdataShop.product.ProductDTO;
import kr.kitri.bigdataShop.product.ProductService;

@Controller
public class IndexController{
	@Autowired
	ProductService service;
	@RequestMapping("/index.do")
	public ModelAndView main(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("hitproduct",service.hitproduct());
		List<ProductDTO> newlist = service.newproduct();
		mav.addObject("newproduct",newlist);
		
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("/admin/index.do")
	public String adminmain(){
		System.out.println("어드민기반");
		return "admin/index";
	}
}
