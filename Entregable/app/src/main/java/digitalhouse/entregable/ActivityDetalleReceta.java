package digitalhouse.entregable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityDetalleReceta extends AppCompatActivity {

    public static final String KEY_NOMBRE = "nombre";
    public static final String KEY_RECETA = "receta";
    public static final String KEY_IMAGEN = "imagen";

    TextView textView_nombre;
    TextView textView_receta;
    ImageView imageView_imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nombreReceta = bundle.getString(KEY_NOMBRE);
        String receta = bundle.getString(KEY_RECETA);
        int imagen = bundle.getInt(KEY_IMAGEN);

        textView_nombre = (TextView)findViewById(R.id.activityDetalle_nombre);
        textView_receta = (TextView)findViewById(R.id.activityDetalle_receta);
        imageView_imagen = (ImageView)findViewById(R.id.activityDetalle_imagen);

        textView_nombre.setText(nombreReceta);
        textView_receta.setText(receta);
        imageView_imagen.setImageResource(imagen);
    }
}
