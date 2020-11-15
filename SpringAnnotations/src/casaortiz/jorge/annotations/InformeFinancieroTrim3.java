package casaortiz.jorge.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements GeneracionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Mejor de ventas en el trimestre 3";
	}

}
