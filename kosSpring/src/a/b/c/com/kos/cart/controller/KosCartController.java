package a.b.c.com.kos.cart.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.NumUtil;
import a.b.c.com.common.chabun.service.KosChabunService;
import a.b.c.com.kos.cart.service.KosCartService;
import a.b.c.com.kos.cart.vo.KosCartVO;

@Controller
public class KosCartController {
	
	Logger logger = LogManager.getLogger(KosCartController.class);
	
	@Autowired(required=false)
	private KosChabunService kosChabunService;
	
	@Autowired(required=false)
	private KosCartService kosCartService;
	
	@GetMapping("kosCartInsert")
	public String kosCartInsert(KosCartVO kcvo) {
		logger.info(">>> kosCartInsert() In");
		
		String kcnum = ChabunUtil.getCartChabun("D", kosChabunService.getKosCartChabun().getKcnum());
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		kcvo.setKcnum(kcnum);
		kcvo.setKpprice(NumUtil.comma_replace(kcvo.getKpprice()));
		kcvo.setKppricesum(NumUtil.comma_replace(kcvo.getKppricesum()));
		
		int nCnt = kosCartService.kosCartInsert(kcvo);
		logger.info(">>> nCnt : " + nCnt);
		if(nCnt >0) {
			
			return "cart/kosCartInsert";
		}
		return "product/kosProductInsert";		
	}	
	
	@GetMapping("kosCartSelectAll")
	public String kosCartSelectAll(KosCartVO kcvo, Model model) {
		logger.info(">>> kosCartSelectAll() In");
		
		kcvo.setKmnum("1234");
		
		List<KosCartVO> listS = kosCartService.kosCartSelectAll(kcvo);
		
		if(listS.size() > 0) {
			
			model.addAttribute("listS", listS);
			return "cart/kosCartSelectAll";
		}
		
		return "product/kosProductSelectAll";
	} 
	
	@GetMapping("kosCartDelete")
	public String kosCartDelete(HttpServletRequest req, KosCartVO kcvo, Model model) {
		logger.info(">>> kosCartDelete");
		
		kcvo.setKcnum(req.getParameter("kcnumV"));
		logger.info(">>> kcvo.getKcnum() : " + kcvo.getKcnum());
		
		int nCnt = kosCartService.kosCartDelete(kcvo);
		if(nCnt > 0) {
			logger.info(">>> nCnt : " + nCnt);
		}
		
		return "cart/kosCartDelete";
	}
	
	@GetMapping("kosCartDeleteArray")
	public String kosCartDeleteArray(HttpServletRequest req, KosCartVO kcvo, Model model) {
		logger.info(">>> kosCartDeleteArray : ");
		
		String kcnumV[] = req.getParameterValues("kcnum");
		ArrayList<KosCartVO> aList = new ArrayList<KosCartVO>();
		for(int i=0; i<kcnumV.length; i++) {
			KosCartVO _kcvo = new KosCartVO();
			_kcvo.setKcnum(kcnumV[i]);
			aList.add(_kcvo);			
		}
		
		int nCnt = kosCartService.kosCartDeleteArray(aList);
		if(nCnt == -1) {
			logger.info(">>> kosCartDeleteArray() nCnt : " + nCnt);
		}
		return "cart/kosCartDelete";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
