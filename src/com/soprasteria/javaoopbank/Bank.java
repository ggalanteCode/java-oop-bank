package com.soprasteria.javaoopbank;

import java.util.Scanner;

import com.soprasteria.javaoopbank.conto.Conto;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String utente;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserire il proprio nome: ");
		utente = s.nextLine();
		
		Conto myConto = new Conto(utente);
	}

}
