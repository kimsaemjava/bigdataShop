package kr.kitri.bigdataShop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	// 전체상품 보기, 카테고리별 보기 ~ String으로 카테고리
	@Autowired
	ProductService service;

	@RequestMapping("/product/list.do")
	public String list(String category, Model model) {
		System.out.println("어노테이션 기반");
		System.out.println("카테고리: "+category);
		List<ProductDTO> productlist = null;
		productlist = service.productlist(category);

		System.out.println("상품목록: "+productlist);
		model.addAttribute("productlist", productlist);
		return "product/list";

	}

	@RequestMapping("/product/list2.do")
	public String list2() {
		System.out.println("어노테이션 기반");
		return "product/prdlist2";
	}
}
