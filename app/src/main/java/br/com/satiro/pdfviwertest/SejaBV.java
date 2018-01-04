package br.com.satiro.pdfviwertest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SejaBV extends AppCompatActivity {
    final int MILISEGUNDOS = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seja_bv);
        ficar3Segundos();
    }

    public void avancarTela1(View v){
        Intent i = new Intent( SejaBV.this , Tela1.class);
        startActivity(i);
    }

    public void ficar3Segundos (){
        new Handler().postDelayed(new Runnable(){
        @Override
        public void run() {
            Intent i = new Intent(SejaBV.this, Tela2.class);
            SejaBV.this.startActivity(i);
            SejaBV.this.finish();
        }
    }, MILISEGUNDOS);
    }




}
