package kr.kitri.bigdataShop.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("boarddao")
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> boardList() {
		return sqlSession.selectList("kr.kitri.board.boardlist");
	}

	@Override
	public List<BoardDTO> searchList(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> searchList(String tag, String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> pageList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardDTO data) {
		System.out.println("DAO==============>"+data);
		return sqlSession.insert("kr.kitri.board.insert",data);
	}

	@Override
	public int fileInsert(ArrayList<String> filelist) {
		Map<String, ArrayList<String>> filemap = new HashMap<String, ArrayList<String>>();
			filemap.put("file_name", filelist);
		return sqlSession.insert("kr.kitri.board.upload",filemap);
	}

}
