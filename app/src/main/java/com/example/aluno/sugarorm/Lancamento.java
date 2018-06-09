package com.example.aluno.sugarorm;

import com.orm.SugarRecord;

/**
 * Created by aluno on 08/06/18.
 */

public class Lancamento extends SugarRecord {

    private String descricao;
    private String valor;
    private String tipo;

    public Lancamento(){

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
