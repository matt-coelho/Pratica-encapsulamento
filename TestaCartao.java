/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgTestes;

import static org.junit.Assert.*;
import pkgCartao.Cartao;
import org.junit.Test;

import br.com.una.poo2015s02.Entidades.Banco;
import pkgCliente.Cliente;

public class TestaCartao {

	@Test
	public void testCompra() {
		Banco bb = new Banco();
		Cliente cliente = new Cliente("Maria",2500,"RS 17.892-453","(035)5555-0123"); //nome cpf rg telefone, string long string string
		Cartao card = new Cartao(424342643,(short)765,2100.0, 0.0,"visa",cliente, bb); //numero codigo limite gasto bandeira cliente banco ,int short double double cliente banco
		
		assertEquals("compra autorizada",card.compra(50.0));
	}
}
