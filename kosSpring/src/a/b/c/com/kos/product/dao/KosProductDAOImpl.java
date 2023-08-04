package a.b.c.com.kos.product.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.product.vo.KosProductVO;

@Repository
public class KosProductDAOImpl implements KosProductDAO {
	Logger logger = LogManager.getLogger(KosProductDAOImpl.class);
	
	@Autowired(required=false)	
	private SqlSession sqlSession;
	
	// Insert
	@Override
	public int kosProductInsert(KosProductVO kpvo) {
		logger.info(">>> kosProductInsert() In");
		
		return sqlSession.insert("kosProductInsert", kpvo);
	} // end of kosProductInsert()
	
	// Select All
	@Override
	public List<KosProductVO> kosProductSelectAll(KosProductVO kpvo) {
		logger.info(">>> kosProductSelectAll() In");
		
		return sqlSession.selectList("kosProductSelectAll", kpvo);
	} // end of kosProductSelectAll
	
	@Override
	public List<KosProductVO> kosProductSelect(KosProductVO kpvo) {
		logger.info(">>> kosProductSelect() In");
		
		return sqlSession.selectList("kosProductSelect", kpvo);
	}

}
