package ejercicio05;

public class Mueble {

	private String nombre;
	private String material;
	private String color;
	
	
	public Mueble(String nombre, String material, String color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}


	@Override
	public String toString() {
		return String.format("%s de %s color %s%n", nombre.substring(0,1).toUpperCase() + nombre.substring(1), material.substring(0,1).toUpperCase() + material.substring(1), color.substring(0,1).toUpperCase() + color.substring(1));
	}
	
	
}
