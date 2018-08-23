package kr.kitri.bigdataShop.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface BoardService {
	List<BoardDTO> boardList();
	List<BoardDTO> searchList(String search);
	List<BoardDTO> searchList(String tag,String search);
	List<BoardDTO> pageList();
	int insert(MultipartFile[] file,BoardDTO data,ArrayList<String> filelist,String path) ;
}
