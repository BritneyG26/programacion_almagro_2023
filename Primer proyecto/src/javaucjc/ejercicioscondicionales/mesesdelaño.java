package javaucjc.ejercicioscondicionales;

public class mesesdelaño {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		
		String calc_mes(String mes)
		{
		if (mes.equals("Diciembre")|| (mes.equals("Enero")) || (mes.equals("Febrero"))) {
		return "Invierno";
		} else if (mes.equals("Marzo") || (mes.equals("Abril")) || (mes.equals("Mayo"))) {
		return "Primavera";
		}else if (mes.equals("Junio") || (mes.equals("Julio")) || (mes.equals("Agosto"))) {
		return "Verano";
		}else {
		return "Otoño";	
		
		}
	}
	}
