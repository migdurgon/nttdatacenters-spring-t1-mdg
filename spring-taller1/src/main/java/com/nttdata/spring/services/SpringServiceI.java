/**
 * 
 */
package com.nttdata.spring.services;


import com.nttdata.spring.repository.Edificio;
import com.nttdata.spring.repository.Person;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 * @author DURAN
 *
 */
public interface SpringServiceI {
	
	/**
	 * Búsqueda por atributo nombre y apellidos.
	 * 
	 * @param Edificio
	 * @return List<Person>
	 */
	public Edificio findByNombreAndApellidos(final String name, String apellidos);
	
	/**
	 * Búsqueda por atributo nombre y apellidos.
	 * 
	 * @param Edificio
	 * @return List<Person>
	 */
	public List<Person> findByEdificio(final Edificio edificio);

}
