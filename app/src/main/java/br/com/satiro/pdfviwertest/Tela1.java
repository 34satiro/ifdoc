package br.com.satiro.pdfviwertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {
    Button btAvancar1,btAvancar2;
    public static String usuarioUsado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        btAvancar1 = (Button) findViewById(R.id.btAvancar);
        btAvancar2 = (Button) findViewById(R.id.btavancar2);

        btAvancar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela2 = new Intent(Tela1.this, MainActivity.class);
                tela2.putExtra("usuario", usuarioUsado);
                startActivity(tela2);

            }
        });

        btAvancar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela2 = new Intent(Tela1.this, MainActivity1.class);
                tela2.putExtra("usuario", usuarioUsado);
                startActivity(tela2);

            }
        });





    }

}
