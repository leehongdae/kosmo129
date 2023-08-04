package a.b.c.com.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class CodeUtil {
	
	static Logger logger = LogManager.getLogger(CodeUtil.class);
	
	// 성별 라벨
	public static final String[] gender_value = {"Femail", "Male"};
	
	// 핸드폰 라벨
	public static final String[] hp_value = {"010", "011", "016", "017"};
	
	// 전화번호 라벨
	public static final String[] tes_value = {"02", "031", "041", "051", "061"};
	
	// 취미 라벨
	public static final String[] hobby_lavel = {"Game", "Read", "Rest"};
	public static final String[] hobby_value = {"01", "02", "03", "04"};
	
	// 생년월일
	public static String birth(String s) {
		
		logger.info(">>> birth() In");
		
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if(s!=null && s.length() > 0) {
			int sLen = s.length();
			if(8 == sLen) {
				s0 = s.substring(0, 4);
				s1 = s.substring(4, 6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;
				}						
		}
		return ss;
	} // end of birth()
	
	// gender
	public static String gender(String s) {
		
		logger.info(">>> gender() In");
				
		return "F".equals(s.toUpperCase()) ? "Female" : "Male";
	} // end of gender(String s)
	
	// hp
	public static String tel(String s) {
		
		logger.info(">>> tel(String s) In");
		
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if(s !=null && s.length()>0) {
			int sLen = s.length();
			if(10 == sLen) {				
				s0 = s.substring(0,2);
				s1 = s.substring(2,6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;				
			}
			if(11 == sLen) {				
				s0 = s.substring(0,3);
				s1 = s.substring(3,7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;				
			}			
		}		
		return ss;
	} // end of tes(String s)
	
	// hp
	public static String hp(String s) {
		
		logger.info(">>> hp(String s) In");
		
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if(s !=null && s.length()>0) {
			int sLen = s.length();
			if(11 == sLen) {
				s0 = s.substring(0,3);
				s1 = s.substring(3,7);
				s2 = s.substring(7);
				ss= s0 + "-" + s1 + "-" + s2;	
			}
		}
		return ss;
	} // end of hp(String s)
	
	// hobbys
	public static String hobbys(String s) {
		
		logger.info(">>> hobbys(String s) In");
		
		String h = "";
		String ss[] = s.split(",");
		for(int i=0; i<ss.length; i++) {
			logger.info(">>> hobby(ss["+i+"]) : " + hobby(ss[i]) );
			h += hobby(ss[i]) + " ";
		}
		return h;
	} // end of hobbys(String s)
	
	// hobby
	public static String hobby(String s) {
		
		logger.info(">>> hobby(String s) In");
		
		String h = "";
		if(s !=null && s.length()>0) {
			for(int i=1; i<hobby_lavel.length; i++) {
				if(("0" +1).equals(s)) {
					h= CodeUtil.hobby_lavel[i-1];
				}
			}
		}
		return h;
	} // end of hobby(String s)
	
	// 취미 value 세팅
	public static String setHobby(String s) {
		
		logger.info(">>> sethobby(String s) In ");
		
		String h = "";
		for(int i=0; i<CodeUtil.hobby_lavel.length; i++) {
			if(CodeUtil.hobby_value[i].equals(s)) {
				h = CodeUtil.hobby_value[i];
			}
		}
		return h;
	} // end of sethobby(String s)
} // end of class
