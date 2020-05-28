package datos;

import vista.imprimirObjetos;

public class PokeBall extends Producto implements imprimirObjetos {

  private String tipo="PokeBall";

  public PokeBall(String nombre, int precio, String description) {
    super(nombre, precio, description);
  }

  @Override
  public void mostrar() {
    System.out.println("Nombre: "+this.nombre);
    System.out.println("Precio: "+this.precio);
    System.out.println("Descripción: "+this.description);
  }
}
