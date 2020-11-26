package br.com.beanio.model;

import java.util.List;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.annotation.Segment;

@Record
public class Cidade {

	@Field(at = 0, required = true)
	private String nome;
	
	@Field(at = 1, required = true)
	private String uf;
	
	@Field(at = 2, required = true)
	private String tamanho;
	
	@Segment(at = 3, collection = List.class, minOccurs = 0, maxOccurs = -1) //-1 is unbounded
	private List<Pessoa> moradores;
	
	public Cidade() {}
	
	public Cidade(String nome, String uf, String tamanho, List<Pessoa> moradores) {
		this.nome = nome;
		this.uf = uf;
		this.tamanho = tamanho;
		this.moradores = moradores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public List<Pessoa> getMoradores() {
		return moradores;
	}

	public void setMoradores(List<Pessoa> moradores) {
		this.moradores = moradores;
	}
}
