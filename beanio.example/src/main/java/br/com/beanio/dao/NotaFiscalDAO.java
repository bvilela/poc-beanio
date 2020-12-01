package br.com.beanio.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.beanio.model.NotaFiscal;
import br.com.beanio.model.PessoaXML;
import br.com.beanio.model.Produto;
import br.com.beanio.model.ProdutosXMLWrapper;

public class NotaFiscalDAO {

	public List<NotaFiscal> getListaMock(){
		List<NotaFiscal> lista = new ArrayList<>();
		
		PessoaXML p1 = new PessoaXML(1, "Jose", 45);
		Produto prod1 = new Produto(1, "Mouse", 50);
		Produto prod2 = new Produto(2, "Teclado", 120);
		List<Produto> listProds1 = Arrays.asList(prod1, prod2);
		ProdutosXMLWrapper wrapper1 = new ProdutosXMLWrapper(listProds1);
		NotaFiscal nf1 = new NotaFiscal(p1, wrapper1);
		
		PessoaXML p2 = new PessoaXML(2, "Vitor", 25);
		Produto prod3 = new Produto(1, "Caixa de Som", 150);
		Produto prod4 = new Produto(2, "Monitor", 800.90);
		Produto prod5 = new Produto(3, "Suporte Notebook", 45.5);
		List<Produto> listProds2 = Arrays.asList(prod3, prod4, prod5);
		ProdutosXMLWrapper wrapper2 = new ProdutosXMLWrapper(listProds2);
		NotaFiscal nf2 = new NotaFiscal(p2, wrapper2);
		
		lista.add(nf1);
		lista.add(nf2);
		return lista;
	}
}
