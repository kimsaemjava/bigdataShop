package kr.kitri.bigdataShop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	// 전체상품보기, 카테고리별 보기
	@RequestMapping("/product/list.do")
	public ModelAndView list(String category){
		System.out.println("카테고리 : "+category);
		ModelAndView mav = new ModelAndView();
		List<ProductDTO> list = service.productlist(category);
		mav.addObject("prdlist", list);	// DB에서 조회한 결과 - 서블릿에서 request.setAttribute
		mav.setViewName("product/list");
		return mav;
	}
	
	/*@RequestMapping("/product/list.do")
	public String list(String category, Model model){
		System.out.println("어노테이션 기반");
		List<ProductDTO> productlist = service.productlist(category);
		model.addAttribute("productlist", productlist);
		System.out.println("카테고리 : "+category+", 결과 : "+productlist);
		return "product/list";
	}*/
	
	// 상품상세보기
	@RequestMapping("/product/{category_no}/{prd_no}")
	public String showProduct(@PathVariable String category_no, @PathVariable String prd_no, Model model) {
		ProductDTO prd = service.read(prd_no);
		model.addAttribute("product", prd);
		return "product/read";
	}
}