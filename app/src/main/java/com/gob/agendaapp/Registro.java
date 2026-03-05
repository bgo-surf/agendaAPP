package com.gob.agendaapp;

import java.util.Date;
public class Registro {
    private int codigo;
    private String assunto;
    private Date dataEvento;

    private String descricao;

    // criar um construtor sem parametro
    public Registro(){
        this.codigo     = 0;
        this.assunto    = "";
        this.dataEvento = new Date();//0000/00/00
        this.descricao  = "";
    }//fim construtor padrão

    public Registro(int codigo,String assunto, Date dataEvento, String descricao){
        this.codigo     = codigo;
        this.assunto    = assunto;
        this.dataEvento = dataEvento;
        this.descricao  = descricao;
    }//fim do metodo

    //metodo GETS E SETS
    public  int getCodigo(){
        return this.codigo;
    }//fim do consultarCodigo

    public String getAssunto(){
        return this.assunto;
    }//fim do colsultarAssunto

    public Date getDataEvento(){
        return  this.dataEvento;
    }//fim consultarDataEvento

    public  String getDescricao(){
        return this.descricao;
    }//fim do metodo GEt

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }//fim do set codigo

    public  void setAssunto(String assunto){
        this.assunto = assunto;
    }//fim do set assunto

    public void  setDataEvento(Date dataEvento){
        this.dataEvento = dataEvento;
    }//fim do set dataEvento

    public void setDescricao(String descricao){
        this.descricao = descricao;
}//fim do set









}//FIM DA CLASSE
