package com.fatimasousa.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_clientes.setOnClickListener {
            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }

        txt_empresa.setOnClickListener {
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        txt_servicos.setOnClickListener {
            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

        txt_contato.setOnClickListener {
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }
    }
}