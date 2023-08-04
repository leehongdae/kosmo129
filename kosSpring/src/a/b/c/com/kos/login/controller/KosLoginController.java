package a.b.c.com.kos.login.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import a.b.c.com.common.K_Session;
import a.b.c.com.kos.login.service.KosLoginService;
import a.b.c.com.kos.mem.vo.KosMemberVO;

@Controller
public class KosLoginController {
	Logger logger = LogManager.getLogger(KosLoginController.class);

	@Autowired(required = false)
	private KosLoginService kosLoginService;

	// LoginForm
	@GetMapping("loginForm")
	public String kosLoginForm() {
		logger.info(">>> kosLoginForm() In");

		return "login/loginForm";
	} // end of kosLoginForm()

	// login Check
	// @ResponseBody
	@PostMapping("loginCheck")
	public String kosLoginCheck(HttpServletRequest req, KosMemberVO kvo, Model model) {
		logger.info(">>> kosLoginCheck() In");

		List<KosMemberVO> listLogin = kosLoginService.kosLoginCheck(kvo);

		if (listLogin.size() == 1) {
			logger.info(">>> kosLoginCheck() :: listLogin.size() : " + listLogin.size());

			K_Session ks = K_Session.getInstance();
			String kID = ks.getSession(req);

			if (kID != null && kID.equals(listLogin.get(0).getMid())) {
				logger.info(">>> kosLoginCheck() :: 로그인중 : 메인페이지로 이동  : " + kID);

				model.addAttribute("listLogin", listLogin);
				return "main/mainPage";
			} else {
				ks.setSession(req, kvo.getMid());
				logger.info(">>> kosLoginCheck() :: 세션부여 하기 : " + kvo.getMid());

				model.addAttribute("listLogin", listLogin);
				return "main/mainPage";

			} // end of if-else

		} // end of if(listLogin.size() == 1)
		logger.info(">>> 아이디와 비밀번호 확인 바랍니다.");
		return "login/loginForm";
	} // end of kosLoginCheck()

	// Logout
	@GetMapping("logout")
	public String kosLogout(HttpServletRequest req, KosMemberVO mvo, Model model) {
		logger.info(">>> kosLogout(HttpServletRequest req, KosMemberVO mvo, Model model) In");

		K_Session ks = K_Session.getInstance();
		ks.killSession(req);

		return "login/logout";
	} // end of kosLogout(HttpServletRequest req, KosMemberVO mvo, Model model)

	@GetMapping("kakaoLogin")
	public String kakaoLogin(HttpServletRequest req, KosMemberVO kvo, Model model) {
		logger.info(">>> kakaoLogin() In");

		String snstype = req.getParameter("snstype");
		String snsid = req.getParameter("snsid");
		String snsemail = req.getParameter("snsemail");
		String mgender = req.getParameter("k_gender");

		logger.info(">>> snstype : " + snstype);
		logger.info(">>> snsid : " + snsid);
		logger.info(">>> snsemail : " + snsemail);
		logger.info(">>> mgender : " + mgender);

		if ("male".equals(mgender)) {
			mgender = "M";
		} else {
			mgender = "F";
		}

		kvo.setSnstype(snstype);
		kvo.setSnsid(snsid);
		kvo.setSnsemail(snsemail);
		kvo.setMgender(mgender);
		kvo.setMnum("12345");
		
		kvo.setMid("lhd");
		kvo.setMpw("1234");
		kvo.setMhp("01000001234");
		kvo.setMemail("abc@naver.com");

		int nCnt = kosLoginService.kakaoInsert(kvo);
		logger.info(">>> nCnt : " + nCnt);

		if (nCnt > 0) {
			return "chat/chat";
		} else {
			return "chat/chat";
		}

	} // end of kakaoLogin()

	@GetMapping("naverCallback")
	public String naverCallback() {
		logger.info(">>> naverCallback() In");

		return "login/naverCallback";
	}

	@GetMapping("naverlogin")
	public String naverLogin(HttpServletRequest request, Model model, KosMemberVO kmvo) {
		logger.info(">>> naverLogin In ");

		String access_token = (String) request.getAttribute("access_token");
		logger.info(">>> access_token : " + access_token);

		String token = access_token;
		String header = "Bearer " + token;
		String apiURL = "https://openapi.naver.com/v1/nid/me";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Authorization", header);
		String responseBody = get(apiURL, requestHeaders);
		logger.info(">>> responseBody :" + responseBody);

		JSONObject jobj = new JSONObject();
		JSONParser parser = new JSONParser();

		try {
			jobj = (JSONObject) parser.parse(responseBody);

			String resultcode = (String) jobj.get("resultcode");
			String message = (String) jobj.get("message");

			jobj = (JSONObject) jobj.get("response");
			String id = (String) jobj.get("id");
			String email = (String) jobj.get("email");
			String name = (String) jobj.get("name");
			String nick = (String) jobj.get("nickname");
			String phone = (String) jobj.get("mobile");
			String photo = (String) jobj.get("profile_imege");
			String snstype = request.getParameter("snstype");

			logger.info(">>> id :" + id);
			logger.info(">>> email :" + email);
			logger.info(">>> name :" + name);
			logger.info(">>> nick :" + nick);
			logger.info(">>> phone :" + phone);
			logger.info(">>> photo :" + photo);
			
			kmvo.setMid(id);
			kmvo.setMemail(email);
			kmvo.setMname(name);
			kmvo.setSnstype(snstype);
			
			int nCnt = kosLoginService.kakaoInsert(kmvo);
			if(nCnt > 0) {
				return "login/login";
			}else {
				return "login/login";
			}		

		} catch (Exception e) {
			System.out.println(">>> json 객체 변환실패");
		}
		return "login/loginForm";

	}

	// -------- RestFul 방식의 데이터 받아오기 위한 메소드
	// -------------------------------------------------------------------
	public static String get(String apiUrl, Map<String, String> requestHeaders) {
		HttpURLConnection con = connect(apiUrl);
		try {
			con.setRequestMethod("GET");
			for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
			}
			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
				return readBody(con.getInputStream());
			} else { // 에러 발생
				return readBody(con.getErrorStream());
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		} finally {
			con.disconnect();
		}
	}

	public static HttpURLConnection connect(String apiUrl) {
		try {
			URL url = new URL(apiUrl);
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다 >>> : " + apiUrl, e);
		} catch (IOException e) {
			throw new RuntimeException("연결이 실패했습니다 >>> : " + apiUrl, e);
		}
	}

	public static String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body);
		try (BufferedReader lineReader = new BufferedReader(streamReader)) {
			StringBuilder responseBody = new StringBuilder();
			String line;
			while ((line = lineReader.readLine()) != null) {
				responseBody.append(line);
			}
			return responseBody.toString();
		} catch (IOException e) {
			throw new RuntimeException("API 응답을 읽는데 실패했습니다. >>> : ", e);
		}
	}

} // end of class()
