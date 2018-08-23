package kr.kitri.bigdataShop.product;

import java.util.List;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kitri.bigdataShop.product.comment.ProductCommentDTO;
import kr.kitri.bigdataShop.product.comment.ProductCommentService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	@Autowired
	ProductCommentService service2;
	
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
	@RequestMapping("/product/{category_no}/{prd_no}")
	public String showProduct(@PathVariable String category_no, @PathVariable String prd_no,Model model) {
		//System.out.println("상품조회:"+prd_no);
		
		//쿠키에 상품 번호저장
		/*Cookie cookie = new Cookie("prd_no", prd_no);
		cookie.setMaxAge(60*60*24);*/

		//상품상세정보
		ProductDTO product = service.read(prd_no);
		//댓글list
		List<ProductCommentDTO> prdcmtlist = service2.prdcmtlist(prd_no);
		model.addAttribute("product", product);
		model.addAttribute("prdcmtlist", prdcmtlist);
		return "product/read";
	}

}
