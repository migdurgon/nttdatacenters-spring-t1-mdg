/**
 * 
 */
package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Edificio;
import com.nttdata.spring.repository.Person;

/**
 * @author DURAN
 *
 */
@Service
public class SpringServiceImpl implements SpringServiceI {
	
	@Autowired
	private SpringServiceI springRepostory;

	/**
	 * Búsqueda por atributo nombre y apellidos.
	 * 
	 * @param name
	 * @param apellidos
	 * @return Edificio
	 */
	@Override
	public Edificio findByNombreAndApellidos(final String name, String apellidos) {
		return springRepostory.findByNombreAndApellidos(name, apellidos);
	}
	/**
	 * Búsqueda por atributo nombre y apellidos.
	 * 
	 * @param edificio
	 * @return List<Person>
	 */
	@Override
	public List<Person> findByEdificio(Edificio edificio) {
		return springRepostory.findByEdificio(edificio);
	}
	
}
