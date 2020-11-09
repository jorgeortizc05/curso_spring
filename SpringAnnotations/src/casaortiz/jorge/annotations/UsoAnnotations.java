package casaortiz.jorge.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. leer el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. Pedir un Bean al contenedor
		Empleados Juan = contexto.getBean("comercialExperimentado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInformes());
		//3. Cerrar el contexto
		contexto.close();

	}

}
