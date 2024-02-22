package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

	private final int idRaton;
	private static int contadorRatones;
	
	public Raton (String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++Raton.contadorRatones;
	}

	//metodos
//	public Raton(int idRaton, int contadorRatones) {
//		this.idRaton = idRaton;
//		this.contadorRatones = contadorRatones;
//	}

//	@Override
//	public String toString() {
//		return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
//	}

	@Override
	public String toString() {
		return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';
	}

	
	
}
