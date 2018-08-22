package kr.kitri.bigdataShop.product.comment;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("prdcmtdao")
public class ProductCommentDAOImpl implements ProductCommentDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public int prdcmtinsert(ProductCommentDTO prdcmtDTO) {
		return sqlSession.insert("kr.kitri.bigdataShop.productcomment.insert", prdcmtDTO);
	}

	@Override
	public List<ProductCommentDTO> prdcmtlist() {
		return sqlSession.selectList("kr.kitri.bigdataShop.productcomment.cmtlist");
	}

	@Override
	public int prdcmtdelete() {
		return sqlSession.delete("kr.kitri.bigdataShop.productcomment.delete");
	}
	
	
}
