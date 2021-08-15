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
			System.out.println("O resultado da soma �: " + resultado);
		}
		else if(op == '-') {
			
			double resultado = (num1 - num2);					
			System.out.println("O resultado da subtra��o �: " + resultado);
		}
		else if(op == '*') {
			
			double resultado = (num1 * num2);					
			System.out.println("O resultado da multiplica��o �: " + resultado);
		}
		else if(op == '/'){

			double resultado = (num1 / num2);					
			System.out.println("O resultado da divis�o �: " + resultado);
		}
		else {
			System.out.println("Insira um operador matem�tico v�lido.");
		}						
		
		//fim do scanner
		teclado.close();
	}

}

