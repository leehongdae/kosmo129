package a.b.c.com.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class ChabunUtil {
	
	static Logger logger = LogManager.getLogger(ChabunUtil.class);
	
	public static final String BIZ_GUBUN_M = "M";
	public static final String BIZ_GUBUN_B = "B";
	public static final String BIZ_GUBUN_RB = "RB";
	public static final String BIZ_GUBUN_P = "P";
	public static final String BIZ_GUBUN_C = "C";
	public static final String BIZ_GUBUN_O = "O";
	
	// 채번시 마지막 네 자리의 수를 만들때 4자리가 아닐 때 앞에 0을 붙여주는 함수
	public static String numPad(String t, String c) {
		
		logger.info(">>> numPad In");
		
		for(int i=c.length(); i<4; i++) {
			c = "0" + c;
		}		
		String ymd = DateFormatUtil.ymdFormats(t);
		
		return ymd.concat(c);
	} // end of numPad
	
	// 회원 게시판의 채번을 생성
	public static String getMemberChabun(String type, String num) {
		
		logger.info(">>> getMemberChabun() In");
		
		return BIZ_GUBUN_M.concat(ChabunUtil.numPad(type, num));
		
	} // end of getMemberChabun()
	
	public static String getBoardChabun(String type, String num) {
		
		logger.info(">>> getBoardChabun() In");
		
		return BIZ_GUBUN_B.concat(ChabunUtil.numPad(type, num));
		
	} // end of getMemberChabun()
	
	public static String getRboardChabun(String type, String num) {
		
		logger.info(">>> getRboardChabun() In");
		
		return BIZ_GUBUN_RB.concat(ChabunUtil.numPad(type, num));
		
	} // end of getMemberChabun()
	
	public static String getProductChabun(String type, String num) {
		
		logger.info(">>> getProductChabun() In");
		
		return BIZ_GUBUN_P.concat(ChabunUtil.numPad(type, num));
		
	} // end of getMemberChabun()
	
	public static String getCartChabun(String type, String num) {
		
		logger.info(">>> getCartChabun() In");
		
		return BIZ_GUBUN_C.concat(ChabunUtil.numPad(type, num));
		
	} // end of getMemberChabun()
	
	public static String getOrderChabun(String type, String num) {
		
		logger.info(">>> getOrderChabun() In");
		
		return BIZ_GUBUN_O.concat(ChabunUtil.numPad(type, num));
		
	} // end of getMemberChabun()
}     
      