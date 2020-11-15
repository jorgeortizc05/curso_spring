package casaortiz.jorge.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements GeneracionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informa catastrofico del trimestre 2";
	}

}
