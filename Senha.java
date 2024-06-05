package Códigolimpo;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int senhaMestre, senhaTentativa;
		double num1, num2,soma;
		
		System.out.println("Cadastre uma senha(Apenas números): ");
		senhaMestre= ler.nextInt();
		
		System.out.print("Digite um número:");
		num1 = ler.nextDouble();
		System.out.print("Digite outro número:");
		num2 = ler.nextDouble();
		
		soma= num1+num2;
		System.out.print("Digite sua senha para desbloqueiar a soma:");
		senhaTentativa= ler.nextInt();

		if (senhaTentativa == senhaMestre) {
			System.out.println( "Senha identificada!"+ "A soma é:"+ soma);
		}
		if (senhaTentativa != senhaMestre) {
		System.out.println	("Erro! Senha inválida!");
			ler.close();
		}
	}

}
