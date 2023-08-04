package a.b.c.com.kos.order.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.order.dao.KosOrderDAO;
import a.b.c.com.kos.order.vo.KosOrderVO;

@Service
@Transactional
public class KosOrderServiceImpl implements KosOrderService {
	Logger logger = LogManager.getLogger(KosOrderServiceImpl.class);
	
	@Autowired(required=false)
	private KosOrderDAO kosOrderDAO;
	
	
	@Override
	public int kosOrderInsert(KosOrderVO kovo) {
		logger.info(">>> kosOrderInsert() In");
		
		return kosOrderDAO.kosOrderInsert(kovo);
	}
}
