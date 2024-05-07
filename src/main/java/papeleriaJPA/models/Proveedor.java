package papeleriaJPA.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor extends Entidad{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cif;
	private String nacionalidad;
	private boolean activo;
	private Date fechaAlta;
	private int iva;
	
	@OneToMany(mappedBy = "proveedor")
	private List<Articulo> articulos;

	public Proveedor() {
		super();
	}

	public Proveedor(int id, String cif, String nacionalidad, boolean activo, Date fechaAlta, int iva,
			List<Articulo> articulos) {
		super();
		this.id = id;
		this.cif = cif;
		this.nacionalidad = nacionalidad;
		this.activo = activo;
		this.fechaAlta = fechaAlta;
		this.iva = iva;
		this.articulos = articulos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Cif: " + cif;
	}
	
	
}
