package a.b.c.com.kos.mem.service;

import java.util.List;

import a.b.c.com.kos.mem.vo.KosMemberVO;

public interface KosMemberService {
	
	// Insert
	int kosMemberInsert(KosMemberVO kvo);
	
	// idCheck
	List<KosMemberVO> kosIdCheck(KosMemberVO kvo);
	
	// SelectAll
	List<KosMemberVO> kosMemberSelectAll(KosMemberVO kvo);
	
	List<KosMemberVO> kosMemberSelect(KosMemberVO kvo);
	
	public int kosMemberUpdate(KosMemberVO kvo);
	
	int kosMemberDummy(KosMemberVO kvo);
	
}
