package fabricas;

import dao.CategoriaDAO;
import dao.ClienteDAO;
import dao.EmpleadoDAO;
import dao.PaisDAO;

public abstract class Fabrica {

	public static final int MYSQL = 1;
	public static final int SQLSERVER = 2;

	//declara los objetos DAO (Data Access Objet)
	public abstract CategoriaDAO getCategoria();
	public abstract ClienteDAO getCliente();
	public abstract PaisDAO getPais();
	public abstract EmpleadoDAO getEmpleado();
	
	public static Fabrica getFabrica(int tipo){
		Fabrica salida = null;
		switch(tipo){
			case MYSQL: 
				salida = new FabricaMysql();
				break;
		}
		return salida;
	}
	
}
