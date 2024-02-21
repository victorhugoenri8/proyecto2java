package com.gm.mundopc;

public class Monitor {

	private int idMonitor;
	private String marca;
	private double tamano;
	private int contadosMonitores;

	//metodos
	private Monitor(){
	}

	public Monitor(int idMonitor, String marca, double tamano, int contadosMonitores) {
		this();
		this.idMonitor = idMonitor;
		this.marca = marca;
		this.tamano = tamano;
		this.contadosMonitores = contadosMonitores;
	}

	

	public int getIdMonitor() {
		return idMonitor;
	}

	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public int getContadosMonitores() {
		return contadosMonitores;
	}

	public void setContadosMonitores(int contadosMonitores) {
		this.contadosMonitores = contadosMonitores;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Monitor{");
		sb.append("idMonitor=").append(idMonitor);
		sb.append(", marca=").append(marca);
		sb.append(", tamano=").append(tamano);
		sb.append(", contadosMonitores=").append(contadosMonitores);
		sb.append('}');
		return sb.toString();
	}

}
