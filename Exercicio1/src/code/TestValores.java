package code;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestValores {

	private Valores valores;
	
	@Before
	public void setUP() {
		System.out.println("Inicializando lista");
		valores = new Valores();
		valores.ins(5);
		valores.ins(200);
		valores.ins(12);
		valores.ins(7);
	}
	@Test
	public void testSize() {
		System.out.println("Verificando tamanho da lista");
		assertEquals(4, this.valores.size());
	}
	
	@Test
	public void testDel() {
		assertEquals(12, valores.del(2));
		assertEquals(-1, valores.del(9));
		valores.ins(8);
		assertEquals(8, valores.del(2));
		
	}
	@Test
	public void testIns() {
		assertEquals(true, valores.ins(10));
		assertEquals(true, valores.ins(12));
		assertEquals(false, valores.ins(0));
		assertEquals(false, valores.ins(-1)); 
	}
	
}
