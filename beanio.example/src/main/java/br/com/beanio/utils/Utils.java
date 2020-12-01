package br.com.beanio.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Utils {
	
	public static final String SDF_AAAAMMDD = "yyyyMMdd";
	public static final String SDF_AAAA_barra_MM_barra_DD = "yyyy/MM/dd";
	
	public static final String FORMAT_CSV = "delimited";
	public static final String FORMAT_TAMANHO_FIXO = "fixedlength";
	public static final String FORMAT_XML = "xml";
	
	public static final String NAME_ARQ_CSV_CARROS = "Exemplo_ARQ_CSV_Carros.csv";
	public static final String NAME_ARQ_CSV_CIDADES = "Exemplo_ARQ_CSV_Cidades.csv";
	public static final String NAME_ARQ_TXT_TIMES = "Exemplo_ARQ_TXT_Times.txt";
	public static final String NAME_ARQ_XML_ANIMAIS = "Exemplo_ARQ_XML_Animais.xml";
	public static final String NAME_ARQ_XML_NOTA_FISCAL = "Exemplo_ARQ_XML_NotaFiscal.xml";

	public static Date getDate(int ano, int mes, int dia) {
		Calendar cal = Calendar.getInstance();
		cal.set(ano, mes+1, dia);
		return cal.getTime();
	}
	
	public static String getDataAsIntYYYYMMDD(Date data) {
		return new SimpleDateFormat(SDF_AAAAMMDD).format(data);	
	}
	
	public static String getDataAsIntYYYY_barra_MM_barra_DD(Date data) {
		return new SimpleDateFormat(SDF_AAAA_barra_MM_barra_DD).format(data);	
	}
}
