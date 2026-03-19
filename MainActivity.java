package com.pucpr.calculadoraimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText pesoEditText;
    EditText alturaEditText;
    TextView resultTextView;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "App iniciado com sucesso!", Toast.LENGTH_SHORT).show();

        pesoEditText = findViewById(R.id.editPeso);
        alturaEditText = findViewById(R.id.editAltura);
        resultTextView = findViewById(R.id.textResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularIMC();
            }
        });
    }

    private void calcularIMC() {
        String pesoStr = pesoEditText.getText().toString();
        String alturaStr = alturaEditText.getText().toString();

        if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
            Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            return;
        }

        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III";
        }

        String resultado = String.format("IMC: %.2f\n%s", imc, classificacao);
        resultTextView.setText(resultado);
    }
}
