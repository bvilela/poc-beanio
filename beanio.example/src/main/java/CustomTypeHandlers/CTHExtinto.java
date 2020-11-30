package CustomTypeHandlers;

import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

public class CTHExtinto implements TypeHandler {
	//CustonTypeHandler para Formatar saida de dado no arquivo
	//no caso, formato valor do tipo double para SIM ou NAO

	@Override
	public Object parse(String text) throws TypeConversionException {
		return null;
	}

	@Override
	public String format(Object value) {
		if (value != null) {
			if ((Boolean) value) {
				return "SIM";
			} 
			else { 
				return "NÃO";
			}
		}
		return null;
	}

	@Override
	public Class<?> getType() {
		return Boolean.class;
	}
}
