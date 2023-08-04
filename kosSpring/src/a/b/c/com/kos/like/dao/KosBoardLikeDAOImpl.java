package a.b.c.com.kos.like.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.like.vo.KosBoardLikeVO;

@Repository
public class KosBoardLikeDAOImpl implements KosBoardLikeDAO {
	
	Logger logger = LogManager.getLogger(KosBoardLikeDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public List<KosBoardLikeVO> kosBoardLikeSelect(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeSelect() In");
		
		return sqlSession.selectList("kosBoardLikeSelect", blvo);		
	}
	
	@Override
	public List<KosBoardLikeVO> kosBoardLikeSelectAll(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeSelect() In");
		
		return sqlSession.selectList("kosBoardLikeSelect", blvo);
	}
	
	@Override
	public int kosBoardLikeInsert(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeSelect() In");
		
		return sqlSession.insert("kosBoardLikeInsert", blvo);
	}
	
	@Override
	public int kosBoardLikeUpdate_1(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeSelect() In");
		
		return sqlSession.update("kosBoardLikeSelect", blvo);
	}
	
	@Override
	public int kosBoardLikeUpdate_2(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeSelect() In");
		
		return sqlSession.update("kosBoardLikeSelect", blvo);
	}


}
