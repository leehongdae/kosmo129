package a.b.c.com.kos.login.service;

import java.util.List;

import a.b.c.com.kos.mem.vo.KosMemberVO;

public interface KosLoginService {
	
	// 로그인check
	public List<KosMemberVO> kosLoginCheck(KosMemberVO kvo);
	
	// kakao login
	public List<KosMemberVO> kakaoLogin(KosMemberVO kvo);
	
	public int kakaoInsert(KosMemberVO kvo);

}
