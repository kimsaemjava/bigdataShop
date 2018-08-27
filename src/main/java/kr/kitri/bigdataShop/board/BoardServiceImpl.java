package kr.kitri.bigdataShop.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	@Qualifier("boarddao")
	BoardDAO dao;
	
	@Override
	public List<BoardDTO> boardList() {
		return dao.boardList();
	}

	@Override
	public List<BoardDTO> searchList(String search) {
		return null;
	}

	@Override
	public List<BoardDTO> searchList(String tag, String search) {
		return null;
	}

	@Override
	public List<BoardDTO> pageList() {
		return null;
	}
	
	@Override
	public int txinsert(BoardDTO data, ArrayList<String> filelist) {
		int result1 = dao.insert(data);
		int result2 = 0;
		System.out.println(filelist.size());
		if(filelist.size()!=0) {
			result2 = dao.fileInsert(filelist);
		}
		return result1+result2;
	}
	

}
