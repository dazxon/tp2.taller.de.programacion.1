package ejercicio05;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	private static int id = 0;
	private int numeroVivienda;
	private String mensajeMudanza = "";
	
	
	public Vivienda(String calle, String altura, String piso, String depto) {
		
		this.direccion = new Direccion(calle, altura, piso, depto);
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
		id++;
		this.numeroVivienda = id;
		
	}
	
	public void cambiarMuebles(ArrayList<Mueble> muebles) {
		
		this.muebles.clear();
		this.muebles.addAll(muebles);
		
	}
	
	public void cambiarPersonas(ArrayList<Persona> personas) {
		
		this.personas.clear();
		this.personas.addAll(personas);
		this.mensajeMudanza = "";
		
	}
	
	public void agregarMueble(String nombre, String material, String color ) {
		this.muebles.add(new Mueble(nombre, material, color));
	}
	
	public void agregarPersona(String nombre, String apellido, int edad) {
		this.personas.add(new Persona(nombre, apellido, edad));
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	public void limpiezaMyP(Direccion direccion) {
		this.muebles.clear();
		this.personas.clear();
		this.mensajeMudanza = String.format("se ha realizado mudanza hacia %s %s%n",direccion.getPiso(),direccion.getDepto());
	}
	

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	@Override
	public String toString() {
		return String.format("Vivienda %s:%n"
				+ "Direccion: %s%n"
				+ "Personas: %n"
				+ "%s%n"
				+ "Muebles: %n"
				+ "%s%n"
				+ "%s", numeroVivienda,direccion,personas,muebles,mensajeMudanza.toUpperCase());
	}
	
	
}
