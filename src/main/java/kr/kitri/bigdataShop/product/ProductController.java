package kr.kitri.bigdataShop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	//전체상품보기, 카테고리별 보기
	@RequestMapping("/product/list.do")
	public String list(String category, Model model){
		//System.out.println(category);
		List<ProductDTO> prdlist = service.productlist(category);
		model.addAttribute("prdlist",prdlist);	//db에서 조회한 결과 
												//서블릿에서 request.setAttribute
		return "product/list";
	}
	
	//상품상세보기
	@RequestMapping("/{category_no}/{prd_no}")
	public String showProduct(@PathVariable String category_no,@PathVariable String prd_no,Model model) {
		//System.out.println("상품조회:"+prd_no);
		ProductDTO product = service.read(prd_no);
		model.addAttribute("product", product);
		return "product/read";
	}
}
