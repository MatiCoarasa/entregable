package digitalhouse.entregable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class AdapterRecetasRecycler extends RecyclerView.Adapter{
    Context context;
    List<Receta> listaRecetas;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.lista_recetas_detalle, parent, false);
        RecetasViewHolder recetasViewHolder = new RecetasViewHolder(view);
        return recetasViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta receta = listaRecetas.get(position);
        RecetasViewHolder recetasViewHolder = (RecetasViewHolder)holder;
        recetasViewHolder.cargarReceta(receta);
    }

    @Override
    public int getItemCount() {
        return listaRecetas.size();
    }

    private class RecetasViewHolder extends RecyclerView.ViewHolder{
        TextView nombreReceta;
        TextView descripcionReceta;


        public RecetasViewHolder(View itemView) {
            super(itemView);
            nombreReceta = (TextView)itemView.findViewById(R.id.textView_tituloDetalle);
            descripcionReceta = (TextView)itemView.findViewById(R.id.textView_descripcionDetalle);
        }
        public void cargarReceta(Receta receta){
            nombreReceta.setText(receta.getNombre());
            descripcionReceta.setText(receta.getDescripcion());
        }
    }
}
