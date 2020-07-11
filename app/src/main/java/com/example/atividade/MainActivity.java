package com.example.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lisAtividade = findViewById(R.id.lisAtividade);

        final ArrayList<String> atividades = pesquisarAtividades();
        int layoutLista = android.R.layout.simple_list_item_1;
        ArrayAdapter<String> vetorVisualizacao = new ArrayAdapter<String> (this, layoutLista, atividades);
        lisAtividade.setAdapter(vetorVisualizacao);
        lisAtividade.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(), "Atividade: "
                        + atividades.get(position).toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public ArrayList<String> pesquisarAtividades ()
    {
        ArrayList<String> vetorAtividades = new ArrayList<String>();
        vetorAtividades.add("Atividade 1");
        vetorAtividades.add("Atividade 2");
        vetorAtividades.add("Atividade 3");
        vetorAtividades.add("Atividade 4");
        vetorAtividades.add("Atividade 5");
        vetorAtividades.add("Atividade 6");
        vetorAtividades.add("Atividade 7");
        vetorAtividades.add("Atividade 8");
        vetorAtividades.add("Atividade 9");
        vetorAtividades.add("Atividade 10");

        return vetorAtividades;
    }
}
