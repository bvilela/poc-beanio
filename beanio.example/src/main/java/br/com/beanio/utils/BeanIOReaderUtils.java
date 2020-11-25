package br.com.beanio.utils;

import org.beanio.StreamFactory;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.StreamBuilder;

public abstract class BeanIOReaderUtils {
	
	private static final String STREAM_BUILDER_NAME = "Reader";

	public static StreamFactory getStreamFactoryCSV(Class<?> classRecord) {
		// @formatter:off
	    StreamBuilder builder = new StreamBuilder(STREAM_BUILDER_NAME)
	    	    .format(Utils.FORMAT_CSV)
	    	    .parser(new DelimitedParserBuilder(';'))
	    	    .addRecord(classRecord);
	    // @formatter:on
	    
	    StreamFactory factory = StreamFactory.newInstance();
	    factory.define(builder);
	    return factory;		
	}
}
