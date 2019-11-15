package br.edu.unibratec.livrariadigital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Integer id;
	private String titulo;
	private String editora;
	private Integer ano;
	@ManyToOne
	private Tipo tipo;

	public Produto(String titulo, String editora, Integer ano, Tipo tipo) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.ano = ano;
		this.tipo = tipo;
	}

	public Produto() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}