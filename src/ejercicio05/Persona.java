package ejercicio05;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s %s, Edad: %s%n", nombre, apellido, edad);
	}
	
	

}
