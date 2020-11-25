package br.com.beanio.utils;

import java.util.Calendar;
import java.util.Date;

public abstract class Utils {
	
	public static final String FORMAT_CSV = "delimited";
	public static final String FORMAT_TAMANHO_FIXO = "fixedlength";
	
	public static final String NAME_ARQ_CSV = "Exemplo_ARQ_CSV.csv";

	public static Date getDate(int ano, int mes, int dia) {
		Calendar cal = Calendar.getInstance();
		cal.set(ano, mes+1, dia);
		return cal.getTime();
	}
}