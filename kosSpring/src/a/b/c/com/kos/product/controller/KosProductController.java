package a.b.c.com.kos.product.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.chabun.service.KosChabunService;
import a.b.c.com.kos.product.service.KosProductService;
import a.b.c.com.kos.product.vo.KosProductVO;

@Controller
public class KosProductController {
	
	Logger logger = LogManager.getLogger(KosProductController.class);
	
	@Autowired(required=false)
	KosProductService kosProductService;
	
	@Autowired(required=false)
	KosChabunService kosChabunService;
	
	// InsertForm
	@GetMapping("kosProductInsertForm")
	public String kosProductInsertForm() {
		logger.info(">>> kosProductInserForm() In");
		
		return "product/kosProductInsertForm";
	}
	
	// Insert
	@PostMapping("kosProductInsert")
	public String kosProductInsert(HttpServletRequest req) {
		logger.info(">>. kosProductInsert() In");
		
		String kpnum = ChabunUtil.getProductChabun("D", kosChabunService.getKosProductChabun().getKpnum());
		
		FileUploadUtil fu = new FileUploadUtil( CommonUtils.PRODUCT_IMG_UPLOAD_PATH,
												CommonUtils.PRODUCT_IMG_FILE_SIZE,
												CommonUtils.PRODUCT_EN_CODE);
		
		boolean bool = fu.imgfileUpload(req);
		logger.info(">>> bool : " + bool);
		
		KosProductVO kpvo = null;
		kpvo = new KosProductVO();
		
		kpvo.setKpnum(kpnum);
		kpvo.setKpid(fu.getParameter("kpid"));
		kpvo.setKpname(fu.getParameter("kpname"));
		kpvo.setKpcompany(fu.getParameter("kpcompany"));
		kpvo.setKpfile(fu.getFileName("kpfile"));
		kpvo.setKpcnt(fu.getParameter("kpcnt"));
		kpvo.setKpprice(fu.getParameter("kpprice"));
		kpvo.setKpdesc(fu.getParameter("kpdesc"));
		
		logger.info(">>> file name : " + fu.getFileName("kpfile"));
		
		int nCnt = kosProductService.kosProductInsert(kpvo);
		
		if(nCnt > 0) {
			return "product/kosProductSelectAll";
		}	
		
		return "";
	} // end of kosProductInsertForm
	
	@GetMapping("productDummy")
	public String productDummy(HttpServletRequest req) {
		
		logger.info(">>> memDummy() In");		
		
		for(int i=1; i<=500; i++) {
			KosProductVO kvo = null;
			kvo = new KosProductVO();
			
			kvo.setKpnum(ChabunUtil.getMemberChabun("D", kosChabunService.getKosProductChabun().getKpnum()));
			kvo.setKpid("id"+i);
			kvo.setKpname(("name"+i));
			kvo.setKpcompany("com"+i);
			kvo.setKpfile("2윙크_3_.png");			
			kvo.setKpcnt("1"+i);
			kvo.setKpprice("1"+i);
			kvo.setKpdesc("desc"+i);
			

			kosProductService.kosProductInsert(kvo);
		
			logger.info(">>> Dummy In " + i + "번째 성공");
		}
		
		return "#";
	} // 더미 파일을 만들자
	
	@GetMapping("kosProductSelectAll")
	public String kosProductSelectAll(KosProductVO kpvo, Model model) {
		logger.info(">>> kosSelectAll() In");
		
		int pageSize = CommonUtils.KOS_PRODUCT_PAGE_SIZE;
		int groupSize = CommonUtils.KOS_PRODUCT_GROUP_SIZE;
		int curPage = CommonUtils.KOS_PRODUCT_CUR_PAGE;
		int totalCount = CommonUtils.KOS_PRODUCT_TOTAL_COUNT;
		
		if(kpvo.getCurPage() !=null) {
			curPage = Integer.parseInt(kpvo.getCurPage());
		}
		
		kpvo.setPageSize(String.valueOf(pageSize));
		kpvo.setGroupSize(String.valueOf(groupSize));
		kpvo.setCurPage(String.valueOf(curPage));
		kpvo.setTotalCount(String.valueOf(totalCount));
		
		logger.info("kpvo.getPageSize() : " + kpvo.getPageSize());
		logger.info("kpvo.getCurPage() : " + kpvo.getCurPage());
		
		List<KosProductVO> listAll = kosProductService.kosProductSelectAll(kpvo);
		
		logger.info(">>> li>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		logger.info(">>> listAll.size() :" + listAll.size());
		if(listAll.size() > 0) {
			logger.info(">>> kosmoProductSelectAll() :: listAll.size() : " + listAll.size());
			
			model.addAttribute("pagingKpvo", kpvo);
			model.addAttribute("listAll", listAll);
			
			return "product/kosProductSelectAll";
		}
		
		return "product/kosProductSelectAll";
	} // end of kosSelectAll()
	
	// Select
	@GetMapping("kosProductSelect")
	public String kosProductSelect(KosProductVO kpvo, Model model) {
		logger.info(">>> kosProductSelect() In");
		
		List<KosProductVO> listS = kosProductService.kosProductSelect(kpvo);
		
		if(listS.size() > 0) {
			logger.info(">>. listS.size() : " + listS.size());
			model.addAttribute("listS", listS);
			
			return "product/kosProductSelect";			
		}
		
		
		return "product/kosProductSelectAll";		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

} // end of class
