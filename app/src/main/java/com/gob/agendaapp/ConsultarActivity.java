package com.gob.agendaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;


public class ConsultarActivity extends AppCompatActivity {

    private RecyclerView recycler;

    private RegistroAdapter adapter; //referencia a classe registroadapter

    private List<Registro> lista = new ArrayList();//arrayList para armazenar dados no programa

    private FirebaseFirestore db;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        recycler = findViewById(R.id.recyclerRegistro);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RegistroAdapter(lista);
        recycler.setAdapter(adapter);
    }//fim do onCreate

}// fim da classe consultar
