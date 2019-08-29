package com.example.myproyect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Alerta {

	public void comprobar(Integer numero, String cadena, Boolean dato){
		if (numero == 1 && cadena == "micadena" && dato){
			System.out.println("alerta...el numero es 1 y la cadena: "+cadena+ " siendo dato = "+dato);
		} else System.out.println("no salta la alerta");
	}
	
	public HashMap<Integer, String> recuperar(){
		 HashMap<Integer, String> recupero = new HashMap<Integer, String>();
		 recupero.put(1, "Mivalor");
		 if (recupero.containsValue("Mivalor")){
			 System.out.println("recupero: "+recupero.replace(1, "Mivalor", "Mivalor2")+ " valor= "+recupero.get(1));	 
		 }
		 
		 return recupero;
	}
	
	public List<String> listar(boolean comp){
		List<String> lista = new ArrayList<String>();
		lista.add("primero");
		lista.add("primero1");
		lista.add("primero2");
		lista.add("primero3");
		if(comp){
			for(String elemento : lista){
				System.out.println("elemento: "+elemento);
			}
		} else System.out.println("el parametro es false, no listamos");
		return lista;
	}
}
