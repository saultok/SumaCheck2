package com.example.fundacionc.sumacheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1;
    EditText varTxtNum2;
    RadioButton varRdSuma;
    RadioButton varRdResta;
    RadioButton varRdMultiplicar;
    RadioButton varRdDividir;
    Button varButton;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varTxtNum1 = (EditText) findViewById(R.id.txtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.txtNum2);
        varRdSuma = (RadioButton) findViewById(R.id.rdSuma);
        varRdResta = (RadioButton) findViewById(R.id.rdResta);
        varRdMultiplicar = (RadioButton) findViewById(R.id.rdMultiplicar);
        varRdDividir = (RadioButton) findViewById(R.id.rdDividir);
        varButton = (Button) findViewById(R.id.btnOperacion);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        varButton.setOnClickListener (new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int resultado = 0;
                int num1 = Integer.parseInt(varTxtNum1.getText().toString());
                int num2 = Integer.parseInt(varTxtNum2.getText().toString());

                if(varRdSuma.isChecked())
                    resultado = num1 + num2;
                txtResultado.setText("El resultado es " + resultado);

                if(varRdResta.isChecked())
                    resultado = num1 - num2;
                txtResultado.setText("El resultado es " + resultado);

                if(varRdMultiplicar.isChecked())
                    resultado= num1*num2;
                txtResultado.setText("El resultado es " + resultado);

                if(varRdDividir.isChecked())
                    resultado= num1/num2;
                txtResultado.setText("El resultado es " + resultado);
            }
        });

    }
}
