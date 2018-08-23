package kr.kitri.bigdataShop.board;

import org.springframework.web.multipart.MultipartFile;

public class BoardDTO {
	private	String board_no;
	private String id;
	private String title;
	private String text;
	private int hit;
	private String DEL_FLG;
	private String REG_DTM;
	private String MOD_DTM;
	private MultipartFile[] files;
	
	
	public BoardDTO(String id, String title, String text) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
	}
	public BoardDTO() {
		super();
	}
	public BoardDTO(String board_no, String id, String title, String text, int hit, String dEL_FLG, String rEG_DTM,
			String mOD_DTM,MultipartFile[] files) {
		super();
		this.board_no = board_no;
		this.id = id;
		this.title = title;
		this.text = text;
		this.hit = hit;
		DEL_FLG = dEL_FLG;
		REG_DTM = rEG_DTM;
		MOD_DTM = mOD_DTM;
		this.files = files;
	}
	
	
	@Override
	public String toString() {
		return "BoardDTO [board_no=" + board_no + ", id=" + id + ", title=" + title + ", text=" + text + ", hit=" + hit
				+ ", DEL_FLG=" + DEL_FLG + ", REG_DTM=" + REG_DTM + ", MOD_DTM=" + MOD_DTM + ", files=" + files + "]";
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
	public String getDEL_FLG() {
		return DEL_FLG;
	}
	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}
	public String getREG_DTM() {
		return REG_DTM;
	}
	public void setREG_DTM(String rEG_DTM) {
		REG_DTM = rEG_DTM;
	}
	public String getMOD_DTM() {
		return MOD_DTM;
	}
	public void setMOD_DTM(String mOD_DTM) {
		MOD_DTM = mOD_DTM;
	}
	public MultipartFile[] getfiles() {
		return files;
	}
	public void setfiles(MultipartFile[] files) {
		this.files = files;
	}
	
	
	
}