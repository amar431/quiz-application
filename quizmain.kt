package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.example.myapplication.R


class quizmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizmain)
        val buttonStart = findViewById<Button>(R.id.btn_start)
        val etName = findViewById<EditText>(R.id.et_name)

        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,quizquestions::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}