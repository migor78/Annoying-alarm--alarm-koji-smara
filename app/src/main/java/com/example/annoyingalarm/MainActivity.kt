package com.example.annoyingalarm
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.annoyingalarm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hiText = findViewById<TextView>(R.id.HiText)
        val ime = findViewById<EditText>(R.id.Ime)
        val logDugme = findViewById<Button>(R.id.LogButton)
        logDugme.setOnClickListener {
            if(ime.text.toString()!="")
                hiText.text = "Hello ${ime.text}!"
            else {Toast.makeText(this@MainActivity, "Niste uneli ime!", Toast.LENGTH_SHORT).show(); hiText.text = "HELLO ANDROID!"}
            ime.text.clear()
        }
    }
}
