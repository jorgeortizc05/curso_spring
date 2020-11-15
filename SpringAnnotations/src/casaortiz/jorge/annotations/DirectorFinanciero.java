package casaortiz.jorge.annotations;

public class DirectorFinanciero implements Empleados {
	
	private GeneracionInformeFinanciero informeFinanciero;
	
	public DirectorFinanciero(GeneracionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y Direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

}
