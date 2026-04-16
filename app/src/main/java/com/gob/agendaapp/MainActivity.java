package com.gob.agendaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.firestore.FirebaseFirestore;//importar link com o fire base

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    public EditText codigo;
    public EditText assunto;
    public EditText data;
    public EditText descricao;
    public int cod;
    public String assunt;
     public Date dat;
    public String desc;
    public Boolean resultadoVerificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastrar);
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
        this.data   =      findViewById(R.id.editTextText3);
        this.descricao = findViewById(R.id.editTextTextMultiLine);

        this.verificarVazio(codigo, assunto, data, descricao);
        this.resultadoVerificacao = this.verificarVazio(codigo, assunto, data, descricao); //verificar se os campos estão vazio
        if(this.resultadoVerificacao == true) {
        }else{
            this.cod = Integer.parseInt(this.codigo.getText().toString());
            this.assunt = (this.assunto.getText().toString());

        }//fim do metodo

    }//fim coletar dados

    //Verifica se estar vazio metodo
    public boolean verificarVazio(EditText codigo, EditText assunto, EditText data, EditText descricao) {
        if (codigo.getText().toString().isEmpty() ||
                assunto.getText().toString().isEmpty() ||
                data.getText().toString().isEmpty() ||
                descricao.getText().toString().isEmpty()
        ) {
            return true;
        }//fim do if
        return  false;
    }//fim do metodo verificar vazioi

    public void cadastra (View view){
        this.coletarDadosFormulario(view);//chama o metodo de coletar dados

    }//fim dometodo cadastrar


}//fim da classe