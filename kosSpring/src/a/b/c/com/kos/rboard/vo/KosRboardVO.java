package a.b.c.com.kos.rboard.vo;

public class KosRboardVO {
	
	private String rbnum;
	private String bnum;
	private String rbname;
	private String rbcontent;
	private String insertdate;	
	
	public KosRboardVO() {
	}
	
	public KosRboardVO(String rbnum, String bnum, String rbname, String rbcontent, String insertdate) {
		super();
		this.rbnum = rbnum;
		this.bnum = bnum;
		this.rbname = rbname;
		this.rbcontent = rbcontent;
		this.insertdate = insertdate;
	}
	
	public String getRbnum() {
		return rbnum;
	}
	public void setRbnum(String rbnum) {
		this.rbnum = rbnum;
	}
	public String getBnum() {
		return bnum;
	}
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	public String getRbname() {
		return rbname;
	}
	public void setRbname(String rbname) {
		this.rbname = rbname;
	}
	public String getRbcontent() {
		return rbcontent;
	}
	public void setRbcontent(String rbcontent) {
		this.rbcontent = rbcontent;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	
	

}
