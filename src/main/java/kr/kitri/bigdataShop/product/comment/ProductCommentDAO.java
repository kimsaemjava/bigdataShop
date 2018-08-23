package kr.kitri.bigdataShop.product.comment;

import java.util.List;

public interface ProductCommentDAO {
	int prdcmtinsert(ProductCommentDTO prdcmtDTO);
	List<ProductCommentDTO> prdcmtlist();
	int prdcmtdelete(String prdcmt_no);
}