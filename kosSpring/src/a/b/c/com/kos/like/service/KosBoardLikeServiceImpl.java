package a.b.c.com.kos.like.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.like.dao.KosBoardLikeDAO;
import a.b.c.com.kos.like.vo.KosBoardLikeVO;

@Service
@Transactional
public class KosBoardLikeServiceImpl implements KosBoardLikeService {
	
	Logger logger = LogManager.getLogger(KosBoardLikeServiceImpl.class);
	
	@Autowired(required=false)
	private KosBoardLikeDAO kosBoardLikeDAO; 
	
	@Override
	public List<KosBoardLikeVO> kosBoardLikeSelect(KosBoardLikeVO blvo){
		logger.info(">>> kosboardLikeSelect() In");
		
		return kosBoardLikeDAO.kosBoardLikeSelect(blvo);
	}
	
	@Override
	public List<KosBoardLikeVO> kosBoardLikeSelectAll(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeSelectAll In");
		
		return kosBoardLikeDAO.kosBoardLikeSelectAll(blvo);
	}
	
	@Override
	public int kosBoardLikeInsert(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeInsert In");
		
		return kosBoardLikeDAO.kosBoardLikeInsert(blvo);
	}
	
	@Override
	public int kosBoardLikeUpdate_1(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeUpdate_1 In");
		
		return kosBoardLikeDAO.kosBoardLikeUpdate_1(blvo);
	}
	
	@Override
	public int kosBoardLikeUpdate_2(KosBoardLikeVO blvo) {
		logger.info(">>> kosBoardLikeUpdate_2 In");
		
		return kosBoardLikeDAO.kosBoardLikeUpdate_2(blvo);
	}

}
