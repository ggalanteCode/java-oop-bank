package com.soprasteria.javaoopbank.conto;

import java.util.Random;

public class Conto {
	
	private int numeroConto;
	private String nomeProprietario;
	private double saldo;
	
	private Random r;
	
	public Conto(String nomeProprietario) {
		super();
		this.numeroConto = r.nextInt(1000)+1;
		this.nomeProprietario = nomeProprietario;
		this.saldo = 0;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public double getSaldo() {
		return saldo;
	}

}
