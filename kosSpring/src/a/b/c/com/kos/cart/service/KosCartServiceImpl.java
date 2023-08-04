package a.b.c.com.kos.cart.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.cart.dao.KosCartDAO;
import a.b.c.com.kos.cart.vo.KosCartVO;

@Service
@Transactional
public class KosCartServiceImpl implements KosCartService {
	
	Logger logger = LogManager.getLogger(KosCartServiceImpl.class);
	
	@Autowired(required=false)
	KosCartDAO kosCartDAO;
	
	@Override
	public int kosCartInsert(KosCartVO kcvo) {
		logger.info(">>> kosCartInsert() In");
		
		return kosCartDAO.kosCartInsert(kcvo);
	}
	
	@Override
	public List<KosCartVO>kosCartSelectAll(KosCartVO kcvo) {
		logger.info(">>. kosCartSelectAll() In");
		
		return kosCartDAO.kosCartSelectAll(kcvo);
	}
	
	@Override
	public int kosCartDelete(KosCartVO kcvo) {
		logger.info(">>> kosCartDelete() In");
		
		return kosCartDAO.kosCartDelete(kcvo);
	}
	
	@Override
	public int kosCartDeleteArray(ArrayList<KosCartVO> aList) {
		logger.info(">>> kosCartDeleteArray() In");
		
		return kosCartDAO.kosCartDeleteArray(aList);
	}
	

}
