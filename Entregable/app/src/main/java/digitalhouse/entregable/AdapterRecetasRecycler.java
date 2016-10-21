package digitalhouse.entregable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class AdapterRecetasRecycler extends RecyclerView.Adapter{
    private Context context;
    private List<Receta> listaRecetas;

    public AdapterRecetasRecycler(List<Receta> listaRecetas, Context context) {
        this.listaRecetas = listaRecetas;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.lista_recetas_detalle, parent, false);
        return new RecetasViewHolder(view);
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
        ImageView imagenReceta;

        public RecetasViewHolder(View itemView) {
            super(itemView);
            nombreReceta = (TextView)itemView.findViewById(R.id.textView_tituloDetalle);
            imagenReceta = (ImageView)itemView.findViewById(R.id.imageView_receta);
        }
        public void cargarReceta(Receta receta){
            nombreReceta.setText(receta.getNombre());
            imagenReceta.setImageResource(receta.getImagen());
        }
    }
}
