package com.gob.agendaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastrar, btnConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        //chamando a classe superior
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);// modificando a tela reconhecendo botoes

       this.btnCadastrar = findViewById(R.id.btnCadastrar);// botoes referenciados
        this.btnConsultar = findViewById(R.id.btnConsultar);
    // ativar botoes
        this.btnCadastrar.setOnClickListener(view ->{
            Intent intent =  new Intent(MainActivity.this, CadastrarActivity.class);
            startActivity(intent);

        });//FIM DO CADASTRAR

        this.btnConsultar.setOnClickListener(view ->{
            Intent intent
                    =  new Intent(MainActivity.this, ConsultarActivity.class);
            startActivity(intent);

        });//FIM DO Consultar

    }//fim do onCreate

}//fim do main activity
