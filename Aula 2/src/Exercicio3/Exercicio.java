package Exercicio3;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		System.out.println("Digite 1, para verificação das condições de ocorrência de um triângulo");
		System.out.println("Digite 2, para cálculo da área e perimetro de um poligono");
		System.out.println("Digite 3, para sair");
		
		int a;
	    Scanner in = new Scanner(System.in);
	    
	    a = in.nextInt();
	    
	    if(a == 1)
	    {
	    	System.out.println("Digite os lados do triângulo");
	    	int x;
			int y;
			int z;
			
			
			x = in.nextInt();
			y = in.nextInt();
			z = in.nextInt();
			
			if((y - z < x && y + z > x) && (x - z < y && x + z > y) && (x - y < z && x + y > z)) {
				System.out.println("É triângulo");
			}
			else 
				System.out.println("Não é triângulo");
			
	    }
	    else if(a == 2) {
	    	System.out.println("Digite os lados do poligono e qual o seu tipo");
	    	int w; 
			int b;
			int areat;
			int arear;
			int pert;
			int perr;
			
			String tipo;
			
			
			w = in.nextInt();
			b = in.nextInt();
			tipo = in.next();
			
			areat = (w*b)/2;
			int d= (int) Math.pow(w, 2);
			int e= (int) Math.pow(b, 2); 
			int c= (int) Math.sqrt(d+e);
			pert = w+b+c;
			if(tipo.equals("triangulo") ){
			 	
				System.out.println(areat);
				System.out.println(pert);
			}
			if(tipo=="retangulo") {
				arear = w*b; 
				perr = w+w+b+b;
			}
	    }
	    else if(a == 3) {
	    	System.exit(0);
	    }
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
