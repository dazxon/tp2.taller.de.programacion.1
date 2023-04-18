package ejercicio05;

import java.util.ArrayList;

public class Edificio {
	
	private ArrayList<Vivienda> viviendas;

	public Edificio() {
		super();
		this.viviendas = new ArrayList<>();
	}
	
	public void addVivienda(Vivienda vivienda) {
		this.viviendas.add(vivienda);
	}
	
	public void realizarMudanza(String pisoOri,String deptoOri,String pisoDest,String deptoDest) {
		
		Vivienda vivOrigen = buscarVivienda(pisoOri, deptoOri);
		Vivienda vivDestino = buscarVivienda(pisoDest, deptoDest);
		
		if(vivOrigen == null) {
			
			System.out.printf("'%s' '%s' no corresponde a una vivienda", pisoOri, deptoOri);
			
		}else if (vivDestino == null) {
			vivDestino = new Vivienda(vivOrigen.getDireccion().getCalle(), vivOrigen.getDireccion().getAltura(), pisoDest, deptoDest);
			addVivienda(vivDestino);
			hacerMudanza(vivOrigen, vivDestino);
		}else {
			hacerMudanza(vivOrigen, vivDestino);
		}
		
	}
	
	private void hacerMudanza(Vivienda vivOri, Vivienda vivDest) {
		
		vivDest.cambiarMuebles(vivOri.getMuebles());
		vivDest.cambiarPersonas(vivOri.getPersonas());
		vivOri.limpiezaMyP(vivDest.getDireccion());
		
	}

	private Vivienda buscarVivienda(String piso, String depto) {
		
		int pos = 0;
		int size = this.viviendas.size();
		Vivienda vivBuscada = null;
		
		while (pos < size && vivBuscada == null) {
			
			Vivienda vivAux = this.viviendas.get(pos);
			
			if (vivAux.getDireccion().getPiso().toLowerCase() == piso.toLowerCase() && vivAux.getDireccion().getDepto().toLowerCase() == depto.toLowerCase()) {
				
				vivBuscada = vivAux;
				
			}else {
				pos++;
			}
			
		}
		
		return vivBuscada;
	}
	
	public void mostrarTodo() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format("%s", viviendas);
	}
	
	

}
