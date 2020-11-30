package br.com.beanio.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Record
public class Time {

	@Field(ordinal = 1, length = 5, maxLength = 5,   align = Align.RIGHT, padding='0', required = true)
	private int id;
	
	@Field(ordinal = 2, length = 10, maxLength = 10, align = Align.LEFT, padding = ' ', required = true)
	private String nome;
	
	@Field(ordinal = 3, length = 10, maxLength = 10, align = Align.LEFT, padding = '*', required = true)
	private String pais;
	
	@Override
	public String toString() {
		return "Time [id: " + id + ", nome: " + nome + ", pais: " + pais + "]";
	}
	
	public Time() {}
	
	public Time(int id, String nome, String pais) {
		this.id = id;
		this.nome = nome;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
