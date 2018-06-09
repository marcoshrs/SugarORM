package com.example.aluno.sugarorm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aluno on 08/06/18.
 */

public class AdapterLancamento extends BaseAdapter {

    List<Lancamento> lancamentos;
    Context contexto;

    public AdapterLancamento(Context context, List<Lancamento> lancamentos){
        this.contexto = context;
        this.lancamentos = lancamentos;
    }

    @Override
    public int getCount() {
        return lancamentos.size();
    }

    @Override
    public Object getItem(int position) {
        return lancamentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lancamentos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewLinha = LayoutInflater.from(contexto).
                inflate(R.layout.linhas_lista_lancamento, parent, false);
        TextView textViewDescricao = (TextView) viewLinha.findViewById(R.id.linhaDescricao);
        TextView textViewTipo = (TextView) viewLinha.findViewById(R.id.linhaTipo);
        TextView textViewValor = (TextView) viewLinha.findViewById(R.id.linhaValor);

        Lancamento lancamento = (Lancamento) getItem(position);

        textViewDescricao.setText(lancamento.getDescricao());
        textViewTipo.setText(lancamento.getTipo());
        textViewValor.setText(String.valueOf(lancamento.getValor()));

        return viewLinha;
    }
}
