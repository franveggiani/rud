package com.divisiongis.rud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.divisiongis.rud", "com.divisiongis.rud.Repository.catastro", "com.divisiongis.rud.Repository.gestion_direcciones" ,"com.divisiongis.rud.Repository.padrones_direcciones"})
public class RudApplication {

	public static void main(String[] args) {

		SpringApplication.run(RudApplication.class, args);

		System.out.println("APLICACION CORRIENDO");

	}

}
