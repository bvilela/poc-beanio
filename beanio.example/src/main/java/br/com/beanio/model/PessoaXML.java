package br.com.beanio.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record(name = "Pessoa")
public class PessoaXML {
	
	@Field(required = true)
	private int id;
	
	@Field(required = true)
	private String nome;
	
	@Field(required = true)
	private int idade;
	
	@Override
	public String toString() {
		return nome;
	}
	
	public PessoaXML() {}
	
	public PessoaXML(int id, String nome, int idade) {
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
