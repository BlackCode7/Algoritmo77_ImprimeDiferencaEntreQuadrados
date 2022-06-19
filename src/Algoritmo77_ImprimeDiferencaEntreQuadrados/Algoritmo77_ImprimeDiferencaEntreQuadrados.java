package Algoritmo77_ImprimeDiferencaEntreQuadrados;

import java.util.Scanner;

public class Algoritmo77_ImprimeDiferencaEntreQuadrados {

	public static void main(String[] args) {
		
		algoritmo77_ImprimeDiferencaEntreQuadrados();

	}

	public static void algoritmo77_ImprimeDiferencaEntreQuadrados() {
		int a, b, c, d;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		int ds = a-b;		
		c = (int) Math.pow(ds, 2);		
		d = (int) (Math.pow(a, 2) - Math.pow(b, 2));		
		System.out.println("O quadrado da diferença = "+d+ " diferença dos quadrados = " + c);
	}

}
