package view;

import java.util.Scanner;

import Controller.FatorialDuplo;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número ímpar");
		int N = ler.nextInt();
		
		while (N%2==0) {
			System.out.println("Digite um número ímpar");
			N = ler.nextInt();
		}
		
		FatorialDuplo FDuplo = new FatorialDuplo();
		
		System.out.println(FDuplo.FatDuplo(N));
	}

}
