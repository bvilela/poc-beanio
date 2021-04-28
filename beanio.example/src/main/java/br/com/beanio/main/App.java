package br.com.beanio.main;

import java.nio.file.Paths;

import br.com.beanio.utils.Utils;
import br.com.beanio.utils.ZipFileUtils;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Inicio...");
		
		gerarArquivos();
		lerArquivos();
		
		System.out.println("Fim");
	}

	private static void gerarArquivos() throws Exception {
		FileWriter fileWriter = new FileWriter();
				
		System.out.println("Escrevendo Arquivos de Exemplo...");
		fileWriter.writerCSVExample1();
		fileWriter.writerCSVExample2();
		fileWriter.writerDelimitedLengthExample1();
		fileWriter.writerXMLExample1();
		fileWriter.writerXMLExample2();
		
		ZipFileUtils zip = new ZipFileUtils();
		String currentPath = Paths.get("").toAbsolutePath().toString();
		zip.ziparArquivo(currentPath, Utils.NAME_ARQ_CSV_CARROS, ".csv");
		zip.ziparArquivo(currentPath, Utils.NAME_ARQ_CSV_CIDADES, ".csv");
		zip.ziparArquivo(currentPath, Utils.NAME_ARQ_TXT_TIMES, ".txt");
		zip.ziparArquivo(currentPath, Utils.NAME_ARQ_XML_ANIMAIS, ".xml");
		zip.ziparArquivo(currentPath, Utils.NAME_ARQ_XML_NOTA_FISCAL, ".xml");
		//zip.deleteZipFile(currentPath, "Exemplo_ARQ_CSV_Carros.ZIP");
	}
	
	private static void lerArquivos() throws Exception {
		FileReader fileReader = new FileReader();
		
		System.out.println("Lendo Arquivos de Exemplo...");
		fileReader.readerCSVExample1();
		fileReader.readerCSVExample2();
		fileReader.readerDelimitedLengthExample1();
		fileReader.readerXMLExample1();
		fileReader.readerXMLExample2();
	}

}
