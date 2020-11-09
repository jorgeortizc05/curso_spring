package casaortiz.jorge.IoC;

public class JefeEmpleado implements Empleados {

	private CreacionInformes informeNuevo;

	// Inyeccion por campos
	private String email;

	private String nombreEmpresa;
	
	//Ciclo de vida de un Bean
	//metodo init: ejecutar tareas antes de que el bean este disponible
	public void initBean() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas ejecutar "
				+ "antes de que el bean este listo");
	}
	
	//metodo destroy: Ejecutar tareas despues de que el bean haya sido utilizado
	public void destroyBean() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas ejecutar "
				+ "despues de utilizar el bean");
		
	}

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
