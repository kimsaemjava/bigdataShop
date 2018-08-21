package kr.kitri.bigdataShop.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productdao")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SqlSession sqlSession; // dao연동하는 메소드가 정의되어 있는 템플릿 클래스

  	@Override
	public List<ProductDTO> productlist(String category) {	
		String action="";
		if(category==null) {
			action = "kr.kitri.bigdataShop.product.listall";
		}else {
			action = "kr.kitri.bigdataShop.product.categorySearch";
		}
		List<ProductDTO> list = sqlSession.selectList(action, category);
		System.out.println(list);
		return list;
	}
 

	@Override
	public List<ProductDTO> hitproduct() {
		return sqlSession.selectList("kr.kitri.bigdataShop.product.hitprd");
	}

	@Override
	public List<ProductDTO> newproduct() {
		return sqlSession.selectList("kr.kitri.bigdataShop.product.newprd");

	}

	@Override
	public ProductDTO read(String prd_no) {
		return sqlSession.selectOne("kr.kitri.bigdataShop.product.read", prd_no);
	}

}
