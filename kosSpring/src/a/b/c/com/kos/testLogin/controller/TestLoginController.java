package a.b.c.com.kos.testLogin.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import a.b.c.com.kos.testLogin.service.TestLoginService;
import a.b.c.com.kos.testLogin.vo.TestLoginVO;

@Controller
public class TestLoginController {
	
	Logger logger = LogManager.getLogger(TestLoginController.class);
	
	@Autowired(required=false)
	TestLoginService testLoginService;
	
	@GetMapping("testLoginForm")
	public String testLoginForm() {
		logger.info(">>> testLoginForm() In");
		
		return "testLogin/testLoginForm";
	}
	
	@GetMapping("testSignup")
	public String testSignup() {
		logger.info(">>> testLoginSignup() In");
		
		return "testLogin/testSignup";
	}
	
	@PostMapping("testMemInsert")
	public String testMemInsert(TestLoginVO tvo, HttpServletRequest req) {
		logger.info(">>> testLoginInsert() In");
		
		int nCnt = testLoginService.testMemInsert(tvo);
		
		if(nCnt > 0) {
			return "testLogin/testLoginForm";
		}
		
		return "testLogin/testLoginInsert";
	}

}
