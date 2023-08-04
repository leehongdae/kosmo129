package a.b.c.com.kos.mem.dao;

import java.util.List;

import a.b.c.com.kos.mem.vo.KosMemberVO;

public interface KosMemberDAO {
	
	int kosMemberInsert(KosMemberVO kvo);
	
	List<KosMemberVO> kosIdCheck(KosMemberVO kvo);
	
	List<KosMemberVO> kosMemberSelectAll(KosMemberVO kvo);
	
	List<KosMemberVO> kosMemberSelect(KosMemberVO kvo);
	
	public int kosMemberUpdate(KosMemberVO kvo);
	
	int kosMemberDummy(KosMemberVO kvo);

}
