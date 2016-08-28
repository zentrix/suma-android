package com.ejercio.carlos.suma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Funcion de sumar dos numeros
    public void sumar(View view){

        // Optenemos los valores
        int v1 = Integer.parseInt(((EditText) findViewById(R.id.txtv1)).getText().toString());
        int v2 = Integer.parseInt(((EditText) findViewById(R.id.txtv2)).getText().toString());

        //Accedemos a la label para mostrar el resultado
        TextView res = (TextView) findViewById(R.id.lblResultado);

        // Realizamos la suma y obtenemos mostramos el resultado en pantalla
        res.setText(String.valueOf(v1 + v2));
    }
}
