package com.gm.mundopc;

public class computadora {

	private int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;

	private computadora() {

	}

	public computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	

	//getter nombre
	public String Getnombre() {
		return nombre;
	}

	//setter nombre
	public void Setnombre(String nombre) {
		this.nombre = nombre;
	}

	//getter idComputadora
	public int GETidComputadora() {
		return idComputadora;
	}

	//setter idComputadora
	public void SETidComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
	}

	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("computadora{");
		sb.append("idComputadora=").append(idComputadora);
		sb.append(", nombre=").append(nombre);
		sb.append(", monitor=").append(monitor);
		sb.append(", teclado=").append(teclado);
		sb.append(", raton=").append(raton);
		sb.append('}');
		return sb.toString();
	}

}
