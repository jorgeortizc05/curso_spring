package casaortiz.jorge.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. leer el xml de configuracion en sistemas antiguos. Actualmente uso una clase
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadoConfig.class);
		//2. Pedir un Bean al contenedor
		/*Empleados Juan = contexto.getBean("comercialExperimentado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInformes());*/
		
		//aqui uso la llamada del @Bean
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());
		
		//3. Cerrar el contexto
		contexto.close();

	}

}
