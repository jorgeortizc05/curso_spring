package casaortiz.jorge.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Creo la annotations con @component
@Component //("miNombre")si no das el nombre del bean, por default utiliza nombre de la clase con la primera letra en minuscula
public class ComercialExperimentado implements Empleados {
	
	@Autowired //Inyeccion de dependencias: aqui es mas facil, sin constructor ni setter
	@Qualifier("informeFinancieroTrim4") //se creo varias clases que llama a la misma interfaz GeneracionInformeFinanciero
										//con Qualifier llamo a mi bean que voy a utilizar ex: informeFinancieroTrim3
	private GeneracionInformeFinanciero nuevoInforme;
	
	/*//Inyectamos con @Autowired: este es el metodo constructor
	//autowired: Spring busca en todo el proyecto a ver si hay una clase que implemente GeneracionInformeFinanciero, en este
	//caso InformeFinancieroTrim tiene la interfaz, lo implementa y lo inyecta
	@Autowired  //Spring 4.3: si es un solo contructor, no es necesario implementar el @Autowired
	public ComercialExperimentado(GeneracionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	
	
	public ComercialExperimentado() {
		
	}
	
	//inyectamos, metodo setter
	/*@Autowired
	public void setNuevoInforme(GeneracionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

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
