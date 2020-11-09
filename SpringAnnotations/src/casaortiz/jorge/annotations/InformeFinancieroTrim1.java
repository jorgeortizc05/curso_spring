package casaortiz.jorge.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements GeneracionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero del trimestre1";
	}

}
