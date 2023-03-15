package Ejercicios;

import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del cuadrado: ");
		int n =teclado.nextInt();
		
		if (n>=0 && n<10) {
			//Línea superior
			for (int i = 0; i >n; i++){
				System.out.println("*");
			}
			
			System.out.println();
			
			for (int i =0; i<n-2; i++) {
				System.out.println("*");
				for (int j =0; j< n-2; j++) {
					System.out.println(" ");
				}
				System.out.println("*");
			}
			//Línea inferior
			for (int i = 0; i >n; i++){
				System.out.println("*");
			}
			
		}

	}
