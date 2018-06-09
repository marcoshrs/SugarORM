package com.example.aluno.sugarorm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //https://stackoverflow.com/questions/33031570/android-sugar-orm-no-such-table-exception
        /*SugarContext.init(getApplicationContext());
        SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        schemaGenerator.createDatabase(new SugarDb(this).getDB());

        Lancamento lancamento = new Lancamento();
        lancamento.setDescricao("Teste 1");
        lancamento.setTipo("+");
        lancamento.setValor("25.");

        //salvar obj no banco
        lancamento.save();

        //Lancamento lancamentoId = Lancamento.findById(Lancamento.class, 2);
        //lancamento.delete();

        List<Lancamento> lb = Lancamento.listAll(Lancamento.class);
        Log.i("MainActivity", "Quantidade no banco: "+lb.size());
        */
    }

    public void adicionarLancamento(View view){
        Intent intent = new Intent(this, TelaLancamento.class):
        startActivity(intent);

    }
}
