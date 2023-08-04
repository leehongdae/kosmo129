package a.b.c.com.kos.calendar.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kos.calendar.dao.KosCalendarDAO;
import a.b.c.com.kos.calendar.vo.CalendarVO;

@Service
@Transactional
public class CalendarServiceImpl implements CalendarService {
	Logger logger = LogManager.getLogger(CalendarServiceImpl.class);
	
	@Autowired(required=false)
	KosCalendarDAO kosCalendarDAO;
	
	@Override
	public List<CalendarVO> calendarSelectAll(CalendarVO kcvo) {
		logger.info(">>> SelectAll In");
		
		return kosCalendarDAO.calendarSelectAll(kcvo);		
	}
	
	@Override
	public int calendarInsert(CalendarVO kcvo) {
		logger.info(">>> Insert In");
		
		return kosCalendarDAO.calendarInsert(kcvo);
	}
}
