package br.com.beanio.main;

import java.nio.file.Paths;
import java.util.List;

import org.beanio.StreamFactory;

import br.com.beanio.dao.CarroDAO;
import br.com.beanio.model.Carro;
import br.com.beanio.utils.BeanIOWriterUtils;
import br.com.beanio.utils.Utils;

public class FileWriter {
	
	public void writerCSVExample() {
		System.out.println("CSV...");
		
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryCSV(Carro.class);
		List<Carro> carros = new CarroDAO().getListaMock();
		
		BeanIOWriterUtils.writer(carros, streamFactory, Paths.get(App.DIR_OUTPUT, Utils.NAME_ARQ_CSV).toString());
	}
	
}
