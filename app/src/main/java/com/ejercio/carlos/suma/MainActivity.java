package com.ejercio.carlos.suma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radiobtn(View view) {
        // Optenemos los valores
        int su = Integer.parseInt(((EditText) findViewById(R.id.txtv1)).getText().toString());
        int re = Integer.parseInt(((EditText) findViewById(R.id.txtv2)).getText().toString());

        RadioButton rbtnsuma = (RadioButton) findViewById(R.id.rbtnS);
        RadioButton rbtnresta = (RadioButton) findViewById(R.id.rbtnR);

        //Accedemos a la label para mostrar el resultado
        TextView res = (TextView) findViewById(R.id.lblResultado);

        if (rbtnsuma.isChecked())
            res.setText(String.valueOf(su + re));
        else if (rbtnresta.isChecked())
            res.setText(String.valueOf(su - re));
    }
}
