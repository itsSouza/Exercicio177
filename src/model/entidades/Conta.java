package model.entidades;

import model.excecoes.DominioExcecao;

public class Conta {
	
	private Integer id;
	private String nome;
	private Double saldo;
	private Double limiteSaque;
	
public Conta() {
}

public Conta(Integer id, String nome, Double saldo, Double limiteSaque) {
	this.id = id;
	this.nome = nome;
	this.saldo = saldo;
	this.limiteSaque = limiteSaque;
}

public Integer getId() {
	return id;
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getSaldo() {
	return saldo;
}


public Double getLimiteSaque() {
	return limiteSaque;
}


public void deposito(Double valor) {
	 saldo += valor;
}

public void saque(Double valor) throws DominioExcecao {
	if(valor > limiteSaque) {
		throw new DominioExcecao("O valor que deseja sacar é maior que o limite!");
	}
	if(valor > saldo) {
		throw new DominioExcecao("O valor que deseja sacar é maior que o saldo da conta!");		
	}
	saldo -= valor;
}


}
