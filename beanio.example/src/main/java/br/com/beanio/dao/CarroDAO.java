package br.com.beanio.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.beanio.model.Carro;
import br.com.beanio.utils.Utils;

public class CarroDAO {

	public List<Carro> getListaMock(){
		List<Carro> lista = new ArrayList<>();
		lista.add(new Carro(1, "Fiat", "Uno", "Cinza", Utils.getDate(2010,10,10), "Obsercao 1"));
		lista.add(new Carro(2, "Chevrolet", "Onix", "Branco", Utils.getDate(2012,10,12), "Obsercao 2"));
		lista.add(new Carro(3, "Honda", "Civic", "Preto", Utils.getDate(2014,10,14), null));
		lista.add(new Carro(4, "VW", "Fusca", "Azul", Utils.getDate(2016,10,16), null));
		lista.add(new Carro(5, "VW", "Brasilia", "Amarela", new Date(), "Obsercao 3"));
		return lista;
	}
}
