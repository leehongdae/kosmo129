package a.b.c.com.kos.main.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KosMainController {
	Logger logger = LogManager.getLogger(KosMainController.class);
	
	@GetMapping("mainPage")
	public String kosMainPage() {
		logger.info(">>> kosMainPage() In");
		
		return "main/mainPage";
		
	} // end of kosmainPage()
	
	@GetMapping("mainPage01")
	public String kosMainPage01() {
		logger.info(">>> kosMainPage01() In");
		
		return "main/mainPage01";
		
	} // end of kosmainPage()
}
