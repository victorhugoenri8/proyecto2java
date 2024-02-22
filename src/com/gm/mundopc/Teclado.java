package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

	private final int idTeclado;
	private static int contadorTeclados;

	//metodos
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++Teclado.contadorTeclados;
	}

//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("Teclado{");
//		sb.append("idTeclado=").append(idTeclado);
//		sb.append(", contadorTeclados=").append(contadorTeclados);
//		sb.append('}');
//		return sb.toString();
//	}

	@Override
	public String toString() {
		return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';
	}
	
	

}
