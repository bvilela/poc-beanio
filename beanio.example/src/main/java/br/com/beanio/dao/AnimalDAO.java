package br.com.beanio.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.beanio.model.Animal;

public class AnimalDAO {
	
	public List<Animal> getListaMock(){
		List<Animal> lista = new ArrayList<>();
		lista.add(new Animal(1, "Gato", false));
		lista.add(new Animal(2, "Cachorro", false));
		lista.add(new Animal(3, "Urso", false));
		lista.add(new Animal(4, "Elefante", false));
		lista.add(new Animal(5, "Tigre", false));
		lista.add(new Animal(6, "Mamute", true));
		return lista;
	}
}
