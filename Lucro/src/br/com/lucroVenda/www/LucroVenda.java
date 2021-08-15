package br.com.lucroVenda.www;

import java.util.Scanner;

public class LucroVenda {

	public static void main(String[] args) {
		
		int num1, num2;
		char op;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		num1 = teclado.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		num2 = teclado.nextInt();
		
		System.out.println("Informe o Operador: ");
		op = teclado.next().charAt(0);
		
		if(op == '+') {
			
			double resultado = (num1 + num2);					
			System.out.println("O resultado da soma é: " + resultado);
		}
		else if(op == '-') {
			
			double resultado = (num1 - num2);					
			System.out.println("O resultado da subtração é: " + resultado);
		}
		else if(op == '*') {
			
			double resultado = (num1 * num2);					
			System.out.println("O resultado da multiplicação é: " + resultado);
		}
		else if(op == '/'){

			double resultado = (num1 / num2);					
			System.out.println("O resultado da divisão é: " + resultado);
		}
		else {
			System.out.println("Insira um operador matemático válido.");
		}						
		
		//fim do scanner
		teclado.close();
	}

}

