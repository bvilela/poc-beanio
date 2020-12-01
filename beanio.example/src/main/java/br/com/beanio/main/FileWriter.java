package br.com.beanio.main;

import java.util.List;

import org.beanio.StreamFactory;

import br.com.beanio.dao.AnimalDAO;
import br.com.beanio.dao.CarroDAO;
import br.com.beanio.dao.CidadeDAO;
import br.com.beanio.dao.NotaFiscalDAO;
import br.com.beanio.dao.TimeDAO;
import br.com.beanio.model.Animal;
import br.com.beanio.model.Carro;
import br.com.beanio.model.Cidade;
import br.com.beanio.model.NotaFiscal;
import br.com.beanio.model.Time;
import br.com.beanio.utils.BeanIOWriterUtils;
import br.com.beanio.utils.Utils;

public class FileWriter {
	
	public void writerCSVExample1() {
		System.out.println("");
		System.out.println("");
		System.out.println("CSV Example 1...");
		
		List<Carro> carros = new CarroDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryCSV(Carro.class);
		BeanIOWriterUtils.writer(carros, streamFactory, Utils.NAME_ARQ_CSV_CARROS);
	}

	public void writerCSVExample2() {
		System.out.println("");
		System.out.println("");
		System.out.println("CSV Example 2...");
		
		List<Cidade> cidades = new CidadeDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryCSV(Cidade.class);
		BeanIOWriterUtils.writer(cidades, streamFactory, Utils.NAME_ARQ_CSV_CIDADES);
	}
	
	public void writerDelimitedLengthExample1() {
		System.out.println("");
		System.out.println("");
		System.out.println("DelimitedLength Example 1...");
		
		List<Time> times = new TimeDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryTamanhoFixo(Time.class);
		BeanIOWriterUtils.writer(times, streamFactory, Utils.NAME_ARQ_TXT_TIMES);
	}

	public void writerXMLExample1() {
		System.out.println("");
		System.out.println("");
		System.out.println("XML Example 1...");
		
		List<Animal> animais = new AnimalDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryXML(Animal.class);
		BeanIOWriterUtils.writer(animais, streamFactory, Utils.NAME_ARQ_XML_ANIMAIS);
	}

	public void writerXMLExample2() {
		System.out.println("");
		System.out.println("");
		System.out.println("XML Example 2...");
		
		List<NotaFiscal> notaFiscal = new NotaFiscalDAO().getListaMock();
		StreamFactory streamFactory = BeanIOWriterUtils.getStreamFactoryXML(NotaFiscal.class);
		BeanIOWriterUtils.writer(notaFiscal, streamFactory, Utils.NAME_ARQ_XML_NOTA_FISCAL);
	}
}
