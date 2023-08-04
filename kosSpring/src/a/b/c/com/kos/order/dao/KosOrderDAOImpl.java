package a.b.c.com.kos.order.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.order.vo.KosOrderVO;

@Repository
public class KosOrderDAOImpl implements KosOrderDAO {
	Logger logger = LogManager.getLogger(KosOrderDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public int kosOrderInsert(KosOrderVO kovo) {
		logger.info(">>> kosOrderInsert() In");
		
		return sqlSession.insert("kosOrderInsert");
	}
}
