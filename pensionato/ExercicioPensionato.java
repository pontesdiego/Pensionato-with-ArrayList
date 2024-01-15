package com.nelio.pensionato;

import java.util.Scanner;

public class ExercicioPensionato {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[10];
		
		for(int i=1; i<=n; i++) {
			System.out.println("");
			System.out.println("Rent #" + i + ":" );
			System.out.print("digite o nome: ");
			String nome = sc.toString();
			
			System.out.println("Digite o email: ");
			String email = sc.next();
			
			System.out.println("Digite o quarto desejado: ");
			int  roomNumber = sc.nextInt();
			
			/*
			 * aqui eu declaro que sempre que uma pessoa for instaciada, ela 
			 * será alocada na posição roomNumber do vetor de aluguel
			 */
			pessoa[roomNumber] = new Pessoa(nome, email);
			
		}
		
		sc.close();
		
		System.out.println("");
		System.out.println("Busy rooms: ");
		
		
	
		for(int i=0; i<10; i++) {
			if(pessoa[i] != null) {
			System.out.println(i + ":" + pessoa[i]);
			}
		}
		
		
		
	}

}
