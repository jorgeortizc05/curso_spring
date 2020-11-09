package casaortiz.jorge.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Creo la annotations con @component
@Component //("miNombre")si no das el nombre del bean, por default utiliza nombre de la clase con la primera letra en minuscula
public class ComercialExperimentado implements Empleados {

	private GeneracionInformeFinanciero nuevoInforme;
	
	//Inyectamos con @Autowired: este es el metodo constructor
	//autowired: Spring busca en todo el proyecto a ver si hay una clase que implemente GeneracionInformeFinanciero, en este
	//caso InformeFinancieroTrim lo implementa y lo inyecta
	@Autowired 
	public ComercialExperimentado(GeneracionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

}
