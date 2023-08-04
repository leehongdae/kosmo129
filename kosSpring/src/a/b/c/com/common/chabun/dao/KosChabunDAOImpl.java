package a.b.c.com.common.chabun.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.board.vo.KosBoardVO;
import a.b.c.com.kos.cart.vo.KosCartVO;
import a.b.c.com.kos.mem.vo.KosMemberVO;
import a.b.c.com.kos.order.vo.KosOrderVO;
import a.b.c.com.kos.product.vo.KosProductVO;
import a.b.c.com.kos.rboard.vo.KosRboardVO;

@Repository
public class KosChabunDAOImpl implements KosChabunDAO {
	
	private Logger logger = LogManager.getLogger(KosChabunDAOImpl.class);
	
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	// Member
	//getKosMemberChabun
	
	@Override
	public KosMemberVO getKosMemberChabun() {
		
		logger.info(">>> getKosMemberChabun() In");
		
		return sqlSession.selectOne("getKosMemberChabun");
	} // end of getKosMemberChabun() 
	
	@Override
	public KosBoardVO getKosBoardChabun() {
		logger.info(">>> getKosBoardChabun() In");
		
		return sqlSession.selectOne("getKosBoardChabun");
	} // end of getKosBoardChabun()
	
	@Override
	public KosRboardVO getKosRboardChabun()  {
		logger.info(">>> kosChabunService() In");
		
		return sqlSession.selectOne("getKosRboardChabun");
	}
	
	@Override
	public KosProductVO getKosProductChabun() {
		logger.info(">>> getKosProductChabun() In");
		
		return sqlSession.selectOne("getKosProductChabun");
	}
	
	@Override
	public KosCartVO getKosCartChabun() {
		logger.info(">>> getKosCartChabun() In");
		
		return sqlSession.selectOne("getKosCartChabun");		
	}
	
	@Override
	public KosOrderVO getKosOrderChabun() {
		logger.info(">>> getKosCartChabun() In");
		
		return sqlSession.selectOne("getKosOrderChabun");
	}

}// end of class
