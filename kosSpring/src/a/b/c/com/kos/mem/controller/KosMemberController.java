package a.b.c.com.kos.mem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.chabun.service.KosChabunService;
import a.b.c.com.kos.mem.service.KosMemberService;
import a.b.c.com.kos.mem.vo.KosMemberVO;

@Controller
public class KosMemberController {
	
	Logger logger = LogManager.getLogger(KosMemberController.class);
	
	@Autowired(required=false)
	private KosChabunService kosChabunService;

	@Autowired(required=false)
	private KosMemberService kosMemberService;
	
	@GetMapping("memForm")
	public String kosMemberInsertForm() {
		
		logger.info(">>> kosMemberInsertForm() In");
		
		return "mem/memForm";
	} // end of kosMemberInsertForm()
	
	@PostMapping("memInsert")
	public String kosMemberInsert(HttpServletRequest req) {
		
		logger.info(">>> gkosMemberInsert(httpServletRequest req) In");
		
		String mnum = ChabunUtil.getMemberChabun("D",  kosChabunService.getKosMemberChabun().getMnum());
		logger.info(">>> gkosMemberInsert() mnum : " + mnum);
		
		FileUploadUtil fu = new FileUploadUtil(  CommonUtils.MEM_IMG_UPLOAD_PATH
												,CommonUtils.MEM_IMG_FILE_SIZE
												,CommonUtils.MEM_EN_CODE);
		
		boolean bool = fu.imgfileUpload(req);
		logger.info(">>> kosMemberInsert bool : " + bool);
		
		KosMemberVO kvo = null;
		kvo = new KosMemberVO();
		
		kvo.setMnum(mnum);
		
		kvo.setMname(fu.getParameter("mname"));
		kvo.setMid(fu.getParameter("mid"));
		
		kvo.setMpw(fu.getParameter("mpw"));
		kvo.setMgender(fu.getParameter("mgender"));

		String mbirth = fu.getParameter("mbirth");
		String mbirth1 = fu.getParameter("mbirth1");
		String mbirth2 = fu.getParameter("mbirth2");
		kvo.setMbirth(mbirth.concat(mbirth1).concat(mbirth2));
		
		String mhp = fu.getParameter("mhp");
		String mhp1 = fu.getParameter("mhp1");
		String mhp2 = fu.getParameter("mhp2");
		kvo.setMhp(mhp.concat(mhp1).concat(mhp2));

		String mtel = fu.getParameter("mtel");
		String mtel1 = fu.getParameter("mtel1");
		String mtel2 = fu.getParameter("mtel2");
		kvo.setMtel(mtel.concat(mtel1).concat(mtel2));
		logger.info(">>> mtel : " + kvo.getMtel());
		

		String memail = fu.getParameter("memail");
		String memail1 = fu.getParameter("memail1");
		kvo.setMemail(memail.concat("@").concat(memail1));
		
		kvo.setMzonecode(fu.getParameter("mzonecode"));
		kvo.setMroadaddr(fu.getParameter("mroadaddr"));
		kvo.setMroaddetail(fu.getParameter("mroaddetail"));
		kvo.setMjibunaddr(fu.getParameter("mjibunaddr"));
		
		String mhobby = "";
		String hobby[] = fu.getParameterValues("mhobby");
		if(hobby.length>0) {
			for(int i=0; i<hobby.length; i++) {
				mhobby += hobby[i] + ",";
			}
		}
		kvo.setMhobby(mhobby);

		kvo.setMinfo(fu.getParameter("minfo"));
		
		kvo.setMphoto(fu.getFileName("mphoto"));
		
				
		int nCnt = kosMemberService.kosMemberInsert(kvo);
		
		if(nCnt > 0) {
			logger.info(">>> kosMemberInsert() :: nCnt : " + nCnt);
			return "mem/memInsert";
		}
		return "mem/memForm";		
	} // end of gkosMemberInsert(httpServletRequest req)	

	@GetMapping("memSelectAll")
	public String kosMemberSelectAll(KosMemberVO kvo, Model model) {
		logger.info(">>> String kosMemberSelectAll(KosMember kvo) In");
		
		int pageSize = CommonUtils.KOS_PAGE_SIZE;
		int groupSize = CommonUtils.KOS_GROUP_SIZE;
		int curPage = CommonUtils.KOS_CUR_PAGE;
		int totalCount = CommonUtils.KOS_TOTAL_COUNT;
		
		if(kvo.getCurPage() != null) {
			curPage = Integer.parseInt(kvo.getCurPage());			
		}
		
		kvo.setPageSize(String.valueOf(pageSize));
		kvo.setGroupSize(String.valueOf(groupSize));
		kvo.setCurPage(String.valueOf(curPage));
		kvo.setTotalCount(String.valueOf(totalCount));
		
		logger.info(">>> kosMemberSelectall() :: kvo.getPageSize() : " + kvo.getPageSize());
		logger.info(">>> kosMemberSelectall() :: kvo.getGroupsize() : " + kvo.getGroupSize());
		logger.info(">>> kosMemberSelectall() :: kvo.getCurPage() : " + kvo.getCurPage());
		logger.info(">>> kosMemberSelectall() :: kvo.getTotalPage() : " + kvo.getTotalCount());		
		
		List<KosMemberVO> listAll = kosMemberService.kosMemberSelectAll(kvo);		
		
		if(listAll.size() > 0) {
			
			model.addAttribute("listAll", listAll);
			
			model.addAttribute("search_kvo", kvo);
			
			return "mem/memSelectAll";
		}
		
		return "mem/memForm";		
		
	} // end of String kosMemberSelectAll(KosMember kvo)
	
