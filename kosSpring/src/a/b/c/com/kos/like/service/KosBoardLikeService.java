package a.b.c.com.kos.like.service;

import java.util.List;

import a.b.c.com.kos.like.vo.KosBoardLikeVO;

public interface KosBoardLikeService {
	
	public List<KosBoardLikeVO> kosBoardLikeSelect(KosBoardLikeVO blvo);
	public List<KosBoardLikeVO> kosBoardLikeSelectAll(KosBoardLikeVO blvo);
	
	public int kosBoardLikeInsert(KosBoardLikeVO blvo);
	
	public int kosBoardLikeUpdate_1(KosBoardLikeVO blvo);
	public int kosBoardLikeUpdate_2(KosBoardLikeVO blvo);

}
