package kr.kitri.bigdataShop.board;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

	FileOutputStream fos;

	@Override
	public int insert(MultipartFile[] file,BoardDTO data, ArrayList<String> filelist, String path) {
		if (filelist == null) {
			dao.insert(data);
		} else {
			dao.insert(data);
			dao.fileInsert(filelist);
			try {
				for (int i = 0; i < file.length; i++) {
					byte[] value = file[i].getBytes();
					for (int j = 0; j < filelist.size(); j++) {
						fos = new FileOutputStream(path + File.separator + filelist.get(j));
						fos.write(value);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fos!=null)fos.close();
				}catch(IOException e) {
					
				}
			}
		}
		return 0;
	}

}
