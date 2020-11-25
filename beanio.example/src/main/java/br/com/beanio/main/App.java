package br.com.beanio.main;

public class App {
	public static final String DIR_INPUT = "C:/GIT_BRUNO/beanio-example/input";
	public static final String DIR_OUTPUT = "C:/GIT_BRUNO/beanio-example/output";

	public static void main(String[] args) {
		System.out.println("Inicio...");
		
		FileWriter fileWriter = new FileWriter();
		FileReader fileReader = new FileReader();
		
		System.out.println("Escrevendo Arquivos de Exemplo...");
		fileWriter.writerCSVExample();
		
		
		System.out.println("Lendo Arquivos de Exemplo...");
		fileReader.readerCSVExample();
		
		System.out.println("Fim");
	}

}
