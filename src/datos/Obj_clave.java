package datos;

import visual.imprimirObjetos;

public class Obj_clave extends Producto implements imprimirObjetos {

    private String tipo = "Objetos Clave";

    public Obj_clave(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripci�n: "+this.description);
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio() { return this.precio;}
    public String getDescription() {return this.description;}
}
