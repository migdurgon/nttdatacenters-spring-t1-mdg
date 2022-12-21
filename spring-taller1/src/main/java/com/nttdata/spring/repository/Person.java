/**
 * 
 */
package com.nttdata.spring.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author DURAN
 *
 */
@Entity
@Table(name="T_PERSON")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long personId;
	private String nombre;
	private String apellidos;
	private Edificio edificio;
	
	
	/**
	 * @param personId
	 * @param nombre
	 * @param apellidos
	 * @param edificio
	 */
	public Person(Long personId, String nombre, String apellidos, Edificio edificio) {
		super();
		this.personId = personId;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edificio = edificio;
	}
	public Person() {
	
	}
	/**
	 * @return the personId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_PERSON_ID")
	public Long getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	/**
	 * @return the nombre
	 */
	@Column(name = "C_NAME")
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	@Column(name = "C_APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the edificio
	 */
	@ManyToOne
	@JoinColumn(name = "C_FK_EDIFICIO_ID")
	public Edificio getEdificio() {
		return edificio;
	}
	/**
	 * @param edificio the edificio to set
	 */
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	
	
}
