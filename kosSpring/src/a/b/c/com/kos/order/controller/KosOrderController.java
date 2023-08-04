package a.b.c.com.kos.order.controller;

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
import a.b.c.com.common.NumUtil;
import a.b.c.com.common.chabun.service.KosChabunService;
import a.b.c.com.kos.cart.service.KosCartService;
import a.b.c.com.kos.cart.vo.KosCartVO;
import a.b.c.com.kos.order.service.KosOrderService;

@Controller
public class KosOrderController {
	Logger logger = LogManager.getLogger(KosOrderController.class);
	
	@Autowired(required=false)
	private KosChabunService kosChabunService;
	
	@Autowired(required=false)
	private KosOrderService kosOrderService;
	
	@Autowired(required=false)
	private KosCartService kosCartService;
	
	@GetMapping("kosOrderInsertForm")
	public String kosOrderInsertForm(KosCartVO kcvo, Model model) {
		logger.info(">>> kosOrderInsertForm() In");
		
		List<KosCartVO> list = kosCartService.kosCartSelectAll(kcvo);
		
		logger.info("kcvo.getKcnum() >>> : " + kcvo.getKcnum());
		logger.info("kcvo.getKpid() >>> : " + kcvo.getKpid());
		logger.info("kcvo.getKpname() >>> : " + kcvo.getKpname());
		logger.info("kcvo.getKpfile() >>> : " + kcvo.getKpfile());
		logger.info("kcvo.getKpcnt() >>> : " + kcvo.getKpcnt());
		kcvo.setKpprice(NumUtil.comma_replace(kcvo.getKpprice()));
		logger.info("kcvo.getKpprice() >>> : " + kcvo.getKpprice());
		kcvo.setKppricesum(NumUtil.comma_replace(kcvo.getKppricesum()));
		logger.info("kcvo.getKppricesum() >>> : " + kcvo.getKppricesum());
		logger.info("kcvo.getKpnum() >>> : " + kcvo.getKpnum());
		logger.info("kcvo.getKmnum() >>> : " + kcvo.getKmnum());
		
		return "order/kosOrderInsertForm";
	}
	
	@PostMapping("kosOrderInsert")
	public String kosOrderInsert(HttpServletRequest req) {
		logger.info(">>> kosOrderInsert() In");
		
		String konum =ChabunUtil.getOrderChabun("D", kosChabunService.getKosOrderChabun().getKonum());
		
		int nCnt = 0;
		
		return "#product/kosProductInsertForm";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // end of class
