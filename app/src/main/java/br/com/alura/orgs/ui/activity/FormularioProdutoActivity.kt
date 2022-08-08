package br.com.alura.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import br.com.alura.orgs.R

class FormularioProdutoActivity :
    AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val campoNome = findViewById<EditText>(R.id.nome)
        val nome = campoNome.text.toString()
        Log.i("FormularioProduto", "onCreate: $nome")
    }
}