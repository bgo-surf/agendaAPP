package com.gob.agendaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public EditText codigo;
    public EditText assunto;
    public EditText date;
    public EditText descricao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }//fim do metodo
    //colertae os dados do formulario
    public void coletarDadosFormulario(View view){
        this.codigo   =     findViewById(R.id.editTextText);//coleta os dados da tela pasando para variavel codigo
        this.assunto  =   findViewById(R.id.editTextText2);
        this.date   =      findViewById(R.id.editTextText3);
        this.descricao = findViewById(R.id.editTextTextMultiLine);
    }
}//fim da classe