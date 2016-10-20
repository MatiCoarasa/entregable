package digitalhouse.entregable;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class Receta {

    private String nombre;
    private String descripcion;

    public Receta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
