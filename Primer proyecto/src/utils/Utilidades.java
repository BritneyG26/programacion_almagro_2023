package utils;

public class Utilidades {
	
	/** 
	 * Método para pintar un menú por defecto
	 */
	public static void pintarMenu() {
		System.out.println("1.Validar email");
		System.out.println("2. Pintar cuadrado");
		System.out.println("3. Mostrar datos");
		System.out.println("4. Salir");
		
	}
	public static void pintarMenu(String menu) {
		String [] opciones = menu.split("\\|");
		for (String opcion : opciones) {
			System.out.println(opcion);
		}
	}
}

//psv pintarMenu(
// public static void pintarMenu(String [] menu) {
//for (String opcion : menu) {
//	syso(opcion);
