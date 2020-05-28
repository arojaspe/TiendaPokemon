package datos;

public abstract class Producto {

	protected String nombre;
	protected int precio;
	protected String description;

	public Producto(String nombre, int precio,String description) {
		this.nombre = nombre;
		this.precio = precio;
		this.description = description;
	}
}
