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
	
	//전체상품보기, 카테고리별 보기
	@RequestMapping("/product/list.do")
	public String list(String category, Model model){
		//System.out.println("어노테이션 기반");
		List<ProductDTO> prdlist = service.productlist(category);
		model.addAttribute("prdlist",prdlist);
		return "product/list";
	}
	@RequestMapping("/product/list2.do")
	public String list2(){
		System.out.println("어노테이션 기반");
		return "product/prdlist2";
	}
}
