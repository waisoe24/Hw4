package com.example.assignment4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            if (edit1.text.isEmpty() && edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter numbers", Toast.LENGTH_LONG).show()
            } else {
                var result: Int = edit1.text.toString().toInt() + edit2.text.toString().toInt()
                tvResult.text = result.toString()
            }
        }

        btnSub.setOnClickListener {
            if (edit1.text.isEmpty() && edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter numbers", Toast.LENGTH_LONG).show()
            } else {
                var result: Int = edit1.text.toString().toInt() - edit2.text.toString().toInt()
                tvResult.text = result.toString()
            }
        }

        btnMul.setOnClickListener {
            if (edit1.text.isEmpty() && edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter numbers", Toast.LENGTH_LONG).show()
            } else {
                var result: Int = edit1.text.toString().toInt() * edit2.text.toString().toInt()
                tvResult.text = result.toString()
            }

        }

        btnDiv.setOnClickListener {
            if (edit1.text.isEmpty() && edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter numbers", Toast.LENGTH_LONG).show()
            } else {
                var result: Int = edit1.text.toString().toInt() / edit2.text.toString().toInt()
                tvResult.text = result.toString()
            }
        }
        btnClear.setOnClickListener {
            edit1.setText("")
            edit2.setText("")
            tvResult.setText("Result")
        }
    }

}

