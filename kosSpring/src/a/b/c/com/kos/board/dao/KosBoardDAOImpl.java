package a.b.c.com.kos.board.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.board.vo.KosBoardVO;

@Repository
public class KosBoardDAOImpl implements KosBoardDAO {
	
	Logger logger = LogManager.getLogger(KosBoardDAOImpl.class);
	
	@Autowired(required=false)
	SqlSessionTemplate sqlSession;
	
	@Override
	public int kosBoardInsert(KosBoardVO kbvo) {
		logger.info(">>> kosBoardInsert(KosBoardVO kbvo) In");
		
		return sqlSession.insert("kosBoardInsert", kbvo);
	} // end of kosBoardInsert(KosBoardVO kbvo)
	
	@Override
	public List<KosBoardVO> kosBoardSelectAll(KosBoardVO kbvo) {
		logger.info(">>> public List<KosBoardVO> kosBoardSelectAll(KosBoardVO kbvo); IN");
		
		return sqlSession.selectList("kosBoardSelectAll", kbvo);
	}// end of public List<KosBoardVO> kosBoardSelectAll(KosBoardVO kbvo);
	
	@Override
	public List<KosBoardVO> kosBoardSelect(KosBoardVO kbvo) {
		logger.info(">>> public List<KosBoardVO> kosBoardSelect(KosBoardVO kbvo); In");
		logger.info(">>> public List<KosBoardVO> kosBoardSelect(KosBoardVO kbvo)" + kbvo.getBnum());
		
		
		return sqlSession.selectList("kosBoardSelect", kbvo);
	} // end of public List<KosBoardVO> kosBoardSelect(KosBoardVO kbvo);
	
	@Override
	public int kobBoardBhit(KosBoardVO kbvo) {
		logger.info("public int kobBoardBhit(KosBoardVO kbvo);");
		
		return sqlSession.update("kobBoardBhit", kbvo);
	}// end of public int kobBoardBhit(KosBoardVO kbvo);
	
	@Override
	public int kosBoardUpdate(KosBoardVO kbvo) {
		logger.info(">>> kosBoardUpdate(KosBoardVO kbvo) IN");
		
		return sqlSession.update("kosBoardUpdate", kbvo);
	} // end of kosBoardUpdate(KosBoardVO kbvo)
	
	// board Delete
	@Override
	public int kosBoardDelete(KosBoardVO kbvo) {
		logger.info(">>> kosBoardDelete(KosBoardVO kbvo) In");
		
		return sqlSession.update("kosBoardDelete", kbvo);
	} // end of kosBoardDelete(KosBoardVO kbvo)
	
	public List<KosBoardVO> kosBoardPwCheck(KosBoardVO kbvo) {
		logger.info(">>> public List<KosBoardVO> kosBoardPwCheck(KosBoardVO kbvo)  In");
		return sqlSession.selectList("kosBoardPwCheck", kbvo);
	} // end of public List<KosBoardVO> kosBoardPwCheck(KosBoardVO kbvo) {
	
} // end of class
