package papeleriaJPA.controllers;

import papeleriaJPA.models.Proveedor;

public class ControladorProveedor extends SuperControlador{
	private static ControladorProveedor instance = null;
	
	public ControladorProveedor() {
		super("proveedor", Proveedor.class);
	}
	
	public static ControladorProveedor getInstance() {
		if(instance==null) {
			instance = new ControladorProveedor();
		}
		return instance;
	}
	
	public Proveedor find(Integer id) {
		return(Proveedor) getEntityManager().find(Proveedor.class, id);
	}
}
