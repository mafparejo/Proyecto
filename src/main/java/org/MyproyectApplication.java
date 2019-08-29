package com.example.myproyect;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyproyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproyectApplication.class, args);
		Alerta r = new Alerta();
		r.comprobar(1, "micadena", false);
	}

}
