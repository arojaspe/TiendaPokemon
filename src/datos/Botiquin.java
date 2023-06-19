package datos;

public abstract class Botiquin extends Producto{

    protected String tipo ="Botiquin";

    public Botiquin(String nombre, int precio,String description) {
        super(nombre, precio,description);
    }
}