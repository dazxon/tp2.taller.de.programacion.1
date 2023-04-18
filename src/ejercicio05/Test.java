package ejercicio05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edificio edificio = new Edificio();
		
		Vivienda viv1 = new Vivienda("montanieses", "1234", "4", "c");
		Vivienda viv2 = new Vivienda("Montanieses", "1234", "2", "b");
		
		viv1.agregarPersona("arturo", "roman", 53);
		viv1.agregarPersona("monica", "gaztambide", 35);
		
		viv1.agregarMueble("mesa", "madera", "marron");
		viv1.agregarMueble("mesada", "marmol", "rojo");
		viv1.agregarMueble("perchero", "metal", "negro");
		viv1.agregarMueble("sillon", "cuero", "azul");
		
		edificio.addVivienda(viv1);
		edificio.addVivienda(viv2);
		
		
		edificio.realizarMudanza("4", "c", "2", "b");
		
		edificio.mostrarTodo();
	}

}
