package br.com.beanio.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.beanio.BeanReader;
import org.beanio.BeanReaderIOException;
import org.beanio.InvalidRecordException;
import org.beanio.MalformedRecordException;
import org.beanio.StreamFactory;
import org.beanio.UnexpectedRecordException;
import org.beanio.UnidentifiedRecordException;

public class FileReaderDecode<T> {

	@SuppressWarnings("unchecked")
	public List<T> getLista(StreamFactory factory, File file) throws Exception {
		List<T> lista = new ArrayList<>();
		try (
				FileInputStream fileInputStream = new FileInputStream(file);
				InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(inputStreamReader) ) {
	        
			String linha;
			while ((linha = reader.readLine()) != null) {
				BeanReader beanReader = BeanIOReaderUtils.getBeanReader(factory, linha);
				
		        Object record = null;
		        try {
		        	while ((record = beanReader.read()) != null) {
			        	beanReader.getRecordName();
			        	T bean = (T) record;
			        	lista.add( bean );
			        }
		        }
		        catch (BeanReaderIOException | MalformedRecordException | UnidentifiedRecordException| UnexpectedRecordException| InvalidRecordException e) {
		        	System.out.println("Erro ao Ler o arquivo. Verifique o Layout do Arquivo de Entrada!");
		        	throw e;
		        }
			}
		}
		return lista;
	}
}
