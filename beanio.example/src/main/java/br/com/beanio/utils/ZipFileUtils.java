package br.com.beanio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileUtils {
	
	public void ziparArquivo(String caminho, String nomeArquivo, String extensao) throws Exception {
		System.out.println("Iniciando Processo para Zipar Arquivo...");
		
		ziparArquivoGerado(caminho, nomeArquivo, extensao);
		
		System.out.println("Arquivo Zipado com Sucesso...");
	}
	
	private void ziparArquivoGerado(String dirSaida, String fileNameZipar, String extensao) throws Exception {
		Path path = Paths.get(dirSaida, fileNameZipar.replaceAll(extensao, ".ZIP"));
		try (FileOutputStream fileWriter = new FileOutputStream(path.toFile());
				ZipOutputStream zip = new ZipOutputStream(fileWriter);
			){
			
		    zip.setMethod(ZipOutputStream.DEFLATED); //metodo de compressao
		    addFileToZip(Paths.get(dirSaida, fileNameZipar).toFile(), zip);
		    zip.flush();

		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ZIPAR arquivos! - Arquivo Não Encontrado");
			throw e;
		}
	}
	
	private void addFileToZip(File srcFile, ZipOutputStream zip) throws IOException {
		try (FileInputStream fileInputStream = new FileInputStream(srcFile);) {
			File folder = new File(srcFile.getName());
			byte[] buf = new byte[1024];
			int len;			
			zip.putNextEntry(new ZipEntry(folder.getName()));
			while ((len = fileInputStream.read(buf)) > 0) {
				zip.write(buf, 0, len);
			}		
		} catch (IOException ex) {
			System.out.println("Erro ZIPAR arquivo: " + ex.getMessage());
			throw ex;
		}
	}
	
	public void deleteZipFile(String caminho, String nomeArqZip) throws IOException {
		Path path = Paths.get(caminho, nomeArqZip);
		try {
			Files.deleteIfExists(path);
		} catch (IOException ex) {
			System.out.println("Erro ao deletar arquivo ZIP: " + ex.getMessage());
			throw ex;
		}
	}
}
