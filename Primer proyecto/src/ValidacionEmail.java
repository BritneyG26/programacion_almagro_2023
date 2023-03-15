
public class ValidacionEmail {

	public static void main(String[] args) {
		
		String email = "loquesea@gamil.com";
		
		email = email.trim();
		String mensajeError = "";
		

		//Validamos el email
		//El email debe contener una @
		if (email.indexOf("@")==-1) {
			//el index me hace saber la posición
			//Saber que solo hay un @
			mensajeError += "El email no tiene un @";
			//Esto hará que cuente la cantidad de posiciones y si son iguales es que solo hay un arroba y si no es que hay más
		}else if (email.indexOf("@") !=email.lastIndexOf("@")) {
			mensajeError +="El email no puede tener más de un arroba";
		}else {
			//Después de la @ tiene que haber al menos un punto
			String dominio = email.substring(email.indexOf("@")+1); //+1 porque no queremos incluir el arroba
			if (dominio.indexOf(".") ==-1) {
				mensajeError += "Después del @ debe haber al menos un punto";
			}else {
			
				int diferencia = dominio.length() - dominio.lastIndexOf(".");
				if ( diferencia<2 || diferencia > 6) {
					mensajeError += "Después del último punto solo puede haber"
							+ "entre 2 y 6 carecteres";//+ porque se va a otra línea :v da igual 
				}
			}
		}
			
		//El email no puede tener espacios en blanco
		if (email.contains(" ")) {
			mensajeError += "El email tiene espacios en blanco";
		}
		
		
		//Compruebo si ha habido errores
		if (mensajeError.equals("")) {
			System.out.println("El email "+ email + " es correcto");
		}
	}

}
// no pongo el else para que se acumule los errores
//El += era algo de que vaya sumando los errores
