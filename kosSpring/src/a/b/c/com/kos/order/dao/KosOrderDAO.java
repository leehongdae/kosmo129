package a.b.c.com.kos.order.dao;

import org.springframework.stereotype.Repository;

import a.b.c.com.kos.order.vo.KosOrderVO;

public interface KosOrderDAO {
	
	public int kosOrderInsert(KosOrderVO kovo);

}
