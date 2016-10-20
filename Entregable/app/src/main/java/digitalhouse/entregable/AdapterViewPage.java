package digitalhouse.entregable;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class AdapterViewPage extends FragmentStatePagerAdapter {

    List<FragmentGaleria> listaFragments;

    public AdapterViewPage(FragmentManager fm) {
        super(fm);
        listaFragments = new ArrayList<>();
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.astridygaston));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.borago));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.central));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.dom));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.maido));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.mani));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.quintonil));
        listaFragments.add(FragmentGaleria.crearFragment(R.drawable.tegui));
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaFragments.size();
    }
}
