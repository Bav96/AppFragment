package com.bav.appfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDato(String Dato) {
     Fragmento_b fb = (Fragmento_b) getSupportFragmentManager()
                        .findFragmentById(R.id.fragmentBcontainer);
     fb.recibir(Dato);



    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull
            PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        // codigo que almacena la informacion en el bundle
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // codigo que recupera la informacion del bundle
    }

}