package com.gob.agendaapp;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class RegistroAdapter extends RecycleView.Adapter<RegistroAdapter.ViewHolder> {

    private List<Registro> lista;

    public RegistroAdapter(List<Registro> lista){
        this.lista = lista;
    }//fim do cosntrutor

    public  static class ViewHolder extends  RecycleView.ViewHolder{
        TextView codigo, assunto, data,descricao;

        // representando os botoes
        ImageButton btnEditar, btnExcluir;
        //criar o construtor
        public ViewHolder(View itemView){
            super(itemView);

            codigo = itemView.findViewById(R.id.txtCodigo);
            assunto = itemView.findViewById(R.id.txtAssunto);
            data = itemView.findViewById(R.id.txtData);
            descricao = itemView.findViewById(R.id.txtDescricao);

            this.btnEditar = itemView.findViewById(R.id.btnEditar);
            this.btnExcluir = itemView.findViewById(R.id.btnExcluir);


        }//fim do viewholder

    }// fim classe viewholder

}// fim da registro adapter
