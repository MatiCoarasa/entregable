package digitalhouse.entregable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

    }

    private List<Receta> listaRecetas(){
        List<Receta> lista = new ArrayList<>();
        lista.add(new Receta("Merluza a la romana con puré de papas al champignon", R.drawable.receta_merluza));
        lista.add(new Receta("Fideos caseros con salsa de alcauciles", R.drawable.receta_fideos_caseros));
        lista.add(new Receta("Tarta de pollo, panceta y puerro", R.drawable.receta_tarta));
        lista.add(new Receta("Chuletas de cordero con hongos a la chapa", R.drawable.receta_chuletas_de_cordero));
        return lista;
    }
}
