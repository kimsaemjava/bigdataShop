package kr.kitri.bigdataShop.board;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

@Controller
public class BoardController {
	@Autowired
	BoardService service;

	@RequestMapping("/board/list.do")
	public String list(Model model) {

		model.addAttribute("boardlist", service.boardList());

		return "board/list";
	}

	@RequestMapping(value = "/board/insert.do", method = RequestMethod.POST)
	public String insert(BoardDTO data, HttpSession session) throws FileNotFoundException {
		MultipartFile[] file = null;
		ArrayList<String> filelist = new ArrayList<String>();
		String path = WebUtils.getRealPath(session.getServletContext(), "WEB-INF/upload");
		file = data.getfiles();
		for (int i = 0; i < file.length; i++) {
			if (!file[i].getOriginalFilename().equals("")) {
				filelist.add(file[i].getOriginalFilename());
			}
		}
		service.insert(file, data, filelist, path);
		return "redirect:/board/list.do";
	}
}
