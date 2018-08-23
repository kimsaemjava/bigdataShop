package kr.kitri.bigdataShop.board;

import org.springframework.web.multipart.MultipartFile;

public class UploadDTO {
	private MultipartFile upFile;

	public MultipartFile getUpFile() {
		return upFile;
	}

	public void setUpFile(MultipartFile upFile) {
		this.upFile = upFile;
	}

	@Override
	public String toString() {
		return "UploadDTO [upFile=" + upFile + "]";
	}

	public UploadDTO() {
		super();
	}

	public UploadDTO(MultipartFile upFile) {
		super();
		this.upFile = upFile;
	}
	
	
	
}
