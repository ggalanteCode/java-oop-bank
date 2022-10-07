package com.soprasteria.javaoopbank.conto;

import java.util.Random;

public class Conto {
	
	private int numeroConto;
	private String nomeProprietario;
	private double saldo;
	
	private Random r = new Random();
	
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
	
	public void versamento(double sommaDaVersare) {
		this.saldo += sommaDaVersare;
	}
	
	public double prelievo(double sommaDaPrelevare) {
		if(!(sommaDaPrelevare > this.saldo)) {
			return this.saldo -= sommaDaPrelevare;
		} else {
			return -1;
		}
	}
	
	public String informazioniConto() {
		return "Proprietario del conto: " + nomeProprietario + "\n" +
			   "Numero conto: "+ numeroConto + "\n" + this.contoFormattato();
	}
	
	private String contoFormattato() {
		return String.format("Il saldo attuale sul conto è: %.2f", saldo);
	}

}
