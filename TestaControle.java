/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgTestes;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgCartao.Controle;

public class TestaControle {

	@Test
	public void testGetGastos() {
		Controle c = new Controle();
		assertEquals(0,0, c.getGastos());
	}
}
