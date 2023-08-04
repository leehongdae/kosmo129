package a.b.c.com.kos.mem.vo;

public class KosMemberVO {

	private String mnum;
	private String mname;
	private String mid;
	private String mpw;
	private String mgender;
	private String mbirth;
	private String mhp;
	private String mtel;
	private String memail;
	private String mzonecode;
	private String mroadaddr;
	private String mroaddetail;
	private String mjibunaddr;
	private String mhobby;
	private String minfo;
	private String mphoto;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	private String keyword;
	private String searchFilter;
	private String startDate;
	private String endDate;
	
	private String snstype;
	private String snsid;
	private String snsemail;
	
	private String pageSize;
	private String groupSize;
	private String curPage;
	private String totalCount;
	
	public KosMemberVO() {
	}
	
	public KosMemberVO(String mnum, String mname, String mid, String mpw, String mgender, String mbirth, String mhp,
			String mtel, String memail, String mzonecode, String mroadaddr, String mroaddetail, String mjibunaddr,
			String mhobby, String minfo, String mphoto, String deleteyn, String insertdate, String updatedate) {
		this.mnum = mnum;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mgender = mgender;
		this.mbirth = mbirth;
		this.mhp = mhp;
		this.mtel = mtel;
		this.memail = memail;
		this.mzonecode = mzonecode;
		this.mroadaddr = mroadaddr;
		this.mroaddetail = mroaddetail;
		this.mjibunaddr = mjibunaddr;
		this.mhobby = mhobby;
		this.minfo = minfo;
		this.mphoto = mphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}	

	public KosMemberVO(String mnum, String mname, String mid, String mpw, String mgender, String mbirth, String mhp,
			String mtel, String memail, String mzonecode, String mroadaddr, String mroaddetail, String mjibunaddr,
			String mhobby, String minfo, String mphoto, String deleteyn, String insertdate, String updatedate,
			String keyword, String searchFilter, String startDate, String endDate, String snstype, String snsid,
			String snsemail, String pageSize, String groupSize, String curPage, String tatlCount) {
		super();
		this.mnum = mnum;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mgender = mgender;
		this.mbirth = mbirth;
		this.mhp = mhp;
		this.mtel = mtel;
		this.memail = memail;
		this.mzonecode = mzonecode;
		this.mroadaddr = mroadaddr;
		this.mroaddetail = mroaddetail;
		this.mjibunaddr = mjibunaddr;
		this.mhobby = mhobby;
		this.minfo = minfo;
		this.mphoto = mphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.keyword = keyword;
		this.searchFilter = searchFilter;
		this.startDate = startDate;
		this.endDate = endDate;
		this.snstype = snstype;
		this.snsid = snsid;
		this.snsemail = snsemail;
		this.pageSize = pageSize;
		this.groupSize = groupSize;
		this.curPage = curPage;
		this.totalCount = tatlCount;
	}

	public KosMemberVO(String mnum, String mname, String mid, String mpw, String mgender, String mbirth, String mhp,
			String mtel, String memail, String mzonecode, String mroadaddr, String mroaddetail, String mjibunaddr,
			String mhobby, String minfo, String mphoto, String deleteyn, String insertdate, String updatedate,
			String keyword, String searchFilter, String startDate, String endDate) {
		this.mnum = mnum;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mgender = mgender;
		this.mbirth = mbirth;
		this.mhp = mhp;
		this.mtel = mtel;
		this.memail = memail;
		this.mzonecode = mzonecode;
		this.mroadaddr = mroadaddr;
		this.mroaddetail = mroaddetail;
		this.mjibunaddr = mjibunaddr;
		this.mhobby = mhobby;
		this.minfo = minfo;
		this.mphoto = mphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.keyword = keyword;
		this.searchFilter = searchFilter;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public KosMemberVO(String mnum, String mname, String mid, String mpw, String mgender, String mbirth, String mhp,
			String mtel, String memail, String mzonecode, String mroadaddr, String mroaddetail, String mjibunaddr,
			String mhobby, String minfo, String mphoto, String deleteyn, String insertdate, String updatedate,
			String keyword, String searchFilter, String startDate, String endDate, String snstype, String snsid,
			String snsemail) {
		this.mnum = mnum;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mgender = mgender;
		this.mbirth = mbirth;
		this.mhp = mhp;
		this.mtel = mtel;
		this.memail = memail;
		this.mzonecode = mzonecode;
		this.mroadaddr = mroadaddr;
		this.mroaddetail = mroaddetail;
		this.mjibunaddr = mjibunaddr;
		this.mhobby = mhobby;
		this.minfo = minfo;
		this.mphoto = mphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.keyword = keyword;
		this.searchFilter = searchFilter;
		this.startDate = startDate;
		this.endDate = endDate;
		this.snstype = snstype;
		this.snsid = snsid;
		this.snsemail = snsemail;
	}
	
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMgender() {
		return mgender;
	}
	public void setMgender(String mgender) {
		this.mgender = mgender;
	}
	public String getMbirth() {
		return mbirth;
	}
	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}
	public String getMhp() {
		return mhp;
	}
	public void setMhp(String mhp) {
		this.mhp = mhp;
	}
	public String getMtel() {
		return mtel;
	}
	public void setMtel(String mtel) {
		this.mtel = mtel;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMzonecode() {
		return mzonecode;
	}
	public void setMzonecode(String mzonecode) {
		this.mzonecode = mzonecode;
	}
	public String getMroadaddr() {
		return mroadaddr;
	}
	public void setMroadaddr(String mroadaddr) {
		this.mroadaddr = mroadaddr;
	}
	public String getMroaddetail() {
		return mroaddetail;
	}
	public void setMroaddetail(String mroaddetail) {
		this.mroaddetail = mroaddetail;
	}
	public String getMjibunaddr() {
		return mjibunaddr;
	}
	public void setMjibunaddr(String mjibunaddr) {
		this.mjibunaddr = mjibunaddr;
	}
	public String getMhobby() {
		return mhobby;
	}
	public void setMhobby(String mhobby) {
		this.mhobby = mhobby;
	}
	public String getMinfo() {
		return minfo;
	}
	public void setMinfo(String minfo) {
		this.minfo = minfo;
	}
	public String getMphoto() {
		return mphoto;
	}
	public void setMphoto(String mphoto) {
		this.mphoto = mphoto;
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
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSearchFilter() {
		return searchFilter;
	}
	public void setSearchFilter(String searchFilter) {
		this.searchFilter = searchFilter;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getSnstype() {
		return snstype;
	}
	public void setSnstype(String snstype) {
		this.snstype = snstype;
	}
	public String getSnsid() {
		return snsid;
	}
	public void setSnsid(String snsid) {
		this.snsid = snsid;
	}
	public String getSnsemail() {
		return snsemail;
	}
	public void setSnsemail(String snsemail) {
		this.snsemail = snsemail;
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

	public void setTotalCount(String tatlCount) {
		this.totalCount = tatlCount;
	}
	
	
}
