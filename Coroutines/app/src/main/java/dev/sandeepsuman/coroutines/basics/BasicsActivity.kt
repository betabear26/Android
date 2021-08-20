package dev.sandeepsuman.coroutines.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dev.sandeepsuman.coroutines.R
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BasicsActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics)

        textView = findViewById(R.id.text)
        button = findViewById(R.id.btnBasics)

        button.setOnClickListener {
            workSimple()
        }

    }

    private fun workSimple() = runBlocking {
        launch {
            delay(1000L)
            runOnUiThread {
                textView.text = System.currentTimeMillis().toString()
            }
        }
    }

    suspend fun scopeWork() = coroutineScope {

    }
}