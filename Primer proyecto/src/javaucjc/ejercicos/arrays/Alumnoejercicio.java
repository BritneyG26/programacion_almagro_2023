package javaucjc.ejercicos.arrays;

public class Alumnoejercicio {
	private String nombre;
	private String apellidos;
	private Asignatura []asignaturas;
	public Alumnoejercicio(String nombre, String apellidos, Asignatura[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
	}
	public Alumnoejercicio(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
	

}
