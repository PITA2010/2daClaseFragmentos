package org.vpitac.fragmentoconcatenar;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        BlankFragment fragmento=new BlankFragment();
        mitransaccion.add(R.id.ContenedorPrincipal,fragmento);
        mitransaccion.commit();

    }

    public void okay (View view){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        BlankFragment2 fragmento1=new BlankFragment2();
        mitransaccion.replace(R.id.ContenedorPrincipal,fragmento1);
        mitransaccion.commit();
    }


}
