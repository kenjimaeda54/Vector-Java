package aplication;

import java.util.Scanner;

import util.Quarto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com a quantidade de aluguel");;
		int n = sc.nextInt();
		Quarto[] vector = new Quarto[10]; 
		for(int i=0; i<n;i++){
			System.out.print("Qual numero correspondente ao aluguel #");
			int aluguel = sc.nextInt();
			sc.nextLine();
			System.out.print("Qual nome do cliente?");
			String nome = sc.nextLine();
			System.out.print("Qual seu email?");
		    String email= sc.nextLine();    	
		    System.out.print("Qual numero do quarto?");
		    int quarto= sc.nextInt();
			vector[quarto] = new Quarto(aluguel,nome,email,quarto); 
		 }
	    for(int i=0; i<10;i++) {
	    	if(vector[i] != null) {
	    		System.out.println("Quartos ocupados: "+vector[i]);
	    	}
	    }
		sc.close();
	}
}


