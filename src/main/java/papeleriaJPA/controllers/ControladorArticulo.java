package papeleriaJPA.controllers;

import papeleriaJPA.models.Articulo;

public class ControladorArticulo extends SuperControlador {
	private static ControladorArticulo instance = null;
	
	public ControladorArticulo() {
		super("articulo", Articulo.class);
	}
	
	public static ControladorArticulo getInstance() {
		if(instance==null) {
			instance = new ControladorArticulo();
		}
		return instance;
	}
	
	public Articulo find(Integer id) {
		return(Articulo) getEntityManager().find(Articulo.class, id);
	}
	
	
	
	
	
}
