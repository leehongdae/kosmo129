package a.b.c.com.kos.calendar.dao;

import java.util.List;

import a.b.c.com.kos.calendar.vo.CalendarVO;

public interface KosCalendarDAO {
	
	public List<CalendarVO> calendarSelectAll(CalendarVO kcvo);
	
	public int calendarInsert(CalendarVO kcvo);

}
