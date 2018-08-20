package kr.kitri.bigdataShop.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("productdao")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<ProductDTO> productlist(String category) {
		return sqlSession.selectList("kr.kitri.product.allproduct", category);
	}

	@Override
	public List<ProductDTO> hitproduct() {
		return sqlSession.selectList("kr.kitri.product.mainhitproduct");
	}

	@Override
	public List<ProductDTO> newproduct() {
		return sqlSession.selectList("kr.kitri.product.mainnewproduct");
	}

	@Override
	public ProductDTO read(String prd_no) {
		// TODO Auto-generated method stub
		return null;
	}

}
