package papeleriaJPA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo extends Entidad{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String codigo;
	private String descripcion;
	private int stock;
	private float precio;
	private String color;
	
	@ManyToOne
	@JoinColumn(name = "idProveedor")
	private Proveedor proveedor;

	public Articulo() {
		super();
	}

	public Articulo(int id, String codigo, String descripcion, int stock, float precio, String color,
			Proveedor proveedor) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.color = color;
		this.proveedor = proveedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
	
}
