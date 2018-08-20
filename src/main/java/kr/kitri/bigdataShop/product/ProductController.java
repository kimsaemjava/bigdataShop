package kr.kitri.bigdataShop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	//상품 전체보기
	@RequestMapping("/product/list.do")
	public String list(String category, Model model){
		System.out.println(category);
		if(category.equals("outer")) {
			category= "CAT000000004";
		}else if(category.equals("dress")) {
			category= "CAT000000001";
		}else if(category.equals("acc")) {
			category= "CAT000000005";
		}else if(category.equals("top")) {
			category= "CAT000000002";
		}else if(category.equals("bottom")) {
			category= "CAT000000003";
		}
		List<ProductDTO> categorylist =service.productlist(category);
		model.addAttribute("categorylist", categorylist);
		return "product/prdlist";
	}
	@RequestMapping("/product/list2.do")
	public String list2(){
		System.out.println("어노테이션 기반");
		return "product/prdlist2";
	}
}
