package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

	private int idRaton;
	private int contadorRatones;

	//metodos
	public Raton(int idRaton, int contadorRatones) {
		this.idRaton = idRaton;
		this.contadorRatones = contadorRatones;
	}

	@Override
	public String toString() {
		return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
	}

}
