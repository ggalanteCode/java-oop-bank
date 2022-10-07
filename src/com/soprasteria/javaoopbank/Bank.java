package com.soprasteria.javaoopbank;

import java.util.Scanner;

import com.soprasteria.javaoopbank.conto.Conto;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String utente;
		int opzione, sommaDaVersarePrelevare;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserire il proprio nome: ");
		utente = s.nextLine();
		
		Conto myConto = new Conto(utente);
		
		do {
			stampaMenu();
			opzione = s.nextInt();
			s.nextLine();
			switch(opzione) {
			case 1:
				System.out.print("Quanti soldi vuoi versare sul tuo conto?:");
				sommaDaVersarePrelevare = s.nextInt();
				myConto.versamento(sommaDaVersarePrelevare);
				System.out.println(myConto.informazioniConto());
				break;
			case 2:
				System.out.print("Quantio soldi vuoi prelevare dal tuo conto?:");
				sommaDaVersarePrelevare = s.nextInt();
				if(myConto.prelievo(sommaDaVersarePrelevare) == -1) {
					System.err.println("ERRORE: NON HAI ABBASTANZA SOLDI SUL TUO CONTO!");
				} else {
					System.out.println(myConto.informazioniConto());
				}
				break;
			case 3:
				break;
			}
		} while(opzione != 3);
	}
	
	private static void stampaMenu() {
		System.out.println("Selezionare l'operazione desiderata:");
		System.out.println("1) versamento");
		System.out.println("2) prelievo");
		System.out.println("3) esci");
	}

}
