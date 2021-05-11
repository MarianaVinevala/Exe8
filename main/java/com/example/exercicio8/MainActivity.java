package com.example.exercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText edt1, edt2;
        TextView txt1, txt2, txt3;
        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edt1 =findViewById(R.id.edt1);
            edt2 =findViewById(R.id.edt2);
            txt1= findViewById(R.id.txt1);
            txt2= findViewById(R.id.txt2);
            txt3= findViewById(R.id.txt3);
            btn=findViewById(R.id.btn);


        }
        public void OnClick(View v){
            double Salario =Double.parseDouble(edt1.getText().toString());
            double Quilowatts =Double.parseDouble(edt2.getText().toString());
            txt1.setText("Por cada Quilowatts voce pagará" + (Salario*0.2));
            double pi=Salario*Quilowatts*0.2;
            txt2.setText("Total " + pi);
            txt3.setText("O preco final do veiculo é " + (pi-0.15));
        }
    }
