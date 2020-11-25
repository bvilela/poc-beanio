package br.com.beanio.main;

import org.beanio.StreamFactory;

import br.com.beanio.model.Carro;
import br.com.beanio.utils.BeanIOReaderUtils;

public class FileReader {

	public void readerCSVExample() {
		System.out.println("CSV...");
		
		StreamFactory streamFactory = BeanIOReaderUtils.getStreamFactoryCSV(Carro.class);
		
		//BeanIOWriterUtils.writer(carros, streamFactory, Paths.get(App.DIR_OUTPUT, Utils.NAME_ARQ_CSV).toString());
	}
}
