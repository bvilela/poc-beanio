package br.com.beanio.model;

import java.util.List;

import org.beanio.annotation.Record;
import org.beanio.annotation.Segment;
import org.beanio.builder.XmlType;

@Record
public class ProdutosXMLWrapper {
	
	@Segment(xmlName = "produto", minOccurs = 1, maxOccurs = -1, xmlType = XmlType.ELEMENT ) //-1 is unbounded
	List<Produto> produtos;

	public ProdutosXMLWrapper() {}
	
	public ProdutosXMLWrapper(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
