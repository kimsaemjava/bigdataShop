package kr.kitri.bigdataShop.product.comment;

import java.sql.Date;

public class ProductCommentDTO {
	private String prdcmt_no;
	private String prd_no;
	private String mem_id;
	private String pro_comment;
	private Date writedate;
	
	public ProductCommentDTO() {}

	public ProductCommentDTO(String prdcmt_no, String prd_no, String mem_id, String pro_comment, Date writedate) {
		super();
		this.prdcmt_no = prdcmt_no;
		this.prd_no = prd_no;
		this.mem_id = mem_id;
		this.pro_comment = pro_comment;
		this.writedate = writedate;
	}

	@Override
	public String toString() {
		return "ProductCommentDTO [prdcmt_no=" + prdcmt_no + ", prd_no=" + prd_no + ", mem_id=" + mem_id
				+ ", pro_comment=" + pro_comment + ", writedate=" + writedate + "]";
	}

	public String getPrdcmt_no() {
		return prdcmt_no;
	}

	public void setPrdcmt_no(String prdcmt_no) {
		this.prdcmt_no = prdcmt_no;
	}

	public String getPrd_no() {
		return prd_no;
	}

	public void setPrd_no(String prd_no) {
		this.prd_no = prd_no;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getPro_comment() {
		return pro_comment;
	}

	public void setPro_comment(String pro_comment) {
		this.pro_comment = pro_comment;
	}

	public Date getWritedate() {
		return writedate;
	}

	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}

	
}
