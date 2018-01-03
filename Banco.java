/**
 * Matheus Coelho
 * Rafael Dória
 * */
package br.com.una.poo2015s02.Entidades;

public class Banco implements InterfaceBanco{
	private String nomeBanco;
	private int codigoBanco;
	private String telefoneSAC;
	
	public Banco(){
		this.nomeBanco = "Itau";
		this.codigoBanco = 347;
		this.telefoneSAC = "08007071010";
	}
	
	public Banco(String nome, int codigo, String telefone){
		this.nomeBanco = nome;
		this.codigoBanco = codigo;
		this.telefoneSAC = telefone;
	}
	
	public String getNomeBanco(){
		return this.nomeBanco;
	}
	public void setNomeBanco(String nome){
		this.nomeBanco = nome;
	}
	
	public int getCodigoBanco(){
		return this.codigoBanco;
	}
	public void setCodigoBanco(int codigo){
		this.codigoBanco = codigo;
	}
	
	public String getTelefoneSAC(){
		return this.telefoneSAC;
	}
	public void setTelefoneSAC(String telefone){
		this.telefoneSAC = telefone;
	}
	public void getGastoT(){
		
	}
	
}
