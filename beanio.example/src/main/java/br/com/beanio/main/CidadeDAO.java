package br.com.beanio.main;

import java.util.ArrayList;
import java.util.List;

import br.com.beanio.model.Cidade;
import br.com.beanio.model.Pessoa;

public class CidadeDAO {

	public List<Cidade> getListaMock() {
		List<Cidade> lista = new ArrayList<>();
		
		List<Pessoa> moradores1 = new ArrayList<>();
		moradores1.add(new Pessoa(1, "Joao", 44));
		moradores1.add(new Pessoa(2, "Maria", 39));
		moradores1.add(new Pessoa(3, "Jose", 51));
		Cidade cid1 = new Cidade("Taquaritinga", "SP", "Pequena", moradores1);
		
		List<Pessoa> moradores2 = new ArrayList<>();
		moradores2.add(new Pessoa(1, "Paulo", 31));
		moradores2.add(new Pessoa(2, "Cesar", 28));
		moradores2.add(new Pessoa(3, "Bruno", 23));
		moradores2.add(new Pessoa(4, "Andre", 22));
		moradores2.add(new Pessoa(5, "Lucas", 18));
		Cidade cid2 = new Cidade("Matao", "SP", "Media", moradores2);
		
		lista.add(cid1);
		lista.add(cid2);
		return lista;
	}

}
