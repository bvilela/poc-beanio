package br.com.beanio.main;

import java.util.List;

import org.beanio.StreamFactory;

import br.com.beanio.dao.CarroDAO;
import br.com.beanio.model.Carro;
import br.com.beanio.model.Cidade;
import br.com.beanio.utils.BeanIOWriterUtils;
import br.com.beanio.utils.Utils;

public class FileWriter {
	
	public void writerCSVExample1() {
		System.out.println("CSV Example 1...");
		
		List<Carro> carros = new CarroDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryCSV(Carro.class);
		BeanIOWriterUtils.writer(carros, streamFactory, Utils.NAME_ARQ_CSV_CARROS);
	}

	public void writerCSVExample2() {
		System.out.println("CSV Example 2...");
		
		List<Cidade> cidades = new CidadeDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryCSV(Cidade.class);
		BeanIOWriterUtils.writer(cidades, streamFactory, Utils.NAME_ARQ_CSV_CIDADES);
	}
}
