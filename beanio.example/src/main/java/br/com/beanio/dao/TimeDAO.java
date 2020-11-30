package br.com.beanio.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.beanio.model.Time;

public class TimeDAO {

	public List<Time> getListaMock(){
		List<Time> lista = new ArrayList<>();
		lista.add(new Time(1, "Santos Futebol Clube", "Brasil"));
		lista.add(new Time(2, "Liverpool Football Club", "Inglaterra"));
		lista.add(new Time(3, "Barcelona", "Espanha"));
		lista.add(new Time(4, "Napoli", "Italia"));
		lista.add(new Time(5, "Ajax", "Holanda"));
		return lista;
	}
}
