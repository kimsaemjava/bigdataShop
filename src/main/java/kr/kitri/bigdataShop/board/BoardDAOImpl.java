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
		Map<String, String> filemap = new HashMap<String, String>();
		for(int i=0;i<filelist.size();i++) {
			System.out.println(i);
			System.out.println("fileInsert DAO =========>"+filelist.get(i));
			filemap.put("file_name", filelist.get(i));
			sqlSession.insert("kr.kitri.board.upload",filemap);
		}
		return 0;
//		return sqlSession.insert("kr.kitri.board.upload",filelist);
	}

}
