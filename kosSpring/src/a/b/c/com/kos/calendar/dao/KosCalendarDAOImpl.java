package a.b.c.com.kos.calendar.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.kos.calendar.service.CalendarServiceImpl;
import a.b.c.com.kos.calendar.vo.CalendarVO;

@Repository
public class KosCalendarDAOImpl implements KosCalendarDAO {
	
Logger logger = LogManager.getLogger(CalendarServiceImpl.class);
	
	@Autowired(required=false)
	SqlSession sqlSession;
	
	@Override
	public List<CalendarVO> calendarSelectAll(CalendarVO kcvo) {
		logger.info(">>> SelectAll In");
		
		return sqlSession.selectList("calendarSelectAll", kcvo);		
	}
	
	@Override
	public int calendarInsert(CalendarVO kcvo) {
		logger.info(">>> Insert In");
		
		return sqlSession.insert("calendarInsert", kcvo);
	}

}
