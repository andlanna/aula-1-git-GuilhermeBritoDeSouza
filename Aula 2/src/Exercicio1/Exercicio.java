package Exercicio1;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner in = new Scanner(System.in);
		
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if((b - c < a && b + c > a) && (a - c < b && a + c > b) && (a - b < c && a + b > c)) {
			System.out.println("É triângulo");
		}
		else 
			System.out.println("Não é triângulo");
		
	}
}
