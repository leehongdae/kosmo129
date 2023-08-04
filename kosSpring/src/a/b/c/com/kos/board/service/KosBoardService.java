package a.b.c.com.kos.board.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import a.b.c.com.kos.board.vo.KosBoardVO;

public interface KosBoardService {
	
	Logger logger = LogManager.getLogger(KosBoardService.class);
	
	// Board Insert
	public int kosBoardInsert(KosBoardVO kbvo);
	
	// Board SelectAll
	public List<KosBoardVO> kosBoardSelectAll(KosBoardVO kbvo);
	
	// board Select
	public List<KosBoardVO> kosBoardSelect(KosBoardVO kbvo);
	
	// board Bhit
	public int kobBoardBhit(KosBoardVO kbvo);
	
	// board Update
	public int kosBoardUpdate(KosBoardVO kbvo);
	
	// board Delete
	public int kosBoardDelete(KosBoardVO kbvo);
	
	public List<KosBoardVO> kosBoardPwCheck(KosBoardVO kbvo);
	
}
