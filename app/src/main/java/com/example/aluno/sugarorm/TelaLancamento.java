package com.example.aluno.sugarorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;

public class TelaLancamento extends AppCompatActivity {

    Lancamento lancamento = new Lancamento();
    EditText editTextDescricao;
    EditText editTextValor;
    RadioButton radioButtonCredito;
    RadioButton radioButtonDebito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lancamento);

        editTextDescricao = (EditText) findViewById(R.id.editDescricao);
        editTextValor = (EditText) findViewById(R.id.editValor);
        radioButtonCredito = (RadioButton) findViewById(R.id.radioCredito);
        radioButtonDebito = (RadioButton) findViewById(R.id.radioDebito);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null && bundle.containsKey("id")){
            Integer id = bundle.getInt("id");
            Log.i("Tela",""+id);
            editTextDescricao.setText(lancamento.getDescricao());
            editTextValor.setText(String.valueOf(lancamento.getValor()));
            if(lancamento.getTipo().equals("+")){
                radioButtonCredito.setChecked(true);
            }else{
                radioButtonDebito.setChecked(true);
            }
        }
    }
}
