package org;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Metodos{

	private String nombre;
	private String apellido;
	private String dire;
	private List lista;
	
	public String getFrase(String n) {
		return n;
	}
	
	public int getNumero(int n) {
		return n;
	}
	
	public String getNombre() {
		return "Miguel Angel";
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDire() {
		return dire;
	}
	public void setDire(String dire) {
		this.dire = dire;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List recuperar() {
		lista = new ArrayList();
		lista.add("Primero");
		lista.add("Segundo");
		return lista;
	}

	public int numero() {
		// TODO Auto-generated method stub
		return 12;
	}
	
}
