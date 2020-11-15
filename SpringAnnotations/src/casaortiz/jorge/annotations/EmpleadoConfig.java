package casaortiz.jorge.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Esta clase va a ser nuestro archivo de configuracion, asi evitaremos el archivo aplicationContext.xml
@Configuration
@ComponentScan("casaortiz.jorge.annotations") //escanea los archivos bean, en este caso estan en el paquete descrito
public class EmpleadoConfig {
	//definir el bean para el InformeFinancieroDtoCompras
	@Bean
	public GeneracionInformeFinanciero informeFinancieroDtoCompras() { //sera el id del Bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	//definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
