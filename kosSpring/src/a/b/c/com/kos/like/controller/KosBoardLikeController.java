package a.b.c.com.kos.like.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import a.b.c.com.kos.like.service.KosBoardLikeService;
import a.b.c.com.kos.like.vo.KosBoardLikeVO;

@Controller
public class KosBoardLikeController {
	
	Logger logger = LogManager.getLogger(KosBoardLikeController.class);
	
	@Autowired(required=false)
	private KosBoardLikeService kosBoardLikeService;
	
	@GetMapping("like_cnt_1")
	@ResponseBody
	public String kosLikecnt_1(KosBoardLikeVO blvo) {
		logger.info(">>> kosLikecnt_1 In");
		
		List<KosBoardLikeVO> listCnt = kosBoardLikeService.kosBoardLikeSelect(blvo);
		logger.info(">>> kosLikecnt_1 listCnt : " + listCnt);
		
		int nCnt = 0;
		if(listCnt !=null && listCnt.size() >0) {
			nCnt = kosBoardLikeService.kosBoardLikeUpdate_1(blvo);
			logger.info(">> kosLikecnt_1 nCnt : " + nCnt);
			
		}else {
			nCnt = kosBoardLikeService.kosBoardLikeInsert(blvo);
			logger.info(">>> kosLikecnt_1 nCnt : " + nCnt);			
		}
		
		String blike_cnt_1 = "";
		List<KosBoardLikeVO> listAll = kosBoardLikeService.kosBoardLikeSelectAll(blvo);
		if(listAll !=null && listAll.size() > 0) {
			blike_cnt_1 = listAll.get(0).getLike_cnt_1();			
		}
		return blike_cnt_1;		
	}
	
	@GetMapping("like_cnt_2")
	@ResponseBody
	public String kosLikecnt_2(KosBoardLikeVO blvo) {	
		logger.info("kosLikecnt_2 >>> : ");
		
		logger.info("kosLikecnt_2 blvo.getLike_cnt_2() >>> : " + blvo.getLike_cnt_2());
		logger.info("kosLikecnt_2 blvo.getMnum() >>> : " + blvo.getMnum());
		logger.info("kosLikecnt_2 blvo.getBnum() >>> : " + blvo.getBnum());
		
		List<KosBoardLikeVO> listCnt = kosBoardLikeService.kosBoardLikeSelect(blvo);
		logger.info("kosLikecnt_2 listCnt >>> : " + listCnt);
		
		int nCnt = 0;
		if (listCnt !=null && listCnt.size() > 0) {
			nCnt = kosBoardLikeService.kosBoardLikeUpdate_2(blvo);
			logger.info("kosLikecnt_2 nCnt >>> : " + nCnt);			
		}else {
			nCnt = kosBoardLikeService.kosBoardLikeInsert(blvo);
			logger.info("kosLikecnt_2 nCnt >>> : " + nCnt);		
		}
							
		String blike_cnt_2 = "";
		List<KosBoardLikeVO> listAll = kosBoardLikeService.kosBoardLikeSelectAll(blvo);
		if (listAll !=null && listAll.size() > 0) {
			blike_cnt_2 = listAll.get(0).getLike_cnt_2();
		}
				
		return blike_cnt_2;
	}	
	

}
