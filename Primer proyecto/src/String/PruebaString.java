package String;

public class PruebaString {

	public static void main(String[] args) {
		String nombre = "Caperucita Roja";
		
		nombre = nombre.toUpperCase();
		
		System.out.println(nombre);
		
		String lobo1 = "Lobo";
		String lobo2 = "Lobo";
		
		System.out.println(lobo1 == lobo2);
		
		lobo2 = nombre.toLowerCase();
		
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		
		System.out.println(nombre.endsWith("JA"));
		
		System.out.println(nombre.indexOf("A"));
		System.out.println(nombre.lastIndexOf("A"));
		
		System.out.println("   xd xdxd     ".trim());
		System.out.println("   xd  xddd    ".replace(" ", ""));
		//CAPERUCITA ROJA
		System.out.println(nombre.substring(5));
		System.out.println(nombre.substring(3,7));
		
		int posicion = nombre.indexOf("ROJA");
		System.out.println(nombre.substring(posicion));
		//int posicion = nombrre,indexOf(" ");
		//System.out.println(nombre.substring(posicion).trim());
		
		String cadena = "N1;A1;DNI1;23;MADRID";
		
		String []valores = cadena.split(";");
		for (String valor : valores);{
			System.out.println(valores);
		}
		
	}

}
