package br.com.beanio.model;

import java.util.Date;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;
import org.beanio.builder.XmlType;

@Record(name = "animal")
public class Animal {
	
	@Field(format="yyyy-MM-dd", xmlType = XmlType.ATTRIBUTE)
	private Date dataCriacao;

	@Field(xmlName = "AnimalCodigo", xmlType = XmlType.ELEMENT, length = 5, maxLength = 5, align = Align.RIGHT, padding = '0', required = true)
	private int codigo;
	
	@Field(xmlNamespace = "AnimalNameSpace", length = 10, maxLength = 10, align = Align.LEFT, padding = '*', required = true)
	private String nome;
	
	@Field(required = true, handlerName = "CTHExtinto" )
	private boolean extinto;
	
	@Override
	public String toString() {
		return "Animal [codigo: " + codigo + ", nome: " + nome + ", extinto: " + extinto + "]";
	}
	
	public Animal() {}
	
	public Animal(int codigo, String nome, boolean extinto) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataCriacao = new Date();
		this.extinto = extinto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
