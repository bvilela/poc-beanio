package br.com.beanio.model;

import java.util.Date;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.annotation.Segment;

@Record(name = "NotaFiscal")
public class NotaFiscal {
	
	@Segment
	private PessoaXML pessoa;
	
	@Segment
	private ProdutosXMLWrapper produtos;
	
	@Field(format = "yyyy-MM-dd")
	private Date dataCompra;
	
	public NotaFiscal() {}
	
	public NotaFiscal(PessoaXML pessoa, ProdutosXMLWrapper produtos) {
		this.pessoa = pessoa;
		this.produtos = produtos;
		this.dataCompra = new Date();
	}

	public PessoaXML getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaXML pessoa) {
		this.pessoa = pessoa;
	}

	public ProdutosXMLWrapper getProdutos() {
		return produtos;
	}

	public void setProdutos(ProdutosXMLWrapper produtos) {
		this.produtos = produtos;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
}
