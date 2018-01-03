/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgCliente;

public class Cliente implements InterfaceCliente{
	private String nomeCliente;
	private long cpf;
	private String rg;
	private String telefone;
	
	public Cliente(String nome, long cpf, String rg, String telefone){
		this.nomeCliente = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
