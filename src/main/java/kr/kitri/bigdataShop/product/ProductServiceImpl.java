package kr.kitri.bigdataShop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier("productdao")
	ProductDAO dao;
	
	@Override
	public List<ProductDTO> productlist(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> hitproduct() {
		return dao.hitproduct();
	}

	@Override
	public List<ProductDTO> newproduct() {
		return dao.newproduct();
	}

	@Override
	public ProductDTO read(String prd_no) {
		// TODO Auto-generated method stub
		return null;
	}

}
