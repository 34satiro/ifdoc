package br.com.satiro.pdfviwertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {
    Button btPcc,btGerais,btDcGremio;
    public static String usuarioUsado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        btPcc = (Button) findViewById(R.id.btPPC);
        btGerais = (Button) findViewById(R.id.btGerais);
        btDcGremio = (Button) findViewById(R.id.btDocGremio);

        btPcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pcc = new Intent(Tela1.this, MainActivity.class);
                pcc.putExtra("usuario", usuarioUsado);
                startActivity(pcc);

            }
        });

        btGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gerais = new Intent(Tela1.this, MainActivity1.class);
                gerais.putExtra("usuario", usuarioUsado);
                startActivity(gerais);

            }
        });

        btDcGremio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gremio = new Intent(Tela1.this, MainActivity2.class);
                gremio.putExtra( "usuario" , usuarioUsado );
                startActivity(gremio);

            }
        });


    }

    public void teste( View v ){
        Intent gremio = new Intent(Tela1.this, MainActivity2.class);
        gremio.putExtra( "usuario" , usuarioUsado );
        startActivity(gremio);
        Toast.makeText( Tela1.this , "Deu certo" , Toast.LENGTH_LONG ).show();
    }

}
