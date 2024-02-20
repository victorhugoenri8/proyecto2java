package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

	private int idTeclado;
	private int contadorTeclados;

	//metodos
	public Teclado(int idTeclado, int contadorTeclados) {
		this.idTeclado = idTeclado;
		this.contadorTeclados = contadorTeclados;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Teclado{");
		sb.append("idTeclado=").append(idTeclado);
		sb.append(", contadorTeclados=").append(contadorTeclados);
		sb.append('}');
		return sb.toString();
	}

}
