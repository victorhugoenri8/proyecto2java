
package com.gm.mundopc;


public class Orden {
	
	private int idOrden;
	private final computadora Computadoras [];
	private int contadorOrdenes;
	private int contadorComputadoras;
	private final int maxComputadoras;
	
	
	public Orden (int maxComputadoras) {
		this.idOrden++;
		this.maxComputadoras = maxComputadoras;
		this.Computadoras = new computadora [this.maxComputadoras];
	}
	
	public void agregarComputadora (computadora Computadoras) {
		this.Computadoras [contadorComputadoras++] = Computadoras;
		this.contadorOrdenes++;
	}
	
	public void mostrarOrder() {
		System.out.println(this.idOrden);
		
		for (int i = 0; i < this.contadorOrdenes; i++) {
			System.out.println(this.Computadoras[i].toString());
		}
	}
	
}
