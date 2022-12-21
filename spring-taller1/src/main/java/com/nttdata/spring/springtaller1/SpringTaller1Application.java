package com.nttdata.spring.springtaller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Edificio;
import com.nttdata.spring.repository.Person;
import com.nttdata.spring.services.SpringServiceI;

@SpringBootApplication
public class SpringTaller1Application implements CommandLineRunner {

	@Autowired
	private SpringServiceI springService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTaller1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		final Edificio edificio = new Edificio();
		edificio.setPlantas(4);
		edificio.setApartamentos(7);
		
		final Person person = new Person();
		person.setNombre("Miguel");
		person.setApellidos("Duran Gonzalez");
		person.setEdificio(edificio);
		
		System.out.println(springService.findByEdificio(edificio));
		System.out.println(springService.findByNombreAndApellidos(person.getNombre(), person.getApellidos()));
		
	}

}
