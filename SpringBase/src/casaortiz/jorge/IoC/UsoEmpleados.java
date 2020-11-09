package casaortiz.jorge.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		// Creacion de objetos de tipo empleado

		/*
		 * Empleados Empleado1 = new JefeEmpleado();
		 * 
		 * Empleados secretario = new SecretarioEmpleado();
		 * 
		 * // Uso de los objetos creados System.out.println(Empleado1.getTareas());
		 * System.out.println(secretario.getTareas());
		 */

		// Contenedor Spring
		//1. Cargar archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. Pedir el Bean
		JefeEmpleado Juan = contexto.getBean("miJefeEmpleado", JefeEmpleado.class);
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		//Utilizar el bean por metodo constructor
		System.out.println("EMPLEADO JUAN");
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		//utilizo el bean por metodo set. Tambien se implementa inyeccion por campos
		System.out.println("EMPLEADA MARIA");
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println(Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		
		//Cerar el XML
		contexto.close();

	}

}
