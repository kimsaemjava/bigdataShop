package kr.kitri.bigdataShop.product.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("prdcmtservice")
public class ProductCommentServieImpl implements ProductCommentService {

	@Autowired
	@Qualifier("prdcmtdao")
	ProductCommentDAO dao;

	@Override
	public int prdcmtinsert(ProductCommentDTO prdcmtDTO) {
		return dao.prdcmtinsert(prdcmtDTO);
	}

	@Override
	public List<ProductCommentDTO> prdcmtlist() {
		return dao.prdcmtlist();
	}

	@Override
	public int prdcmtdelete() {
		return dao.prdcmtdelete();
	}
	

}
