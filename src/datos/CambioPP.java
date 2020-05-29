package datos;

import vista.imprimirObjetos;

public class CambioPP extends Botiquin implements imprimirObjetos {

    private String categoria = "RestauraciÃ³n cambio de PP";

    public CambioPP(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripción: "+this.description);
    }
}
