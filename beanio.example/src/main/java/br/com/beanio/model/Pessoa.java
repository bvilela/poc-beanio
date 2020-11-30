package br.com.beanio.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record
public class Pessoa {
	
	@Field(at = 0, required = true)
	private int id;
	
	@Field(at = 1, required = true)
	private String nome;
	
	@Field(at = 2, required = true)
	private int idade;
	
	@Override
	public String toString() {
//		return "Pessoa [id: " + id + ", nome: " + nome + ", idade: " + idade + "]";
		return nome;
	}
	
	public Pessoa() {}
	
	public Pessoa(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
