/**
 * Matheus Coelho
 * Rafael Dória
 * */
package pkgCartao;

import br.com.una.poo2015s02.Entidades.Banco;
import pkgCliente.Cliente;

public class Controle implements InterfaceControle{
	private double total = 0.0;
	private Cartao[] lista = new Cartao[10];
	
	public Controle(){
		Banco bb = new Banco();
		Cliente cliente = new Cliente("Maria",2500,"RS 17.892-453","(035)5555-0123"); //nome cpf rg telefone, string long string string
		Cartao card = new Cartao(424342643,(short)765,2100.0, 0.0,"master",cliente, bb); //numero codigo limite gasto bandeira cliente banco ,int short double double cliente banco
		this.lista[0] = card;
		
		Banco bank = new Banco();
		Cliente cli = new Cliente("Hermes",2500,"MG 13.756-876","(035)5555-0123"); //nome cpf rg telefone, string long string string
		Cartao crt = new Cartao(683634623,(short)259,2100.0, 0.0,"visa",cli, bank); //numero codigo limite gasto bandeira cliente banco ,int short double double cliente banco
		this.lista[1] = crt;
		
		Banco b = new Banco();
		Cliente c = new Cliente("Lucio",2500,"SP 15.892-432","(035)5555-0123"); //nome cpf rg telefone, string long string string
		Cartao cd = new Cartao(465392478,(short)603,2100.0, 0.0,"master",c, b); //numero codigo limite gasto bandeira cliente banco ,int short double double cliente banco
		this.lista[2] = cd;
		
		Banco e = new Banco();
		Cliente r = new Cliente("Luiza",2500,"RR 73.857-342","(043)3333-2463");
		Cartao g = new Cartao(4325342,(short)444,2100.0, 0.0,"visa",r,e);
		this.lista[3] = g;
		
		Banco t = new Banco();
		Cliente w = new Cliente("Mirella",2500,"BA 13.997-342","(013)3443-2263");
		Cartao gd = new Cartao(43232555,(short)454,2100.0, 0.0,"visa",w,t);
		this.lista[4] = gd;
		
		Banco bk = new Banco();
		Cliente cl = new Cliente("Carla",2500,"RJ 12.111-976","(052)3511-2463");
		Cartao ct = new Cartao(454222425, (short)841, 2100.0, 0.0, "master", cl, bk);
		this.lista[5] = ct;
		
		Banco ty = new Banco();
		Cliente by = new Cliente("Mel",2500,"RR 73.857-342","(043)3243-2463");
		Cartao gy = new Cartao(83556233,(short)011,2100.0, 0.0,"visa",by,ty);
		this.lista[6] = gy;
		
		Banco bc = new Banco();
		Cliente cn = new Cliente("Ariel",2500,"RR 73.857-342","(051)5364-8665");
		Cartao cao = new Cartao(86856382,(short)114,2100.0, 0.0,"master",cn,bc);
		this.lista[7] = cao;
		
		Banco bh = new Banco();
		Cliente nj= new Cliente("Vanessa",2500,"RJ 12.111-976","(011)2321-8652");
		Cartao mk = new Cartao(866472345, (short)864, 2100.0, 0.0, "visa", nj, bh);
		this.lista[8] = mk;
		
		Banco da = new Banco();
		Cliente io = new Cliente("Paula",2500,"PE 10.111-900","(093)6327-9943");
		Cartao tr = new Cartao(774832245, (short)060, 2100.0, 0.0, "master", io, da);
		this.lista[9] = tr;
	}
	
	public double getGastos(){
		for(int x = 0; x < this.lista.length; x++){
			if(this.lista[x].getBandeira()!= null)
				total += this.lista[x].getGastoAtual();
		}
		return total;
	}
}
