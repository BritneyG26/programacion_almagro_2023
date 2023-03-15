package ejercicio.maniqui;

public class Boton {
	private String color;
	private String forma;
	private int tamanio;
	
	public Boton(String color, String forma) {
		super();
		this.color = color;
		this.forma = forma;
		
	}

	public Boton(String color, String forma, int tamanio) {
		super();
		this.color = color;
		this.forma = forma;
		this.tamanio = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public int getTamaniio() {
		return tamanio;
	}

	public void setTamaniio(int tamaniio) {
		this.tamanio = tamaniio;
	}
	

}
