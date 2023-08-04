package a.b.c.com.kos.testLogin.vo;

public class TestLoginVO {
	
	private String test_id; 
	private String test_pw; 
	private String test_snstype; 
	private String test_snsid; 
	private String test_email; 
	private String test_gender; 
	private String test_birthday;
	
	
	
	public TestLoginVO() {
	}

	public TestLoginVO(String test_id, String test_pw, String test_snstype) {
		this.test_id = test_id;
		this.test_pw = test_pw;
		this.test_snstype = test_snstype;
	}
	
	public TestLoginVO(String test_id, String test_pw, String test_snstype, String test_snsid, String test_email,
			String test_gender, String test_birthday) {
		this.test_id = test_id;
		this.test_pw = test_pw;
		this.test_snstype = test_snstype;
		this.test_snsid = test_snsid;
		this.test_email = test_email;
		this.test_gender = test_gender;
		this.test_birthday = test_birthday;
	}

	public String getTest_id() {
		return test_id;
	}
	public void setTest_id(String test_id) {
		this.test_id = test_id;
	}
	public String getTest_pw() {
		return test_pw;
	}
	public void setTest_pw(String test_pw) {
		this.test_pw = test_pw;
	}
	public String getTest_snstype() {
		return test_snstype;
	}
	public void setTest_snstype(String test_snstype) {
		this.test_snstype = test_snstype;
	}
	public String getTest_snsid() {
		return test_snsid;
	}
	public void setTest_snsid(String test_snsid) {
		this.test_snsid = test_snsid;
	}
	public String getTest_email() {
		return test_email;
	}
	public void setTest_email(String test_email) {
		this.test_email = test_email;
	}
	public String getTest_gender() {
		return test_gender;
	}
	public void setTest_gender(String test_gender) {
		this.test_gender = test_gender;
	}
	public String getTest_birthday() {
		return test_birthday;
	}
	public void setTest_birthday(String test_birthday) {
		this.test_birthday = test_birthday;
	} 
	
	
}
