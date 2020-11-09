package casaortiz.jorge.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. cargar xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. Obtencion del bean
		Empleados Juan = contexto.getBean("miJefeEmpleado", Empleados.class);
		
		System.out.println(Juan.getInforme());
		
		//3. Cerrar Contexto
		
		contexto.close();
	}

}
