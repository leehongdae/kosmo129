package a.b.c.com.kos.product.vo;

public class KosProductVO {
	
	private String kpnum;
	private String kpid;
	private String kpname;
	private String kpcompany;
	private String kpfile;
	private String kpcnt;
	private String kpprice;
	private String kpdesc;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	private String pageSize;
	private String groupSize;
	private String curPage;
	private String totalCount;
	
	
	public KosProductVO() {
	}
	
	public KosProductVO(String kpnum, String kpid, String kpname, String kpcompany, String kpfile, String kpcnt,
			String kpprice, String kpdesc, String deleteyn, String insertdate, String updatedate) {
		super();
		this.kpnum = kpnum;
		this.kpid = kpid;
		this.kpname = kpname;
		this.kpcompany = kpcompany;
		this.kpfile = kpfile;
		this.kpcnt = kpcnt;
		this.kpprice = kpprice;
		this.kpdesc = kpdesc;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	
	public KosProductVO(String kpnum, String kpid, String kpname, String kpcompany, String kpfile, String kpcnt,
			String kpprice, String kpdesc, String deleteyn, String insertdate, String updatedate, String pageSize,
			String groupSize, String curPage, String totalCount) {
		super();
		this.kpnum = kpnum;
		this.kpid = kpid;
		this.kpname = kpname;
		this.kpcompany = kpcompany;
		this.kpfile = kpfile;
		this.kpcnt = kpcnt;
		this.kpprice = kpprice;
		this.kpdesc = kpdesc;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.pageSize = pageSize;
		this.groupSize = groupSize;
		this.curPage = curPage;
		this.totalCount = totalCount;
	}




	public String getPageSize() {
		return pageSize;
	}


	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}


	public String getGroupSize() {
		return groupSize;
	}


	public void setGroupSize(String groupSize) {
		this.groupSize = groupSize;
	}


	public String getCurPage() {
		return curPage;
	}


	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}


	public String getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}


	public String getKpnum() {
		return kpnum;
	}
	public void setKpnum(String kpnum) {
		this.kpnum = kpnum;
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
	public String getKpcompany() {
		return kpcompany;
	}
	public void setKpcompany(String kpcompany) {
		this.kpcompany = kpcompany;
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
	public String getKpdesc() {
		return kpdesc;
	}
	public void setKpdesc(String kpdesc) {
		this.kpdesc = kpdesc;
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
