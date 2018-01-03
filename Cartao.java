/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgCartao;
import br.com.una.poo2015s02.Entidades.Banco;
import pkgCliente.Cliente;

public class Cartao implements InterfaceCartao{
	private int numeroCartao;
	private short codSeg;
	private double limiteCredito;
	private double gastoAtual;
	private Cliente cliente;
	private String bandeira;
	private Banco banco;
	
	public Cartao(int numero, short codS, double limite, double gasto, String band, Cliente cli, Banco b){
		this.numeroCartao = numero;
		this.codSeg = codS;
		this.limiteCredito = limite;
		this.gastoAtual = gasto;
		this.bandeira = band;
		this.cliente = cli;
		this.banco = b;
	}
		
	public String compra(double compra){
		if(compra <= this.limiteCredito){   //this.gastoAtual + compra
			this.limiteCredito -= compra;
			this.gastoAtual += compra;
			return "compra autorizada";
		}else{
			return "compra nao autorizada";
		}
	}
	
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public short getCodSeg() {
		return codSeg;
	}
	public void setCodSeg(short codSeg) {
		this.codSeg = codSeg;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public double getGastoAtual() {
		return gastoAtual;
	}
	public void setGastoAtual(double gastoAtual) {
		this.gastoAtual = gastoAtual;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public Cliente getCliente(){
		return this.cliente;
	}
	public Banco getBanco(){
		return this.banco;
	}
}
