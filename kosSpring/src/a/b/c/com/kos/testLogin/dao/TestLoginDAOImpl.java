package a.b.c.com.kos.testLogin.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.testLogin.vo.TestLoginVO;

@Repository
public class TestLoginDAOImpl implements TestLoginDAO {
	
	@Autowired(required=false)
	SqlSession sqlSession; 
	
	@Override
	public int testMemInsert(TestLoginVO tvo) {
		
		return sqlSession.insert("testMemInsert", tvo);
	}

}
