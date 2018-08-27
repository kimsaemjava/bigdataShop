package kr.kitri.bigdataShop.product.comment;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductCommentController {
	@Autowired
	ProductCommentService service;
	

	@RequestMapping(value = "/product/cmtinsert.do", method=RequestMethod.GET, produces="application/json;charset=utf-8" )
	public @ResponseBody List<ProductCommentDTO> cmtinsert(ProductCommentDTO prdcmt) {
		int result = service.prdcmtinsert(prdcmt);
		System.out.println(result+"개 prdcmt 삽입 성공");
		List<ProductCommentDTO> prdcmtlist = service.prdcmtlist(prdcmt.getPrd_no());
		return prdcmtlist;
	}
	
	@RequestMapping(value = "/product/cmtdelete.do", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public @ResponseBody List<ProductCommentDTO> cmtdelete(ProductCommentDTO prdcmt) {
		int result = service.prdcmtdelete(prdcmt.getPrdcmt_no());
		System.out.println(result+"개 삭제 성공");
		List<ProductCommentDTO> prdcmtlist = service.prdcmtlist(prdcmt.getPrd_no());
		return prdcmtlist;
	}
}
