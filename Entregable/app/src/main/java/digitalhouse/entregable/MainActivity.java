package digitalhouse.entregable;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.NavigationMenuItemView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager_main);
        viewPager.setAdapter(new AdapterViewPage(getSupportFragmentManager()));

        NavigationView navigation = (NavigationView)findViewById(R.id.navigationView_main);
        navigation.setNavigationItemSelectedListener(new ListenerMenu());

        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(16);

    }

    private class ListenerMenu implements NavigationView.OnNavigationItemSelectedListener{
                @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             switch(item.getItemId()){
                 case R.id.itemRecetas:
                     crearIntent(item);
             }

            return true;
        }
        private void crearIntent(MenuItem id){
            switch (id.getItemId()){
                case R.id.itemRecetas:
                    Intent intent = new Intent(MainActivity.this, ActivityRecetas.class);
                    startActivity(intent);
            }
        }
    }
}
