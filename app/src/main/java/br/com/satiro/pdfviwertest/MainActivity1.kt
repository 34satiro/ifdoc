package br.com.satiro.pdfviwertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import br.com.satiro.pdfviwertest.data.Database
import kotlinx.android.synthetic.main.activity_main1.*


class MainActivity1 : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

       initRecycler()
    }


    override fun onResume() {
        super.onResume()
        initRecycler()
    }

    private fun initRecycler() {
        rv_todo1.setHasFixedSize(true)

        val mLayoutManager = LinearLayoutManager(this)
        rv_todo1.layoutManager = mLayoutManager

        val divider = DividerItemDecoration( this, mLayoutManager.orientation )
        rv_todo1.addItemDecoration(divider)

        val adapter = DocAdapter(this, Database.getDocs())
        rv_todo1.adapter = adapter
    }
}
