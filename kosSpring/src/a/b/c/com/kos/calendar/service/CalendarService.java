package a.b.c.com.kos.calendar.service;

import java.util.List;

import a.b.c.com.kos.calendar.vo.CalendarVO;

public interface CalendarService {
	
	public List<CalendarVO> calendarSelectAll(CalendarVO kcvo);
	
	public int calendarInsert(CalendarVO kcvo);
}
