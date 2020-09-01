package Exercicio2;

import java.util.Scanner;

public class Exercicio {
	
	
	public static void main(String[] args) {
		int a;
		int b;
		int areat;
		int arear;
		int pert;
		int perr;
		
		String tipo;
		
		Scanner in = new Scanner(System.in);
		
		
		a = in.nextInt();
		b = in.nextInt();
		tipo = in.next();
		
		areat = (a*b)/2;
		int d= (int) Math.pow(a, 2);
		int e= (int) Math.pow(b, 2); 
		int c= (int) Math.sqrt(d+e);
		pert = a+b+c;
		if(tipo.equals("triangulo") ){
		 	
			System.out.println(areat);
			System.out.println(pert);
		}
		if(tipo=="retangulo") {
			arear = a*b; 
			perr = a+a+b+b;
		}
}

}
