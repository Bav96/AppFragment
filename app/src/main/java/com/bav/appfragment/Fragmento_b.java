package com.bav.appfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmento_b extends Fragment {

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,
     Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentob, container, false);
        return view;



    }
    public void recibir (String dato){
        TextView tv = getActivity().findViewById(R.id.Mensaje);
        tv.setText(dato);


    }

    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView tv = getActivity().findViewById(R.id.texto);
        String texto = tv.getText().toString();
        outState.putString("MENSAJE", texto);
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            String Mensaje = savedInstanceState.getString("MENSAJE");
            TextView tv = getActivity().findViewById(R.id.Mensaje);
            tv.setText(Mensaje);
        }
    }
}
