package a.b.c.com.kos.product.service;

import java.util.List;

import a.b.c.com.kos.product.vo.KosProductVO;

public interface KosProductService {
	
	public int kosProductInsert(KosProductVO kpvo);
	public List<KosProductVO> kosProductSelectAll(KosProductVO kpvo);
	public List<KosProductVO> kosProductSelect(KosProductVO kpvo);

}
