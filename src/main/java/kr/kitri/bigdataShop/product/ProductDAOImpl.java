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
		String action = "";
		//System.out.println(category);
		if(category==null) {
			action = "kr.kitri.bigdataShop.product.prdlist";
		}else {
			action = "kr.kitri.bigdataShop.product.prdctglist";
		}
		List<ProductDTO> prdlist = sqlSession.selectList(action,category);
		//System.out.println(prdlist);
		return prdlist;
	}

	@Override
	public List<ProductDTO> hitproduct() {
		List<ProductDTO> hitprdlist = sqlSession.selectList("kr.kitri.bigdataShop.product.hitprd");
		return hitprdlist;
	}

	@Override
	public List<ProductDTO> newproduct() {
		List<ProductDTO> newprdlist = sqlSession.selectList("kr.kitri.bigdataShop.product.newprd");
		return newprdlist;
	}

	@Override
	public ProductDTO read(String prd_no) {
		return sqlSession.selectOne("kr.kitri.bigdataShop.product.read",prd_no);
	}

}
