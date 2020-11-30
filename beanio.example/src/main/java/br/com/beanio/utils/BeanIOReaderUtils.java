package br.com.beanio.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.beanio.builder.CsvParserBuilder;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.beanio.builder.XmlParserBuilder;

import CustomTypeHandlers.CTHExtinto;

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
	
	public static StreamFactory getStreamFactoryTamanhoFixo(Class<?> classRecord) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
        	    .format(Utils.FORMAT_TAMANHO_FIXO)
        	    .parser(new FixedLengthParserBuilder())
                .addRecord(classRecord);
        // @formatter:on
        
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
	}
	
	public static StreamFactory getStreamFactoryXML(Class<?> classRecord, String nameStreanBuilder) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(nameStreanBuilder)
        	    .format(Utils.FORMAT_XML)
        	    .parser(new XmlParserBuilder().indent(4)) //seta indentação de 4 caracteres
        	    .addTypeHandler("CTHExtinto", new CTHExtinto())
                .addRecord(classRecord);
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
