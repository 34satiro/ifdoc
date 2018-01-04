package br.com.satiro.pdfviwertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import br.com.satiro.pdfviwertest.data.Database
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var bttela2: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //bttela2 = findViewById(R.id.btAvancar) as Button
       // bttela2.setOnClickListener(this)

        initRecycler()
    }

    /*override fun onClick(v: View?) {
        setContentView(R.layout.activity_main)
        //val intent = Intent(this@MainActivity, MainActivity1::class.java )
        //startActivity(intent)
    }*/

    override fun onResume() {
        super.onResume()
        initRecycler()
    }

    private fun initRecycler() {
        rv_todo.setHasFixedSize(true)

        val mLayoutManager = LinearLayoutManager(this)
        rv_todo.layoutManager = mLayoutManager

        val divider = DividerItemDecoration( this, mLayoutManager.orientation )
        rv_todo.addItemDecoration(divider)

        val adapter = DocAdapter(this, Database.getDocsPpc())
        rv_todo.adapter = adapter
    }
}
