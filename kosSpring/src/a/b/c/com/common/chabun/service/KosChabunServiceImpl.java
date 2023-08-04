package a.b.c.com.common.chabun.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.common.chabun.dao.KosChabunDAO;
import a.b.c.com.kos.board.vo.KosBoardVO;
import a.b.c.com.kos.cart.vo.KosCartVO;
import a.b.c.com.kos.mem.vo.KosMemberVO;
import a.b.c.com.kos.order.vo.KosOrderVO;
import a.b.c.com.kos.product.vo.KosProductVO;
import a.b.c.com.kos.rboard.vo.KosRboardVO;

@Service
@Transactional
public class KosChabunServiceImpl implements KosChabunService {
	
	private Logger logger = LogManager.getLogger(KosChabunServiceImpl.class);
	
	@Autowired(required=false)
	private KosChabunDAO kosChabunDAO;
	
	@Override
	public KosMemberVO getKosMemberChabun() {
		
		logger.info(">>> getKosMemberChabun() In");
		
		return kosChabunDAO.getKosMemberChabun();	
	} // end of getKosMemberChabun()
	
	@Override
	public KosBoardVO getKosBoardChabun() {
		logger.info(">>> getKosBoardChabun() In");
		
		return kosChabunDAO.getKosBoardChabun();
	} // end of getKosMemberChabun()
	
	@Override
	public KosRboardVO getKosRboardChabun() {
		logger.info(">>> kosChabunService() In");
		
		return kosChabunDAO.getKosRboardChabun();
	}
	
	@Override
	public KosProductVO getKosProductChabun() {
		logger.info(">>> getKosProductChabun() In");
		
		return kosChabunDAO.getKosProductChabun();
	}
	
	@Override
	public KosCartVO getKosCartChabun() {
		logger.info(">>> getKosCartChabun() In");
		
		return kosChabunDAO.getKosCartChabun();
	}
	
	@Override
	public KosOrderVO getKosOrderChabun() {
		logger.info(">>> getKosOrderChabun() In");
		
		return kosChabunDAO.getKosOrderChabun();
	}

} // end of class
