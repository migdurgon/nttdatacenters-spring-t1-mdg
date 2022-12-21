/**
 * 
 */
package com.nttdata.spring.repository;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author DURAN
 *
 */
@Entity
@Table(name="T_EDIFICIO")
public class Edificio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long edificioId;
	private Integer plantas;
	private Integer apartamentos;
	private List<Person> persons;
	
	/**
	 * @param edificioId
	 * @param plantas
	 * @param apartamentos
	 * @param persons
	 */
	public Edificio(Long edificioId, Integer plantas, Integer apartamentos, List<Person> persons) {
		super();
		this.edificioId = edificioId;
		this.plantas = plantas;
		this.apartamentos = apartamentos;
		this.persons = persons;
	}
	public Edificio() {
	}
	/**
	 * @return the edificioId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_EDIFICIO_ID")
	public Long getEdificioId() {
		return edificioId;
	}
	/**
	 * @param edificioId the edificioId to set
	 */
	public void setEdificioId(Long edificioId) {
		this.edificioId = edificioId;
	}
	/**
	 * @return the plantas
	 */
	@Column(name = "C_PLANTAS")
	public Integer getPlantas() {
		return plantas;
	}
	/**
	 * @param plantas the plantas to set
	 */
	public void setPlantas(Integer plantas) {
		this.plantas = plantas;
	}
	/**
	 * @return the apartamentos
	 */
	@Column(name = "C_APARTAMENTOS")
	public Integer getApartamentos() {
		return apartamentos;
	}
	/**
	 * @param apartamentos the apartamentos to set
	 */
	public void setApartamentos(Integer apartamentos) {
		this.apartamentos = apartamentos;
	}
	/**
	 * @return the persons
	 */
	@OneToMany(mappedBy = "edificio")
	public List<Person> getPersons() {
		return persons;
	}
	/**
	 * @param persons the persons to set
	 */
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
}
