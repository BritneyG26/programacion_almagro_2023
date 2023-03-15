package javaucjc.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Declarar variable de tipo String parra representar el nombre de un mes
 * A partir del mes indicar la estación del año
 */

public class corrección {
	public static void main(String[]args ) {
		
		
		String mes = "Enero";
		Scanner scan = new Scanner (System.in);
		System.out.println("Escribe el nombre de un  mes: ");
/*
 * Con la variable mes se guardarán los datos introducidos en el aterior código
 * el system.out es el input xd
 */
		mes = scan.nextLine();
		System.out.println("Mes introducido: "+ mes);
		
		//Realizamos con el if
		String estación = "";
		String mesFebrero = "Febrero";
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase(mesFebrero) || mes.equalsIgnoreCase("Marzo") {
			estacion = "Invierno";
	} else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion = "Verano";
			
			
	}
	//Switch
	switch (mes.toLowerCase()) {
	case "Enero": 
	case "Febrero": 
	case "Marzo":System.out.println("Iniverno");break;
	case "Abril":
	case "Mayo":
	case "Junio":System.out.println("Primavera");break;
	case "Julio":
	case "Agosto":
	case "Septiembre":System.out.println("Verano");break;
	case "Octubre":
	case "Noviembre":
	case "Diciembre":System.out.println("Otoño");break;
	default : System.out.println("Te has equivocado");
		
	}
	}
