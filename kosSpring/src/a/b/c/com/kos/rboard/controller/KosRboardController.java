package a.b.c.com.kos.rboard.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.chabun.service.KosChabunService;
import a.b.c.com.kos.rboard.service.KosRboardService;
import a.b.c.com.kos.rboard.vo.KosRboardVO;

@Controller
public class KosRboardController {
	
	Logger logger = LogManager.getLogger(KosRboardController.class);
	
	@Autowired(required=false)
	private KosRboardService kosRboardService;
	
	@Autowired(required=false)
	private KosChabunService kosChabunService;
	
	// 댓글 글쓰기 폼
	@GetMapping("rboardForm")
	public String kosRboardForm() {
		logger.info("kosRboardForm() In");
		
		return "rboard/rboardForm";
	}
	
	// 댓글 등록
	@PostMapping("rboardInsert")
	@ResponseBody
	public String  kosRboardInsert(KosRboardVO rbvo) {
		logger.info(">>> kosRboardInsert(KosRboardVO rbvo) In");
		logger.info(">>> kosRboardInsert(KosRboardVO rbvo) :: rbvo.getBnum() : " + rbvo.getBnum());
		
		String rbnum = ChabunUtil.getRboardChabun("N", kosChabunService.getKosRboardChabun().getBnum());
		logger.info(">>> kosRboardInsert rbnum : " + rbnum);
		
		rbvo.setRbnum(rbnum);
		logger.info(">>> rbvo.getRbnum() : " + rbvo.getRbnum());
		logger.info(">>> rbvo.getBnum( : " + rbvo.getBnum());
		logger.info(">>> rbvo.getRbname() : " + rbvo.getRbname());
		logger.info(">>> rbvo.getRbnum() : " + rbvo.getRbnum());
		
		int nCnt = kosRboardService.kosRboardInsert(rbvo);
		logger.info(">>> kosRboardInser nCnt : " + nCnt);
		
		if(nCnt ==1) {
			return "GOOD";
		}else {
			return "BAD";
		}		
	} // end of kosRboardInsert(KosRboardVO rbvo)
	
	// 댓글 전체 조회
	@ResponseBody
	@PostMapping(value = "rboardSelectAll" , produces = "application/x-www-form-urlencoded;charset=utf-8")
	public String kosRboardSelectAll(KosRboardVO rbvo) {
		logger.info(">>> kosRboardSelectAll In");
		
		List<KosRboardVO> list = kosRboardService.kosRboardSelectAll(rbvo);
		
		String ss= "";
		String listStr = "";
		
		for(int i=0; i< list.size(); i++) {
			KosRboardVO _rbvo = list.get(i);
			String s0 = _rbvo.getRbnum();
			String s1 = _rbvo.getRbname();
			String s2 = _rbvo.getRbcontent();
			String s3 = _rbvo.getInsertdate();
			ss = s0 +","+ s1 +","+ s2 +","+ s3;
			listStr += ss+"&";
		}		
		return listStr;		
	}
	
	// 댓글 삭제
	@PostMapping("rboardDelete")
	@ResponseBody
	public String kosRboardDelete(KosRboardVO rbvo) {
		logger.info(">>> kosRboardDelete iN");
		
		int nCnt = kosRboardService.kosRboardDelete(rbvo);
		
		if(nCnt == 1) {
			return "GOOD";
		}else {
			return "BAD";
		}		
	}	
	
} // end of class
