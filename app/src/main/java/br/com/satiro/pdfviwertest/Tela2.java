package br.com.satiro.pdfviwertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Tela2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Ir para tela de perguntas frequentes.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void listaPpc  ( View view )
    {
        Intent listPpc = new Intent( Tela2.this , MainActivity.class );
        Tela2.this.startActivity(listPpc);

    }

    public void listaDocG  ( View view )
    {
        Intent listPpc = new Intent( Tela2.this , MainActivity1.class );
        Tela2.this.startActivity(listPpc);

    }

    public void listaGremio  ( View view )
    {
        Intent listPpc = new Intent( Tela2.this , MainActivity2.class );
        Tela2.this.startActivity(listPpc);

    }

    public void info ( View view )
    {
        Snackbar.make(view, "Ir para tela de informações sobre FleetSoftwares.", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }


}
