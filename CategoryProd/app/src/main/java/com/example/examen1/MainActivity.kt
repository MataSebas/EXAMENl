package com.example.examen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtCode: EditText
    private lateinit var txtDescri: EditText
    private lateinit var txtCat: EditText
    private lateinit var txtMin: EditText
    private lateinit var txtMax: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCode   = findViewById(R.id.codInst)
        txtDescri   = findViewById(R.id.descrpinsert)
        txtCat   = findViewById(R.id.categoInser)
        txtMin = findViewById(R.id.minInsert)
        txtMax = findViewById(R.id.maxInsert)
    }

    fun ejecutar(view: View) {
        var aplicar = true
        if (txtCode.getText().toString().trim({ it <= ' ' }).length == 0) {
            Toast.makeText(this, R.string.txt_CodR, Toast.LENGTH_SHORT).show()
            txtCode.requestFocus()
            aplicar = false
        }

        if (txtDescri.getText().toString().trim({ it <= ' ' }).length == 0 && aplicar) {
            Toast.makeText(this, R.string.txt_DescrpR, Toast.LENGTH_SHORT).show()
            txtDescri.requestFocus()
            aplicar = false
        }
        if (txtCat.getText().toString().trim({ it <= ' ' }).length == 0 && aplicar) {
            Toast.makeText(this, R.string.txt_CatR, Toast.LENGTH_SHORT).show()
            txtCat.requestFocus()
            aplicar = false
        }
        if (txtMin.getText().toString().trim({ it <= ' ' }).length == 0 && aplicar) {
            Toast.makeText(this, R.string.txt_MinR, Toast.LENGTH_SHORT).show()
            txtMin.requestFocus()
            aplicar = false
        }
        if (txtMax.getText().toString().trim({ it <= ' ' }).length == 0 && aplicar) {
            Toast.makeText(this, R.string.txt_MaxR, Toast.LENGTH_SHORT).show()
            txtMax.requestFocus()
            aplicar = false
        }

        if (aplicar) {
            txtCode.setText("")
            txtDescri.setText("")
            txtCat.setText("")
            txtMin.setText("")
            txtMax.setText("")
            Toast.makeText(this, R.string.Inf_proc, Toast.LENGTH_SHORT).show()


        }
    }
}

