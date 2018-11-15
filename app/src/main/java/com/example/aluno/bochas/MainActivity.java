package com.example.aluno.bochas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtJogagor1, edtJogador2, edtJogador3, edtPts1, edtPts2, edtPts3;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtJogagor1 = findViewById(R.id.edtJogador1);
        edtJogador2 = findViewById(R.id.edtJogador2);
        edtJogador3 = findViewById(R.id.edtJogador3);
        edtPts1 = findViewById(R.id.edtPts1);
        edtPts2 = findViewById(R.id.edtPts2);
        edtPts3 = findViewById(R.id.edtPts3);
        btnVerificar = findViewById(R.id.btnVerificar);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double pontos1 = Double.parseDouble(edtPts1.getText().toString());
                double pontos2 = Double.parseDouble(edtPts2.getText().toString());
                double pontos3 = Double.parseDouble(edtPts3.getText().toString());

                System.out.println("pontos"+pontos1+""+pontos2+""+pontos3);
                String vencedor="";
                if (pontos1 > pontos2 && pontos1 < pontos3) {
                    vencedor = edtJogagor1.getText().toString();
                } else if (pontos2 > pontos1 && pontos2 < pontos3) {
                    vencedor = edtJogador2.getText().toString();
                } else if (pontos3 > pontos1 && pontos3 < pontos2) {
                    vencedor = edtJogador3.getText().toString();
                }

                Context contexto = getApplicationContext();

                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(contexto, vencedor, duracao);
                toast.show();


            }
        });


    }
}
