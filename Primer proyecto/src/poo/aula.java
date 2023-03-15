package poo;

public class aula {

	public static void main(String[] args) {
		
	Alumno alumno1 = new Alumno("Nombre1","Apellido1", 8.9);
	//alumno1.nombre ="Draco";
	alumno1.setNombre("Lucius");
	alumno1.estudiar();
	System.out.println(alumno1.getNombre());
	
	Alumno alumno2 = new Alumno("Alumno2", "Apellido1");
	alumno2.estudiar();

	}

}
