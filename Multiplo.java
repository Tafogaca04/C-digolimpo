package Códigolimpo;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double valor;

		System.out.println("Informe o valor: ");
		valor = ler.nextDouble();

		if ( valor % 5 ==0) {
			System.out.println("O número" + " " + valor + " é multiplo de 5 !");
			System.exit(0);
		}
		 if ( valor != 5) {
			 
		 }
		System.out.println("O número"+ " " + valor + " não é multiplo de 5!");
		ler.close();
	}

}
