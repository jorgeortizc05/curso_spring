package casaortiz.jorge.IoC;

/*
 * Injeccion de independencias tipo setter
 */

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	//Inyeccion por campos
	private String email;
	
	private String nombreEmpresa;
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "El secretario genero el siguiente informe: " + informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
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
