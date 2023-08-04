package a.b.c.com.kos.rboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.rboard.service.KosRboardServiceImpl;
import a.b.c.com.kos.rboard.vo.KosRboardVO;

@Repository
public class KosRboardDAOImpl implements KosRboardDAO {
	
	Logger logger = LogManager.getLogger(KosRboardServiceImpl.class);
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	 public int kosRboardInsert(KosRboardVO krvo) {
		logger.info(">>> kosRboardInsert(KosRboardVO krvo) In");
		
		return sqlSession.insert("kosRboardInsert", krvo);
	}
	
	@Override
	public List<KosRboardVO> kosRboardSelectAll(KosRboardVO krvo) { 
		logger.info(">>> kosRboardSelectAll(KosRboardVO krvo) In");
		
		return sqlSession.selectList("kosRboardSelecAll", krvo); 
	}
	
	@Override
	public int kosRboardDelete(KosRboardVO krvo) {
		logger.info(">>> kosRboardDelete(KosRboardVO krvo) In");
		
		return sqlSession.update("kosRboardDelete", krvo);
	}

}