	@PostMapping("memSelect")
	public String kosMemberSelect(KosMemberVO kvo, Model model) {
		logger.info(">>> kosMemberSelect()  In");
		
		List<KosMemberVO> list = kosMemberService.kosMemberSelect(kvo);
		logger.info(">>> kosMemberSelect() :: list.size() : " + list.size());
		
		if(list.size() > 0 ) {
			model.addAttribute("list", list);
			
			return "mem/memSelect";			
		} // end of if(list.size() > 0)
			
		return "mem/memSelectAll";
		
	} // end of kosMemberSelect() 
	
	@GetMapping("memUpdate")
	public String kosMemberUpdate(HttpServletRequest req, KosMemberVO kvo) {
		logger.info(">>> kosMemberUpdate(HttpServletRequest req, KosMemberVO kvo) In");
		
		String mhp  = req.getParameter("mhp");
		String mhp1 = req.getParameter("mhp1");
		String mhp2 = req.getParameter("mhp2");
		kvo.setMhp(mhp.concat(mhp1).concat(mhp2));
		
		String mtel  = req.getParameter("mtel");
		String mtel1 = req.getParameter("mtel1");
		String mtel2 = req.getParameter("mtel2");
		kvo.setMtel(mtel.concat(mtel1).concat(mtel2));
	

		String memail  = req.getParameter("memail");
		String memail1 = req.getParameter("memail1");
		kvo.setMemail(memail.concat("@").concat(memail1));
		
		kvo.setMzonecode(req.getParameter("mzonecode"));
		kvo.setMroadaddr(req.getParameter("mroadaddr"));
		kvo.setMroaddetail(req.getParameter("mroaddetail"));
		kvo.setMjibunaddr(req.getParameter("mjibunaddr"));
		
		String mhobby = "";
		String hobby[] = req.getParameterValues("mhobby");
		
		if(hobby.length > 0) {
			for (int i=0; i< hobby.length; i++) {
				mhobby += hobby[i] + "";
			}
		}
		kvo.setMhobby(mhobby);
		
		logger.info(">>> mtel : " + kvo.getMtel());
		logger.info(">>> mtel : " + kvo.getMtel().length());
		
		int nCnt = kosMemberService.kosMemberUpdate(kvo);
		
		if(nCnt == 1) {
			logger.info(">>. kosMembrUpdate : " + nCnt);
			
			return "mem/memUpdate";
		}	
		
		return "mem/";
	} // end of kosMemberUpdate(HttpServletRequest req, KosMemberVO kvo)
	
	@GetMapping("kosIdCheck")
	@ResponseBody
	public Object kosIdCheck(KosMemberVO kvo) {
		logger.info(">>> kosIdCheck(KosMemberVO kvo) In");
		logger.info(">>> kosIdCheck(KosMemberVO kvo) :: kvo.getMid() : ");
		
		List<KosMemberVO> list = kosMemberService.kosIdCheck(kvo);
		logger.info(">>> kosIdCheck(KosMemberVO kvo) :: list.size() : " + list.size());
		
		String msg = "";
		if(list.size() == 0) { msg = "ID_YES";}
		else { msg = "ID_NO";}
		return msg;
	} // end of kosIdCheck(KosMemberVO kvo)
	
	
	@GetMapping("memDummy")
	public String memDummy(HttpServletRequest req) {
		logger.info(">>> memDummy() In");
		
		for(int i=0; i<20; i++) {
			KosMemberVO kvo = null;
			kvo = new KosMemberVO();
			
			kvo.setMnum(ChabunUtil.getMemberChabun("D",  kosChabunService.getKosMemberChabun().getMnum()));
			kvo.setMname(("name"+i));
			kvo.setMid("id"+i);
			kvo.setMpw("10"+i);
			kvo.setMgender("F");
			
			String birth1 = "";	
			if(i<10) {
				birth1 = "10"+i;
			}else{
				birth1 = "10" + i;
			}			 
			kvo.setMbirth(birth1+"0101");
			kvo.setMhp("01034579094");
			kvo.setMtel("0234579094");
			kvo.setMemail("httransibit@naver.com");
			kvo.setMzonecode("123456");
			kvo.setMroadaddr("mroadaddr");
			kvo.setMroaddetail("mroaddetail");
			kvo.setMjibunaddr("mjubunaddr");
			kvo.setMhobby("mh1");
			kvo.setMinfo("test"+i);
			kvo.setMphoto("test+"+i);

			int nCnt = kosMemberService.kosMemberDummy(kvo);
			logger.info(">>> Dummy In " + i + "번째 성공");
		}
		
		return "mem/memDummy";
	} // 더미 파일을 만들자
	
	
} // end of class
