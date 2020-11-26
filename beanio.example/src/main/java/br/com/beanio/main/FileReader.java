package br.com.beanio.main;

import java.io.File;
import java.util.List;

import org.beanio.StreamFactory;

import br.com.beanio.model.Carro;
import br.com.beanio.model.Cidade;
import br.com.beanio.utils.BeanIOReaderUtils;
import br.com.beanio.utils.FileReaderDecode;
import br.com.beanio.utils.Utils;

public class FileReader {

	public void readerCSVExample1() throws Exception {
		System.out.println("CSV Example 1...");
		
		StreamFactory streamFactory = BeanIOReaderUtils.getStreamFactoryCSV(Carro.class);
		File file = new File(Utils.NAME_ARQ_CSV_CARROS);
		List<Carro> carros = new FileReaderDecode<Carro>().getLista(streamFactory, file);
		
		if (carros == null || carros.isEmpty()) {
			System.out.println("Lista Vazia!");
		}
		for (Carro carro : carros) {
			System.out.println(carro.toString());
		}
	}
	
	public void readerCSVExample2() throws Exception {
		System.out.println("CSV Example 2...");
		
		StreamFactory streamFactory = BeanIOReaderUtils.getStreamFactoryCSV(Cidade.class);
		File file = new File(Utils.NAME_ARQ_CSV_CIDADES);
		List<Cidade> cidades = new FileReaderDecode<Cidade>().getLista(streamFactory, file);
		
		if (cidades == null || cidades.isEmpty()) {
			System.out.println("Lista Vazia!");
		}
		for (Cidade cidade: cidades) {
			System.out.println(cidade.toString());
		}
	}
}
