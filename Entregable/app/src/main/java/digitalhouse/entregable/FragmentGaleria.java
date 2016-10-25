package digitalhouse.entregable;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGaleria extends Fragment {

    public static final String KEY_IMAGEN = "imagen";
    public static final String KEY_TITULO = "titulo";
    public static final String KEY_SUB = "subtit";

    public static FragmentGaleria crearFragment(String titulo, String subtitulo, int imagen){
        FragmentGaleria fragmentGaleria = new FragmentGaleria();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_IMAGEN, imagen);
        bundle.putString(KEY_TITULO, titulo);
        bundle.putString(KEY_SUB, subtitulo);
        fragmentGaleria.setArguments(bundle);

        return fragmentGaleria;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_galeria, container, false);

        ImageView fondo = (ImageView)view.findViewById(R.id.imageView_restaurante);
        TextView titulo = (TextView)view.findViewById(R.id.tView_fragment_titulo);
        TextView subtitulo = (TextView)view.findViewById(R.id.tView_fragment_subtitulo);
        Bundle bundle = getArguments();
        int imagenFondo = bundle.getInt(KEY_IMAGEN);
        String sTitulo = bundle.getString(KEY_TITULO);
        String sSubtitulo = bundle.getString(KEY_SUB);

        fondo.setImageResource(imagenFondo);
        titulo.setText(sTitulo);
        subtitulo.setText(sSubtitulo);

        return view;
    }

}
