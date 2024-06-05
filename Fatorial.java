package Códigolimpo;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int fat = 1,num;
		
		System.out.println("Informe o Fatorial: ");
		num = ler.nextInt();
		
		if (num<0) {
			System.out.println("Não existe fatorial de número negativo!");
			System.exit(0);
		}
		if (num > 0) {
			for( int i=1; i<=num ; i++) {
				fat *= i;

			}
			System.out.print("O fatorial de um " + num + " é :" + fat);
		}
		ler.close();
	}

}
