package a.b.c.com.kos.chat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatServer {
	
	@GetMapping("chat")
	public String chat(HttpServletRequest req, HttpServletResponse res, HttpSession session) {
		return "chat/chat";
	}
	

}
