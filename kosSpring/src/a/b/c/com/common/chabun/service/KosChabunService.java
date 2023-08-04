package a.b.c.com.common.chabun.service;

import a.b.c.com.kos.board.vo.KosBoardVO;
import a.b.c.com.kos.cart.vo.KosCartVO;
import a.b.c.com.kos.mem.vo.KosMemberVO;
import a.b.c.com.kos.order.vo.KosOrderVO;
import a.b.c.com.kos.product.vo.KosProductVO;
import a.b.c.com.kos.rboard.vo.KosRboardVO;

public interface KosChabunService {
	
	public KosMemberVO getKosMemberChabun();
	
	public KosBoardVO getKosBoardChabun();
	
	public KosRboardVO getKosRboardChabun();
	
	public KosProductVO getKosProductChabun();
	
	public KosCartVO getKosCartChabun();
	
	public KosOrderVO getKosOrderChabun();

}
