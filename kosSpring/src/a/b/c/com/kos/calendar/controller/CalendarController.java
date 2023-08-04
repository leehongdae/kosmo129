package a.b.c.com.kos.calendar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import a.b.c.com.kos.calendar.service.CalendarService;
import a.b.c.com.kos.calendar.vo.CalendarVO;

@Controller
public class CalendarController {
	Logger logger = LogManager.getLogger(CalendarController.class);
	
	@Autowired(required=false)
	private CalendarService calendarService;
	
	@GetMapping("calendar")
	public String calendar() {
		logger.info("calendar 함수 진입 >>> : ");	
		
		return "calendar/calendar";
	}

	
	// 캘린더 전체조회
	@GetMapping("calendarSelectAll")
	public String calendarSelectAll(CalendarVO cvo, Model model, HttpSession session) {
		logger.info("calendarSelectAll 진입 성공 >>> : ");
		
		//--------- 캘린더 정보조회 ---------
		
		// 세션 아이디값 
		String mid = (String)session.getAttribute("mid");
		logger.info("mid >>> : " + mid);
		mid = "4444";
		cvo.setMid(mid);
		logger.info("cvo.getMid() >>> : " + cvo.getMid());
		
		List<CalendarVO> aList = calendarService.calendarSelectAll(cvo);
		JSONArray jsonCalendar = new JSONArray();
		
		for(int i = 0 ; i < aList.size();i++){
			CalendarVO cvo_1 = aList.get(i);
			JSONObject jobj = new JSONObject();
			jobj.put("_id", cvo_1.getCal_no());
			jobj.put("title", cvo_1.getCal_title());
			jobj.put("description", cvo_1.getCal_description());
			jobj.put("start", cvo_1.getCal_startdate());
			jobj.put("end", cvo_1.getCal_enddate());
			jobj.put("type", cvo_1.getCal_type());
			jobj.put("username", cvo_1.getMid());
			jobj.put("backgroundColor", cvo_1.getCal_backgroundColor());
			jobj.put("textColor", cvo_1.getCal_textColor());
			boolean bool = false;
			if("true".equals(cvo_1.getCal_allDay())){
				bool = true;
			}
			jobj.put("allDay", bool);
			
			jsonCalendar.add(jobj);
		}
		
		model.addAttribute("jsonCalendar", jsonCalendar);
		
		return "calendar/calendarData";
	}
	
	// 캘린더 입력
	@GetMapping("calendarInsert")
	public String calendarInsert(CalendarVO cvo, Model model, HttpSession session) {
		logger.info("calendarInsert 진입 성공 >>> : ");
		
		// 세션 아이디값 
		String mid = (String)session.getAttribute("mid");
		mid = "4444";
		cvo.setMid(mid);		
		logger.info("cvo.getMid >>> : " + cvo.getMid());
		logger.info("cvo.getCal_type >>> : " + cvo.getCal_type());
		
		int nCnt = calendarService.calendarInsert(cvo);
		
		return "calendar/calendarData";
	}
}
