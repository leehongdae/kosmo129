package a.b.c.com.kos.login.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.login.dao.KosLoginDAO;
import a.b.c.com.kos.mem.vo.KosMemberVO;


@Service
@Transactional
public class KosLoginServiceImpl implements KosLoginService {
	Logger logger = LogManager.getLogger(KosLoginServiceImpl.class);
	
	@Autowired(required=false)
	private KosLoginDAO kosLoginDAO;
	
	
	// loginCheck
	@Override
	public List<KosMemberVO> kosLoginCheck(KosMemberVO kvo) {
		logger.info(">>> kosLoginCheck(KosMemberVO kvo) In");
		
		return kosLoginDAO.kosLoginCheck(kvo);
	} // end of kosLoginCheck()
	
	@Override
	public List<KosMemberVO> kakaoLogin(KosMemberVO kvo) {
		logger.info(">>. kakaoLogin() In");
		
		return kosLoginDAO.kakaoLogin(kvo);
	}
	
	@Override
	public int kakaoInsert(KosMemberVO kvo) {
		logger.info(">>> kakaoInsert() In");
		
		return kosLoginDAO.kakaoInsert(kvo);
		
	}

}
