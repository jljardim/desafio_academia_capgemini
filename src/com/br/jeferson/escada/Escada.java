package com.br.jeferson.escada;

import java.util.Scanner;

public class Escada {
	
	public void escada() {
		
		System.out.println("Informe um numero entre 1   1000!");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		
		System.out.println("\n");
		
		if(numero < 1000) {
		
		for(int i = 1; i <= numero; i++){
			 int espacos = numero - i;
			 
			for(int j =1; j <= espacos; j++){
				System.out.print(" ");
			}
			for(int z = 1; z <= i; z++){
				System.out.print("*");
			}
			if(i != numero) {
				System.out.println("");
			}
		}
		
	 }else {
			System.out.println("  necessario o numero ser at  1000!");
			numero = scanner.nextInt();
		}

   }
	  	 
}
