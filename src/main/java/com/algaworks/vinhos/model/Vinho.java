package com.algaworks.vinhos.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Karen 20 de abr de 2018
 */
@Entity
public class Vinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoVinho tipo;

	@NotNull
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tipo
	 */
	public TipoVinho getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(TipoVinho tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vinho other = (Vinho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
