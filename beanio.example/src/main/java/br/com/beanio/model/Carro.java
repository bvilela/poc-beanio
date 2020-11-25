package br.com.beanio.model;

import java.util.Date;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record
public class Carro {

	@Field(at = 0, required = true)
	private int id;
	
	@Field(at = 1, required = true)
	private String marca;
	
	@Field(at = 2, required = true)
	private String modelo;
	
	@Field(at = 3, required = true)
	private String cor;
	
	@Field(at = 4, required = true, format = "yyyy-MM-dd")
	private Date dataFabricacao;
	
	@Field(at = 5, required = false)
	private String observacao;
	
	public Carro() {}
	
	public Carro(int id, String marca, String modelo, String cor, Date dataFabri, String obs) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.dataFabricacao = dataFabri;
		this.observacao = obs;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
}
