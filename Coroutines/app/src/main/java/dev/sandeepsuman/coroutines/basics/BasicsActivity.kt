package dev.sandeepsuman.coroutines.basics

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dev.sandeepsuman.coroutines.R
import kotlinx.coroutines.*

class BasicsActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var buttonSimple: Button
    private lateinit var buttonScope: Button
    private lateinit var buttonScopeInParallel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics)

        textView = findViewById(R.id.text)
        buttonSimple = findViewById(R.id.btnSimple)
        buttonScope = findViewById(R.id.btnScope)
        buttonScopeInParallel = findViewById(R.id.btnScopeParallel)

        //Blocks the UI
        buttonSimple.setOnClickListener {
            workSimple()
        }

        //This does not block the UI Thread but multiple calls to function runs in sequence
        buttonScope.setOnClickListener {
            GlobalScope.launch {
                scopeWork()
                scopeWork()
                scopeWork()
                scopeWork()
                scopeWork()
            }
        }

        //Does not block UI and runs parallel
        buttonScopeInParallel.setOnClickListener {
            GlobalScope.launch {
                launch { scopeWork() }
                launch { scopeWork() }
                launch { scopeWork() }
                launch { scopeWork() }
                launch { scopeWork() }
            }
        }

        //This blocks the main thread
       /* runBlocking {
            launch {
                delay(10000L)
                textView.append("\n${System.currentTimeMillis()}")
            }
        }*/

        //This won't block the main thread
        GlobalScope.launch {
            withContext(Dispatchers.IO){
                delay(10000L)
                runOnUiThread {
                    textView.append("This")
                }
            }
        }

    }

    private fun workSimple() = runBlocking {
        launch {
            delay(1000L)
            runOnUiThread {
                textView.append("\n${System.currentTimeMillis()}")
            }
        }
    }

    suspend fun scopeWork() = coroutineScope {

        launch(Dispatchers.IO) {
            delay(10000L)
            runOnUiThread {
                textView.append("\n${System.currentTimeMillis()}")
            }
        }

    }
}