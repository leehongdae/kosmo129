package a.b.c.com.kos.testLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.testLogin.dao.TestLoginDAO;
import a.b.c.com.kos.testLogin.vo.TestLoginVO;

@Service
@Transactional
public class TestLoginServiceImple implements TestLoginService {
	
	@Autowired(required=false)
	TestLoginDAO testLoginDAO;
	
	@Override
	public int testMemInsert(TestLoginVO tvo) {
		
		return testLoginDAO.testMemInsert(tvo);
	}

}