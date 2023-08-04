package a.b.c.com.kos.board.dao;

import java.util.List;

import a.b.c.com.kos.board.vo.KosBoardVO;

public interface KosBoardDAO {

	public int kosBoardInsert(KosBoardVO kbvo);
	
	public List<KosBoardVO> kosBoardSelectAll(KosBoardVO kbvo);
	
	public List<KosBoardVO> kosBoardSelect(KosBoardVO kbvo);
	
	public int kobBoardBhit(KosBoardVO kbvo);
	
	public int kosBoardUpdate(KosBoardVO kbvo);
		
	public int kosBoardDelete(KosBoardVO kbvo);	
	
	public List<KosBoardVO> kosBoardPwCheck(KosBoardVO kbvo);
}
