package br.com.beanio.main;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Inicio...");
		
		FileWriter fileWriter = new FileWriter();
		FileReader fileReader = new FileReader();
		
		System.out.println("Escrevendo Arquivos de Exemplo...");
		fileWriter.writerCSVExample1();
		fileWriter.writerCSVExample2();
		
		
		System.out.println("Lendo Arquivos de Exemplo...");
		fileReader.readerCSVExample1();
		fileReader.readerCSVExample2();
		
		System.out.println("Fim");
	}

}
