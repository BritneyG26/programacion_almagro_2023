package poo;

public class Alumno {
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private double notaMedia;
	
	//Constructor 
	public Alumno (String nombre, String apellidos, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}
	
	public Alumno (String nombre, String apelidos) {
		this.nombre =nombre;
		this.apellidos = apellidos;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	//Getter y setter
	public String getNombre() {
		return this.nombre;
	}
	
	//Métodos o función 
	
	public void estudiar() {
		System.out.println("El alumno " + nombre + " está estudiando");
	}

}
