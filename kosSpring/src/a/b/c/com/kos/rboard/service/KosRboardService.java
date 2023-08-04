package a.b.c.com.kos.rboard.service;

import java.util.List;

import a.b.c.com.kos.rboard.vo.KosRboardVO;

public interface KosRboardService {
	
	public int kosRboardInsert(KosRboardVO krvo);
	
	public List<KosRboardVO> kosRboardSelectAll(KosRboardVO krvo);
	
	public int kosRboardDelete(KosRboardVO krvo);	

}
