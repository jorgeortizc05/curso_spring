package casaortiz.jorge.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements GeneracionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe de cierre de año";
	}

}
