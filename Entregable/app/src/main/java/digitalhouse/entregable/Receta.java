package digitalhouse.entregable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class Receta {

    private String nombre;
    private String descripcion;
    private List<String> ingredientesRequeridos;

    public Receta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        ingredientesRequeridos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void agregarIngrediente(String ingrediente){
        ingredientesRequeridos.add(ingrediente);
    }

    public List<String> getIngredientesRequeridos() {
        return ingredientesRequeridos;
    }
}
