	 package datos;

	 import visual.imprimirObjetos;

	 public class Objetos extends Producto implements imprimirObjetos {

	private String tipo = "Objeto";

	public Objetos(String nombre, int precio, String description) {
		super(nombre, precio, description);
	}

	@Override
	public void mostrar() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Precio: "+this.precio);
		System.out.println("Descripci�n: "+this.description);
	}
	public String getNombre(){return this.nombre;}
}
