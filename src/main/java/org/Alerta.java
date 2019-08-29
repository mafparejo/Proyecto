package com.example.myproyect;

public class Alerta {

	public void comprobar(Integer numero, String cadena, Boolean dato){
		if (numero == 1 && cadena == "micadena" && dato){
			System.out.println("alerta...el numero es 1 y la cadena: "+cadena+ " siendo dato = "+dato);
		} else System.out.println("no salta la alerta");
	}
}
