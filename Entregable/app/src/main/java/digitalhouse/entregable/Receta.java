package digitalhouse.entregable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class Receta {

    private String nombre;
    private List<String> ingredientesRequeridos;
    private int imagen;

    public Receta(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
        ingredientesRequeridos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarIngrediente(String ingrediente){
        ingredientesRequeridos.add(ingrediente);
    }

    public List<String> getIngredientesRequeridos() {
        return ingredientesRequeridos;
    }

    public int getImagen() {
        return imagen;
    }
}
