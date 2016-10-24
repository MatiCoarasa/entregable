package digitalhouse.entregable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ActivityRecetas extends AppCompatActivity {

    RecyclerView recyclerViewRecetas;
    AdapterRecetasRecycler adapterRecetasRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        recyclerViewRecetas = (RecyclerView)findViewById(R.id.recyclerView_recetas);
        adapterRecetasRecycler = new AdapterRecetasRecycler(listaRecetas(), this);

        recyclerViewRecetas.setAdapter(adapterRecetasRecycler);
        recyclerViewRecetas.setHasFixedSize(true);
        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapterRecetasRecycler.setOnClickListener(new ListenerRecetas());

    }

    private List<Receta> listaRecetas(){
        List<Receta> lista = new ArrayList<>();
        lista.add(new Receta("Merluza a la romana con puré de papas al champignon", R.drawable.receta_merluza, "Salpimentar los filetes y reservar.\n" +
                "\n" +
                " \n" +
                "Para la huevada, batir los huevos con sal, pimienta, ajo y perejil picados. Estirar con leche y espesar con harina, usar más de una cucharada si se necesita, debe quedar una pasta espesa pero corrediza.\n" +
                "\n" +
                " \n" +
                "Pasar los filetes por la huevada y freír en aceite bien caliente.\n" +
                "\n" +
                " \n" +
                "Para el puré, hervir las papas en agua y sal y reservar.\n" +
                "\n" +
                "Aparte, saltear los champignones fileteados en oliva y salar.\n" +
                "\n" +
                "Mezclar el puré con los champignones."));
        lista.add(new Receta("Fideos caseros con salsa de alcauciles", R.drawable.receta_fideos_caseros, "Para la masa, en un bol, mezclar la harina con el semolín y la sal e integrar con los huevos. \n" +
                "\n" +
                "Tomar la masa y bajar a la mesada, amasar por unos minutos y dejar descansar.\n" +
                "\n" +
                "Estirar y cortar cintas de un cm de ancho.\n" +
                "\n" +
                "Hervir en agua y sal y reservar.\n" +
                "\n" +
                " \n" +
                "Para la salsa, saltear los alcauciles previamente cocidos en oliva junto con la panceta en bastones y el ajo picado.\n" +
                "\n" +
                "Incorporar el tomate triturado, las aceitunas fileteadas y reducir por unos minutos."));
        lista.add(new Receta("Tarta de pollo, panceta y puerro", R.drawable.receta_tarta, "Para la masa, en un bol, mezclar las harinas con la manteca fría en cubitos y arenar. Sumar el agua fría si es necesario y unir, sin amasar.\n" +
                "\n" +
                "Llevar a la heladera por una media hora y estirar.\n" +
                "\n" +
                "Forrar una tartera y pinchar, cocer al horno medio con peso (papel aluminio con porotos) por 10 minutos."+
                "\n" +
                "Para el relleno, dorar el pollo cubeteado en oliva, sumar la panceta ahumada en cubitos y la cebolla y puerros picados.  Condimentar.\n" +
                "\n" +
                " \n" +
                "Para el armado, volcar el relleno sobre la masa y terminar con el ligue (mezclar los ingredientes del ligue).\n" +
                "\n" +
                " \n" +
                "Cocinar al horno medio por 20 minutos."));
        lista.add(new Receta("Chuletas de cordero con hongos a la chapa", R.drawable.receta_chuletas_de_cordero, "Para el adobo, machacar el enebro y mezclar con pimentón, ají molido, romero, tomillo y ajo picados, ralladura de naranja y aceite de oliva en cantidad necesaria.\n" +
                "\n" +
                " \n" +
                "Colocar las chuletas en una fuente, adobar y reposar en heladera, tapada, por 30 minutos.\n" +
                "\n" +
                "Dorar el oliva de ambos lados.\n" +
                "\n" +
                " \n" +
                "Para la guarnición, cubetear las papas, cebollas, morrones y hongos y saltear a la chapa con oliva. Salar."));
        return lista;
    }
    private class ListenerRecetas implements RecyclerView.OnClickListener{

        @Override
        public void onClick(View view) {
            int posicion = recyclerViewRecetas.getChildAdapterPosition(view);
            List<Receta> recetaList = adapterRecetasRecycler.getListaRecetas();
            Receta recetaClickeada = recetaList.get(posicion);
            Intent intent = new Intent(view.getContext(), ActivityDetalleReceta.class);
            Bundle bundle = new Bundle();
            bundle.putString(ActivityDetalleReceta.KEY_NOMBRE, recetaClickeada.getNombre());
            bundle.putString(ActivityDetalleReceta.KEY_RECETA, recetaClickeada.getReceta());
            bundle.putInt(ActivityDetalleReceta.KEY_IMAGEN, recetaClickeada.getImagen());
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
