/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgCartao;

import br.com.una.poo2015s02.Entidades.Banco;
import pkgCliente.Cliente;

public interface InterfaceCartao {
	public String compra(double compra);
	public int getNumeroCartao();
	public void setNumeroCartao(int numeroCartao);
	public short getCodSeg();
	public void setCodSeg(short codSeg);
	public double getLimiteCredito();
	public void setLimiteCredito(double limiteCredito);
	public double getGastoAtual();
	public void setGastoAtual(double gastoAtual);
	public String getBandeira();
	public void setBandeira(String bandeira);
	public Cliente getCliente();
	public Banco getBanco();
}
