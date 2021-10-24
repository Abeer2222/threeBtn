package com.example.threebtn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var tost: EditText
    lateinit var text: EditText
    lateinit var new: EditText
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)


        tost = findViewById(R.id.tost)
        text = findViewById(R.id.ettextview)
        new = findViewById(R.id.newactivity)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            Toast.makeText(this, "${tost.text}", Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            textView.text = text.text
        }

        button3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("input: ", "${new.text}")
            startActivity(intent)
        }
    }
}