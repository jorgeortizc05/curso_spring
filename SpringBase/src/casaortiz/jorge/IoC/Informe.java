package casaortiz.jorge.IoC;

public class Informe implements CreacionInformes {
	//Inyecciones
	//Primer paso: creacion de clase e interfaz para la dependencia
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Esta es la presentacion del informe";
	}

}
