package Bucles;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		
		while(!salir) {
			
			System.out.println("1.Validar email");
			System.out.println("2.Pintar cuadrado");
			System.out.println("3.Mostrar datos");
			System.out.println("4.Salir");
			
				
			
				System.out.println("Escribe una de las opciones");
				opcion= scan.nextInt();
				
				switch (opcion) {
				case 1:System.out.println("Elegiste la opción 1");break;
				case 2:pintarCuadrado();break;
				case 3:System.out.println("Elegiste la opción 3");break;
				case 4:System.out.println("Elegiste la opción 4");break;
				default:System.out.println("Elige mal we");	
					
				}
	
				
		}   while (opcion != 4);
		
	}

	public static void pintarCuadrado() {
		int size = 4;
		
		for (int i=0; i<=size; i++) { //Filas
			for (int j=0; j<size; j++) { //Columnas
				if (i==0 || i==size-1) {
			System.out.print("*\t");
				}else {
					if (j==0 || j==size-1) {
						System.out.println("*\t");
					}else {
						System.out.println(" \t");
					}
					}
				}
		}
			//System.out.print("\n");
			System.out.println();
	}
}
