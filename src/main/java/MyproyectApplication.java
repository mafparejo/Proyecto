package com.example.myproyect;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyproyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproyectApplication.class, args);
		Alerta a = new Alerta();
		a.comprobar(1, "micadena", true);
		a.recuperar();
		a.listar(true);
	}

}
