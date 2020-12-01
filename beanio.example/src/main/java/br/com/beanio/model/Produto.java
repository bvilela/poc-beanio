package br.com.beanio.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;
import org.beanio.builder.XmlType;

@Record( xmlName = "produto", xmlType = XmlType.ELEMENT)
public class Produto {
	
	@Field(xmlName = "codProd", xmlType = XmlType.ELEMENT, length = 5, maxLength = 5, align = Align.RIGHT, padding = '0', required = true)
	private int codigo;
	
	@Field(xmlNamespace = "descricaoProd.", length = 20, maxLength = 20, align = Align.LEFT, padding = '.', required = true)
	private String descricao;
	
	@Field(required = true )
	private double valor;
	
	@Override
	public String toString() {
		return "Produto [codigo: " + codigo + ", descricao: " + descricao + ", valor: " + valor + "]";
	}
	
	public Produto() {}
	
	public Produto(int codigo, String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
