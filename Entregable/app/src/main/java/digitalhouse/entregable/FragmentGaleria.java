package digitalhouse.entregable;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGaleria extends Fragment {

    public static final String KEY_IMAGEN = "imagen";

    public static FragmentGaleria crearFragment(int imagen){
        FragmentGaleria fragmentGaleria = new FragmentGaleria();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_IMAGEN, imagen);
        fragmentGaleria.setArguments(bundle);

        return fragmentGaleria;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_galeria, container, false);

        ImageView fondo = (ImageView)view.findViewById(R.id.imageView_imagen);
        Bundle bundle = getArguments();
        int imagenFondo = bundle.getInt(KEY_IMAGEN);

        fondo.setImageResource(imagenFondo);

        return view;
    }

}
