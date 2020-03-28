package com.example.calculadoradeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);

        /*
           Calcula o IMC ( peso / altura * altura)
         */
    }

    public void calculaImc(View v){

        Double peso = Double.parseDouble(editPeso.getText().toString());
        Double altura = Double.parseDouble(editAltura.getText().toString());
        Double imc = peso / altura * altura;

        if(imc >= 18.5 && imc <= 24.99){
            textResultado.setText("Peso Normal, IMC = "+imc);
        }
        else if(imc >=25 && imc <= 29.99 ){
            textResultado.setText("Obesidade Grau 1, IMC = "+imc);
        }
        else if(imc >= 30  && imc <= 34.99){
            textResultado.setText("Obesidade Grau 2, IMC = "+imc);
        }
        else{
            textResultado.setText("Obesidade Grau 3, IMC = "+imc);
        }
    }

}
