package poo.introducao.desafio.contabancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteContaBancaria {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String aux; 
	int opcao;
	double valor;
	List<ContaBancaria> contas = new ArrayList<>();
	ContaBancaria contaBancaria = null;
	
	do {
		System.out.println();
		System.out.println("Entre como uma das opções abaixo");
		System.out.println("1) Criar conta");
		System.out.println("2) Dados bancario");
		System.out.println("3) Deposito");
		System.out.println("4) Sacar");
		System.out.println("5) Tranferencia");
		System.out.println("6) Sair do sistema");
		
		System.out.println();
		System.out.println("Digite uma opção: ");
		opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Abrindo nova conta.....");
				System.out.println("Digite o nome do cliente");
				sc.next();
				aux = sc.nextLine();
				
				contaBancaria = new ContaBancaria(null, aux, null, valor);
				
				break;
			
		
			case 2:
				
				break;
			
		
			case 3:
				System.out.println("Digite o valor do deposito: ");
				valor = sc.nextDouble();
				contaBancaria.sacar(valor);
				break;
			
			
			case 4:
				break;
			
			
			case 5:
				break;
			
				
		default:
			break;
		}
	}while(opcao!=0) ;
	
	sc.close();
}
}
