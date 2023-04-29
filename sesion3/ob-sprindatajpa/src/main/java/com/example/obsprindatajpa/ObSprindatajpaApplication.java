package com.example.obsprindatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSprindatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSprindatajpaApplication.class, args);

		CocheRespository respository = context.getBean(CocheRespository.class);

		System.out.println("El numero de coches en base de datos es: " + respository.count());

		// crear y almacenar un coche en base de datos

		Coche renault = new Coche(null, "Renault", "Sandero", 2015);
		respository.save(renault);

		System.out.println("El numero de coches en base de datos es: " + respository.count());

		// recuperar todos
		System.out.println(respository.findAll());
	}

}
