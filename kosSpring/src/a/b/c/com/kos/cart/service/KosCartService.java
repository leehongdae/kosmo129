package a.b.c.com.kos.cart.service;

import java.util.ArrayList;
import java.util.List;

import a.b.c.com.kos.cart.vo.KosCartVO;

public interface KosCartService {
	
	// Insert
	public int kosCartInsert(KosCartVO kcvo);
	
	// SelectAll
	public List<KosCartVO>kosCartSelectAll(KosCartVO kcvo);
	
	public int kosCartDeleteArray(ArrayList<KosCartVO> aList);
	
	public int kosCartDelete(KosCartVO kcvo);
}
