package a.b.c.com.kos.mem.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.mem.dao.KosMemberDAO;
import a.b.c.com.kos.mem.vo.KosMemberVO;

@Service
@Transactional
public class KosMemberServiceImpl implements KosMemberService {
	
	private Logger logger = LogManager.getLogger(KosMemberServiceImpl.class);
	
	@Autowired(required=false)
	private KosMemberDAO kosMemberDAO;
	
	// Insert
	@Override
	public int kosMemberInsert(KosMemberVO kvo) {
		
		logger.info(">>> kosMemberInsert(KosMemberVO kvo) In");
		
		return kosMemberDAO.kosMemberInsert(kvo);
	} // end of kosMemberInsert(KosMemberVO kvo)
	
	// idCheck
	@Override
	public List<KosMemberVO> kosIdCheck(KosMemberVO kvo) {
		logger.info(">>> List<KosMemberVO> kosIdCheck(KosMemberVO kvo) In");
				
		return kosMemberDAO.kosIdCheck(kvo);
	} // end of 	List<KosMemberVO> kosIdCheck(KosMemberVO kvo)
	
	@Override
	public List<KosMemberVO> kosMemberSelectAll(KosMemberVO kvo) {
		logger.info(">>> kosMemberSelectAll(KsMemberVO mvo) In");
		
		return kosMemberDAO.kosMemberSelectAll(kvo);
	} // end of List<KosMemberVO> kosMemberSelectAll(KosMemberVO mvo)
	
	@Override
	public List<KosMemberVO> kosMemberSelect(KosMemberVO kvo) {
		logger.info(">>> kosMemberSelect(KosMemberVO kvo) In");
		
		return kosMemberDAO.kosMemberSelect(kvo);
	} // end of kosMemberSelect(KosMemberVO kvo)
	
	@Override
	public int kosMemberUpdate(KosMemberVO kvo) {
		logger.info(">>> kosMemberUpdate(KosMemberVO kvo) In");
		
		return kosMemberDAO.kosMemberUpdate(kvo);
	}
	
	@Override
	public int kosMemberDummy(KosMemberVO kvo) {
		
		return kosMemberDAO.kosMemberDummy(kvo);
	}

}
