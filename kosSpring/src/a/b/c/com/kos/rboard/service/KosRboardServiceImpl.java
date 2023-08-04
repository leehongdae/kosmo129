package a.b.c.com.kos.rboard.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.rboard.dao.KosRboardDAO;
import a.b.c.com.kos.rboard.vo.KosRboardVO;

@Service
@Transactional
public class KosRboardServiceImpl implements KosRboardService {
	
	Logger logger = LogManager.getLogger(KosRboardServiceImpl.class);
	
	@Autowired(required=false)
	private KosRboardDAO kosRboardDAO;
	
	@Override
	 public int kosRboardInsert(KosRboardVO krvo) {
		logger.info(">>> kosRboardInsert(KosRboardVO krvo) In");
		
		return kosRboardDAO.kosRboardInsert(krvo);
	}
	
	@Override
	public List<KosRboardVO> kosRboardSelectAll(KosRboardVO krvo) { 
	logger.info(">>> kosRboardSelectAll(KosRboardVO krvo) In");
	
	return kosRboardDAO.kosRboardSelectAll(krvo);
}
	
	@Override
	public int kosRboardDelete(KosRboardVO krvo) {
		logger.info(">>> kosRboardDelete(KosRboardVO krvo) In");
		
		return kosRboardDAO.kosRboardDelete(krvo);
	}

}
