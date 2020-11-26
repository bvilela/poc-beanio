package br.com.beanio.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.beanio.builder.CsvParserBuilder;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.StreamBuilder;

public abstract class BeanIOReaderUtils {
	private static final String STREAM_BUILDER_NAME = "Reader";
	
	public static StreamFactory getStreamFactoryCSV(Class<?> classFileRead) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
        	    .format(Utils.FORMAT_CSV)
        	    .parser(new CsvParserBuilder().delimiter(';'))
        	    .addRecord(classFileRead);
        // @formatter:on
        
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
	}
	
	public static StreamFactory getStreamFactoryDemilitedParserBuilder(Class<?> classFileRead) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
        	    .format(Utils.FORMAT_CSV)
        	    .parser(new DelimitedParserBuilder(';')) // Sign to  use as a delimiter
        	    .addRecord(classFileRead);
        // @formatter:on
        
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
	}
	
	public static BeanReader getBeanReader(StreamFactory factory, String linha) {
		InputStream inputStream = new ByteArrayInputStream(linha.getBytes(StandardCharsets.UTF_8));
		BeanReader beanReader = factory.createReader(STREAM_BUILDER_NAME, new InputStreamReader(inputStream));
		return beanReader;
	}
}
