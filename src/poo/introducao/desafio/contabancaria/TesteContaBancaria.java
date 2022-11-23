package poo.introducao.desafio.contabancaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TesteContaBancaria {


public static void main(String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String aux, dataDeNascimento;
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
				System.out.println("Digite a data de nascimento");
				dataDeNascimento =  sc.nextLine();
				Date date = sdf.parse(dataDeNascimento);
				System.out.println("Digite o valor do deposito");
				valor = sc.nextDouble();
				contaBancaria = new ContaBancaria(aux, date, valor);
				
				break;
			
		
			case 2:
				contaBancaria.saldoBancario();
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

private static DateTimeFormatter DateTimeFormatter(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
