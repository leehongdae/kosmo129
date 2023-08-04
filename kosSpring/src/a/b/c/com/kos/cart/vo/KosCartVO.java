package a.b.c.com.kos.cart.vo;

public class KosCartVO {
	
	private String kcnum;
	private String kpid;
	private String kpname;
	private String kpfile;
	private String kpcnt;
	private String kpprice;
	private String kppricesum;
	private String kpnum;
	private String kmnum;
	private String deleteyn;
	private String insertdate;
	private String updatedate;	
	
	public KosCartVO() {
	}
	
	public KosCartVO(String kcnum, String kpid, String kpname, String kpfile, String kpcnt, String kpprice,
			String kppricesum, String kpnum, String kmnum, String deleteyn, String insertdate, String updatedate) {
		this.kcnum = kcnum;
		this.kpid = kpid;
		this.kpname = kpname;
		this.kpfile = kpfile;
		this.kpcnt = kpcnt;
		this.kpprice = kpprice;
		this.kppricesum = kppricesum;
		this.kpnum = kpnum;
		this.kmnum = kmnum;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	public String getKcnum() {
		return kcnum;
	}

	public void setKcnum(String kcnum) {
		this.kcnum = kcnum;
	}

	public String getKpid() {
		return kpid;
	}
	public void setKpid(String kpid) {
		this.kpid = kpid;
	}
	public String getKpname() {
		return kpname;
	}
	public void setKpname(String kpname) {
		this.kpname = kpname;
	}
	public String getKpfile() {
		return kpfile;
	}
	public void setKpfile(String kpfile) {
		this.kpfile = kpfile;
	}
	public String getKpcnt() {
		return kpcnt;
	}
	public void setKpcnt(String kpcnt) {
		this.kpcnt = kpcnt;
	}
	public String getKpprice() {
		return kpprice;
	}
	public void setKpprice(String kpprice) {
		this.kpprice = kpprice;
	}
	public String getKppricesum() {
		return kppricesum;
	}
	public void setKppricesum(String kppricesum) {
		this.kppricesum = kppricesum;
	}
	public String getKpnum() {
		return kpnum;
	}
	public void setKpnum(String kpnum) {
		this.kpnum = kpnum;
	}
	public String getKmnum() {
		return kmnum;
	}
	public void setKmnum(String kmnum) {
		this.kmnum = kmnum;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	
	

}
