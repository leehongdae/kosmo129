package a.b.c.com.kos.login.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.mem.vo.KosMemberVO;

@Repository
public class KosLoginDAOImpl implements KosLoginDAO {
	Logger logger = LogManager.getLogger(KosLoginDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;	
	// loginCheck
	@Override
	public List<KosMemberVO> kosLoginCheck(KosMemberVO kvo) {
		logger.info(">>> kosLoginCheck() In");		
		
		return sqlSession.selectList("kosLoginCheck", kvo);
	} // end of kosLoginCheck()
	
	@Override
	public List<KosMemberVO> kakaoLogin(KosMemberVO kvo) {
		logger.info(">>> kakaoLogin() In ");
		
		return sqlSession.selectList("kakaoLogin", kvo);		
	}
	
	@Override
	public int kakaoInsert(KosMemberVO kvo) {
		logger.info(">>> kakaoInsert() In");
		
		return sqlSession.insert("kakaoInsert", kvo);		
	}
	

} // end of class
