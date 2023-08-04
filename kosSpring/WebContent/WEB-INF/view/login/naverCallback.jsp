<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.simple.JSONObject"%>
<%@ page import="org.json.simple.parser.JSONParser"%>
<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.net.HttpURLConnection"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.InputStreamReader"%>   

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	
	<body>
	<%
		String clientId = "Mydspoo3QVfF6dBYT3uE";
		String clientSecret = "l05ULnMB3Y";
		
		String code = request.getParameter("code");
		System.out.println(">>>>>>>>>>>>> code : " + code);
		String state = request.getParameter("state");
		System.out.println(">>>>>>>>>>>>> state : " + state);
		
		String redirectURI = URLEncoder.encode("http://localhost:8088/kosSpring/naverCallback.lhd", "UTF-8");
		
		String 	apiURL;
		apiURL = "https://nid.naver.com/oauth2.0/token?grant_type=authorization_code&";
		apiURL += "client_id=" + clientId;
		apiURL += "&client_secret=" + clientSecret;
		apiURL += "&redirect_uri=" + redirectURI;
		apiURL += "&code=" + code;
		apiURL += "&state=" + state;
		
		String access_token = "";
		String refresh_token = "";
		
		System.out.println(">>> apiURL : " + apiURL);
		
		try{
			System.out.println(">>>>>>>>>>>>>>>>>");
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			System.out.println(">>> responseCode : " + responseCode);	
			
			
			if(responseCode==200) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				String inputLine = "";
				StringBuffer res = new StringBuffer();
				
				while((inputLine = br.readLine()) != null) {
					res.append(inputLine);					
				}
				br.close();
				
				JSONParser jsonParser = new JSONParser();
				JSONObject jsonObject = (JSONObject)jsonParser.parse(res.toString());
				
				access_token = (String)jsonObject.get("access_token");
				System.out.println(">>> access_token :" + access_token);
				request.setAttribute("access_token", access_token);
				
				RequestDispatcher rd = request.getRequestDispatcher("/naverlogin.lhd");
				rd.forward(request, response);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}		
	%>
	
	</body>
</html>