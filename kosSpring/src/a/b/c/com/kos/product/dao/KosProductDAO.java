package a.b.c.com.kos.product.dao;

import java.util.List;

import a.b.c.com.kos.product.vo.KosProductVO;

public interface KosProductDAO {
	
	public int kosProductInsert(KosProductVO kpvo);
	
	public List<KosProductVO> kosProductSelectAll(KosProductVO kpvo);
	
	public List<KosProductVO> kosProductSelect(KosProductVO kpvo);

}
