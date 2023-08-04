package a.b.c.com.kos.cart.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.cart.vo.KosCartVO;

@Repository
public class KosCartDAOImpl implements KosCartDAO {
	
	Logger logger = LogManager.getLogger(KosCartDAOImpl.class);
	
	@Autowired(required=false)
	SqlSession sqlSession; 
		
	// Insert
	@Override
	public int kosCartInsert(KosCartVO kcvo) {
		logger.info(">>> kosCartInsert() In");
		
		return sqlSession.insert("kosCartInsert", kcvo);
	}
	
	@Override
	public List<KosCartVO>kosCartSelectAll(KosCartVO kcvo) {
		logger.info(">>>kosCartSelectAll() In");
		
		return sqlSession.selectList("kosCartSelectAll", kcvo);
	}
	
	@Override
	public int kosCartDeleteArray(ArrayList<KosCartVO> aList) {
		logger.info(">>> kosCartDeleteArray In");
		
		return sqlSession.update("kosCartDeleteArray", aList);
	}
	
	@Override
	public int kosCartDelete(KosCartVO kcvo) {
		logger.info(">>> kosCartDelete() In");
		
		return sqlSession.update("kosCartDelete", kcvo);
	}

}
