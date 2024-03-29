package br.com.beanio.utils;

import java.io.File;
import java.util.List;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.CsvParserBuilder;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.beanio.builder.XmlParserBuilder;

import CustomTypeHandlers.CTHExtinto;

public abstract class BeanIOWriterUtils {
	private static final String STREAM_BUILDER_NAME = "Writer";
		
	public static StreamFactory getStreamFactoryCSV(Class<?> classRecord) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
        	    .format(Utils.FORMAT_CSV)
        	    .parser(new CsvParserBuilder().delimiter(';'))
                .addRecord(classRecord)
                .writeOnly()
                .strict();
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
                .addRecord(classRecord)
                .writeOnly()
                .strict();
        // @formatter:on
        
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
	}
	
	public static StreamFactory getStreamFactoryDemilitedParserBuilder(Class<?> classRecord) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
        	    .format(Utils.FORMAT_CSV)
        	    .parser(new DelimitedParserBuilder(';')) // Sign to  use as a delimiter
                .addRecord(classRecord)
                .writeOnly()
                .strict();
        // @formatter:on
        
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
	}
	
	public static StreamFactory getStreamFactoryXML(Class<?> classRecord) {
        // @formatter:off
        StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
        	    .format(Utils.FORMAT_XML)
        	    .parser(new XmlParserBuilder().indent(4)) //seta indentação de 4 caracteres 
                .addRecord(classRecord)
                .addTypeHandler("CTHExtinto", new CTHExtinto())
                .writeOnly()
                .strict();
        // @formatter:on
        
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
	}
	
	public static void writer(List<?> list, StreamFactory streamFactory, String path) {
		if (list == null || list.isEmpty()) {
			System.out.println("Lista Vazia!");
			return;
		}
		
	    BeanWriter out = null;
	    out = streamFactory.createWriter(STREAM_BUILDER_NAME, new File(path));
	    
	    for (int i = 0; i < list.size(); i++) {
			out.write(list.get(i));
		}
	    out.flush();
	    out.close();	
	}
}
