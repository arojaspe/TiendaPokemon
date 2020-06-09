package datos;

import visual.imprimirObjetos;

public class CambioPP extends Botiquin implements imprimirObjetos {

    private String categoria = "Restauraci�n cambio de PP";

    public CambioPP(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripci�n: "+this.description);
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio() { return this.precio;}
    public String getDescription() {return this.description;}
}
