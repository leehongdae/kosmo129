package a.b.c.com.kos.rboard.dao;

import java.util.List;

import a.b.c.com.kos.rboard.vo.KosRboardVO;

public interface KosRboardDAO {
	
	public int kosRboardInsert(KosRboardVO krvo);
	
	public List<KosRboardVO> kosRboardSelectAll(KosRboardVO krvo);
	
	public int kosRboardDelete(KosRboardVO krvo);	

}
