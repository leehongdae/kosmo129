package a.b.c.com.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class DateFormatUtil {
	
	static Logger logger = LogManager.getLogger(DateFormatUtil.class);
	
	// yyyymmdd 문자열 반환
	public static String ymdFormat() {
		
		logger.info(">>> ymdformat() In");
		
		return new SimpleDateFormat("yyyyMMdd").format(new Date());		
	} // end of ymdFormat()
	
	// yyyymm 문자열 반환
	public static String ymFormat() {
		
		logger.info(">>> ymformat() In");
		
		return new SimpleDateFormat("yyyyMM").format(new Date());		
	} // end of ymFormat()
	
	// yyyymmdd 문자열 반환
	public static String yFormat() {
		
		logger.info(">>> yformat() In");
		
		return new SimpleDateFormat("yyyy").format(new Date());		
	} // end of yFormat()
	
	// 모드 선택후 출력 확인
	public static String ymdFormats(String ymdFlag) {
		
		logger.info(">>> ymdFormat() In");
		
		String y = "";
		if("D".equals(ymdFlag.toUpperCase())) {
			y = DateFormatUtil.ymdFormat();
		}
		if("M".equals(ymdFlag.toUpperCase())) {
			y = DateFormatUtil.ymFormat();
		}
		if("Y".equals(ymdFlag.toUpperCase())) {
			y = DateFormatUtil.yFormat();
		}
		if("N".equals(ymdFlag.toUpperCase())) {
			y = "";
		}
		
		return y;
	} // end of ymdFormat()

}
