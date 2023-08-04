package a.b.c.com.kos.board.controller;

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
import a.b.c.com.kos.board.service.KosBoardService;
import a.b.c.com.kos.board.vo.KosBoardVO;

@Controller
public class KosBoardController {
	
	Logger logger = LogManager.getLogger(KosBoardController.class);
	
	@Autowired(required=false)
	private KosBoardService kosBoardService;
	
	@Autowired(required=false)
	private KosChabunService kosChabunService;
	
	// boardForm
	@GetMapping("boardForm")
	public String kosBoardForm() {
		logger.info(">>> String kosBoardForm() In");
		
		return "board/boardForm";
	} // end of String kosBoardForm()
	
	
	// boardInsert
	@PostMapping("boardInsert")
	public String kosBoardInsert(HttpServletRequest req) {
		logger.info(">>> kosBoardInsert(HttpServletRequest req) IN ");	
		
		String bnum = ChabunUtil.getBoardChabun("D", kosChabunService.getKosBoardChabun().getBnum());
		
		FileUploadUtil fu = new FileUploadUtil( CommonUtils.BOARD_IMG_UPLOAD_PATH,
												CommonUtils.BOARD_IMG_FILE_SIZE,
												CommonUtils.BOARD_EN_CODE);
		

		boolean b = fu.imgfileUpload(req);
		logger.info(">>> kosBoardInsert() :: b : " + b);
		
		KosBoardVO _bvo = null;
		_bvo = new KosBoardVO();
		
		_bvo.setBnum(bnum);
		_bvo.setBsubject(fu.getParameter("bsubject"));
		_bvo.setBname(fu.getParameter("bname"));
		_bvo.setBcontent(fu.getParameter("bcontent"));
		_bvo.setBfile(fu.getFileName("bfile"));
		_bvo.setBpw(fu.getParameter("bpw"));
		
		int nCnt = kosBoardService.kosBoardInsert(_bvo);		
		if(nCnt > 0) {
			logger.info(">>> kosBoardInsert() :: nCnt : " + nCnt);
			return "board/boardInsert";
		}	
		return "board/boardForm";
	} // end of kosBoardInsert(HttpServletRequest req)
	
	@GetMapping("boardSelectAll")
	public String boardSelectAll(KosBoardVO kbvo, Model model) {
		logger.info(">>> String boardSelectAll() In");
		
		// 페이징 처리관련 데이터 처리
		int pageSize = CommonUtils.KOS_BOARD_PAGE_SIZE;
		int groupSize= CommonUtils.KOS_BOARD_GROUP_SIZE;
		int curPage = CommonUtils.KOS_BOARD_CUR_PAGE;
		int totalCount = CommonUtils.KOS_BOARD_TOTAL_COUNT;
		
		
	
			if (kbvo.getCurPage() !=null){
				curPage = Integer.parseInt(kbvo.getCurPage());
			}
		
		kbvo.setPageSize(String.valueOf(pageSize));
		kbvo.setGroupSize(String.valueOf(groupSize));
		kbvo.setCurPage(String.valueOf(curPage));
		kbvo.setTotalCount(String.valueOf(totalCount));		
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> listAll.size() : ");
		List<KosBoardVO> listAll = kosBoardService.kosBoardSelectAll(kbvo);
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> listAll.size() : " + listAll.size());
		if(listAll != null) {
			
			// CommonUtil에서 가져온 데이터
			model.addAttribute("pagingKBVO", kbvo);
			// 데이터베이스에서 가져온 데이터
			model.addAttribute("listAll", listAll);
			
			return "board/boardSelectAll";			
		} // end of if(listAll != null) 
		
		return "board/boardForm";
	} // end of String boardSelectAll()
	
	@GetMapping("boardSelect")
	public String kosBoardSelect(KosBoardVO kbvo, Model model) {
		logger.info(">>> kosBoardSelect() In");
		logger.info(">>> kosBoardSelect() :: kbvo" + kbvo.getBnum());
		
		List<KosBoardVO> listS = kosBoardService.kosBoardSelect(kbvo);
		if(listS.size() == 1) {
			logger.info(">>> kosBoardSelect() listS.size() : " + listS.size());
			
			int bhitCnt = kosBoardService.kobBoardBhit(kbvo);
			logger.info(">>> kosBoardSelect() :: bhitCnt : " + bhitCnt);
			
			
			model.addAttribute("listS", listS);
			return "board/boardSelect";
		}		
		return "board/boardSelectAll";
	} // end of kosBoardSelect()
	
	@GetMapping("boardSelectContents")
	public String kosBoardSelecContents(KosBoardVO kbvo, Model model) {
		logger.info(">>> kosBoardSelecContents(KosBoardVO kbvo, Model model) In");
		logger.info(">>> kosBoardSelecContents(KosBoardVO kbvo, Model model) :: kbvo.getBnum() : " + kbvo.getBnum());
		
		List<KosBoardVO> listS = kosBoardService.kosBoardSelect(kbvo);
		
		if(listS.size() == 1) {
			logger.info(">>> listS.size() : " + listS.size());
			
			int bhitCnt = kosBoardService.kobBoardBhit(kbvo);
			logger.info(">>> bhitCnt : " + bhitCnt);
			KosBoardVO _kbvo = new KosBoardVO();
			logger.info(">>> _kbvo.getBhit() : " + _kbvo.getBhit());
			
			model.addAttribute("listS", listS);
			return "board/boardSelectContents";			
		}		
		return "board/boardSelectAll";
	} // end of kosBoardSelecContents(KosBoardVO kbvo, Model model)
	
	@GetMapping("boardUpdate")
	public String boardUpdate(KosBoardVO kbvo) {
		logger.info(">>> boardUpdate(KosBoardVO kbvo) IN");
		logger.info(">>> boardUpdate(KosBoardVO kbvo) :: kbvo.getBcontent() :" + kbvo.getBcontent());
		logger.info(">>> boardUpdate(KosBoardVO kbvo) :: kbvo.getBnum() :" + kbvo.getBnum());
		
		int nCnt = kosBoardService.kosBoardUpdate(kbvo);
		logger.info(">>> nCnt : " + nCnt);	
		
		if(nCnt > 0 ) {
			return "board/boardUpdate";
		}
		
		return "board/boardSelectAll";
	} // end of boardUpdate(KosBoardVO kbvo)
	
	@GetMapping("boardDelete")
	public String boardDelete(KosBoardVO kbvo) {
		logger.info(">>> boardDelete(KosBoardVO kbvo) IN");
		
		int nCnt = kosBoardService.kosBoardDelete(kbvo);
		
		if(nCnt > 0 ) {
			logger.info(">>> nCnt : " + nCnt);
			
			return "board/boardDelete";			
		}
		
		return "board/boardSelectAll";
	} // end of boardDelete(KosBoardVO kbvo)
	
	@PostMapping("boardPwCheck")
	@ResponseBody
	public Object kosboardpwCheck(KosBoardVO kbvo) {
		logger.info(">>> kosboardpwCheck(KosBoardVO kbvo) In");
		List<KosBoardVO> list = kosBoardService.kosBoardPwCheck(kbvo);
		
		String msg = "";
		if(list.size() ==1) {
			msg = "PW_YES";
		}else {
			msg = "PW_NO";
		}		
		return msg;
	} // end of kosboardpwCheck(KosBoardVO kbvo)	

} // end of class
