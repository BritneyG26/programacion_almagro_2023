package Bucles;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número: ");
		Scanner scan = new Scanner (System.in);
		int numElementos = scan.nextInt();

		int n1 =0; 
		int n2=1;
		
		System.out.println(n1);
		System.out.println("," + n2);
		
		for (int i = 0; i< numElementos -2; ++i) {
			int suma = n1+n2;
			System.out.println(","+ suma);
			n1 = n2;
			n2 = suma;
		}
	}

}
