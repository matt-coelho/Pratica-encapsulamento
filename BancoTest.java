/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgTestes;

import static org.junit.Assert.*;
import br.com.una.poo2015s02.Entidades.Banco;
import org.junit.Test;

public class BancoTest {

	@Test
	public void testBanco() {
		Banco b = new Banco();
		assertEquals("Itau", b.getNomeBanco());
		assertEquals(347, b.getCodigoBanco());
		assertEquals("08007071010", b.getTelefoneSAC());
		//fail("Not yet implemented");
	}

	@Test
	public void testBancoStringIntString() {
		Banco b = new Banco("Bradesco",237,"08007777000");
		assertEquals("Bradesco", b.getNomeBanco());
		assertEquals(237, b.getCodigoBanco());
		assertEquals("08007777000", b.getTelefoneSAC());
	}

	/**
	 * 
	 
	@Test
	public void testGetNomeBanco() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNomeBanco() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCodigoBanco() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCodigoBanco() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTelefoneSAC() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTelefoneSAC() {
		fail("Not yet implemented");
	}
	*/

}
