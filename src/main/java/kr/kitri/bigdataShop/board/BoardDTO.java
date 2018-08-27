package kr.kitri.bigdataShop.board;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class BoardDTO {
	private String board_no;
	private String id;
	private String title;
	private String text;
	private int hit;
	private String del_flg;
	private String reg_dtm;
	private String mod_dtm;
	private MultipartFile[] upFile;
	
	public BoardDTO() {
		super();
	}
	
	public BoardDTO(String board_no, String id, String title, String text, int hit, String del_flg, String reg_dtm,
			String mod_dtm, MultipartFile[] upFile) {
		super();
		this.board_no = board_no;
		this.id = id;
		this.title = title;
		this.text = text;
		this.hit = hit;
		this.del_flg = del_flg;
		this.reg_dtm = reg_dtm;
		this.mod_dtm = mod_dtm;
		this.upFile = upFile;
	}

	@Override
	public String toString() {
		return "BoardDTO [board_no=" + board_no + ", id=" + id + ", title=" + title + ", text=" + text + ", hit=" + hit
				+ ", del_flg=" + del_flg + ", reg_dtm=" + reg_dtm + ", mod_dtm=" + mod_dtm + ", upFile="
				+ Arrays.toString(upFile) + "]";
	}

	

	public String getBoard_no() {
		return board_no;
	}

	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getDel_flg() {
		return del_flg;
	}

	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}

	public String getReg_dtm() {
		return reg_dtm;
	}

	public void setReg_dtm(String reg_dtm) {
		this.reg_dtm = reg_dtm;
	}

	public String getMod_dtm() {
		return mod_dtm;
	}

	public void setMod_dtm(String mod_dtm) {
		this.mod_dtm = mod_dtm;
	}

	public MultipartFile[] getUpFile() {
		return upFile;
	}

	public void setUpFile(MultipartFile[] upFile) {
		this.upFile = upFile;
	}
	

}

