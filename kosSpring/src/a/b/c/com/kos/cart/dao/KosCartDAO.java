package a.b.c.com.kos.cart.dao;

import java.util.ArrayList;
import java.util.List;

import a.b.c.com.kos.cart.vo.KosCartVO;

public interface KosCartDAO {
	
	public int kosCartInsert(KosCartVO kcvo);
	
	public List<KosCartVO>kosCartSelectAll(KosCartVO kcvo);
	
	public int kosCartDeleteArray(ArrayList<KosCartVO> aList);
	
	public int kosCartDelete(KosCartVO kcvo);
}
