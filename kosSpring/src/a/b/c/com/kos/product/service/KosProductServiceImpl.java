package a.b.c.com.kos.product.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.product.dao.KosProductDAO;
import a.b.c.com.kos.product.vo.KosProductVO;

@Service
@Transactional
public class KosProductServiceImpl implements KosProductService {	
	Logger logger = LogManager.getLogger(KosProductServiceImpl.class);
	
	@Autowired(required=false)
	KosProductDAO kosProductDAO;
		
	// Insert
	@Override
	public int kosProductInsert(KosProductVO kpvo) {
		logger.info(">>> kosProductInser() In");
		
		return kosProductDAO.kosProductInsert(kpvo);
		
	} // end of kosProductInsert()
	
	// Select All
	@Override
	public List<KosProductVO> kosProductSelectAll(KosProductVO kpvo){
		logger.info(">>> public List<KosProductVO> kosProductSelectAll(KosProductVO kpvo); In");
		
		return kosProductDAO.kosProductSelectAll(kpvo);
	} // end of kosProductSelectAll()
	
	@Override
	public List<KosProductVO> kosProductSelect(KosProductVO kpvo) {
		logger.info(">>> kosProductSelect() In");
		
		return kosProductDAO.kosProductSelect(kpvo);
	}
	

}
