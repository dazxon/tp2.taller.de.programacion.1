package ejercicio05;

public class Direccion {

	private String calle;
	private String altura;
	private String piso;
	private String depto;
	
	public Direccion(String calle, String altura, String piso, String depto) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.depto = depto;
	}
	
	
	public String getCalle() {
		return calle;
	}


	public String getAltura() {
		return altura;
	}


	public String getPiso() {
		return piso;
	}

	public String getDepto() {
		return depto;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s '%s'", calle, altura, piso, depto).toUpperCase();
	}

	
	
}
