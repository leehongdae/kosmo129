package a.b.c.com.kos.mem.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.mem.vo.KosMemberVO;

@Repository
public class KosMemberDAOImpl implements KosMemberDAO  {
	
	private Logger logger = LogManager.getLogger(KosMemberDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;    
	
	@Override
	public int kosMemberInsert(KosMemberVO kvo) {
		
		logger.info(">>> kosMemberInsert(KosMemberVO kvo) In");
		
		return sqlSession.insert("kosMemberInsert", kvo);		
	} // end of kosMemberInsert(KosMemberVO kvo)
	
	@Override
	public List<KosMemberVO> kosIdCheck(KosMemberVO kvo) {
		logger.info(">>> 	List<KosMemberVO> kosIdCheck(KosMemberVO kvo) In");
		
		return sqlSession.selectList("kosIdCheck", kvo);
	} // end of List<KosMemberVO> kosIdCheck(KosMemberVO kvo)
	
	@Override
	public List<KosMemberVO> kosMemberSelectAll(KosMemberVO kvo) {
		logger.info(">>> public List<KosMemberVO> kosMemberSelectAll(KosMemberVO mvo) In");
		
		return sqlSession.selectList("kosMemberSelectAll", kvo);
	} // end of public List<KosMemberVO> kosMemberSelectAll(KosMemberVO mvo)
	
	
	@Override
	public List<KosMemberVO> kosMemberSelect(KosMemberVO kvo) {
		logger.info(">>> kosMemberSelect(KosMemberVO kvo) In");
		
		return sqlSession.selectList("kosMemberSelect", kvo);
	} // end of kosMemberSelect(KosMemberVO kvo);
	
	@Override
	public int kosMemberUpdate(KosMemberVO kvo) {
		logger.info(">>> kosMemberUpdate(KosMemberVO kvo) In");
		
		return sqlSession.update("kosMemberUpdate", kvo);
	} // end of kosMemberUpdate(KosMemberVO kvo)
	
	@Override
	public int kosMemberDummy(KosMemberVO kvo) {
		
		return sqlSession.insert("kosMemberDummy", kvo);
	}

} // end of class
