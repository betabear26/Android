package dev.sandeepsuman.coroutines.basics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.sandeepsuman.coroutines.R
import kotlinx.coroutines.*

class CancellationActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var simpleCancel: Button
    private lateinit var cantCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancellation)

        textView = findViewById(R.id.textView)
        simpleCancel = findViewById(R.id.cancelBtn)
        cantCancel = findViewById(R.id.cantcancel)

        simpleCancel.setOnClickListener {
            simpleCancel()
        }

        cantCancel.setOnClickListener {
            cantCancel()
        }
    }

    private fun simpleCancel() = GlobalScope.launch {
        val job = launch {
            repeat(100) {
                runOnUiThread {
                    if(it%20 == 0) textView.text = ""
                    textView.append("\nWaiting $it")
                }
                delay(200L)
            }
        }

        delay(10000L)
        runOnUiThread {
            textView.append("\nEnough waiting")
        }
        //job.cancel()
        //job.join() // Waits for job's completion

        // It can be done in single line as
        job.cancelAndJoin()
        runOnUiThread {
            textView.append("\nNow I quit")
        }

    }

    private fun cantCancel() = GlobalScope.launch {
        val startTime = System.currentTimeMillis()
        val job = launch(Dispatchers.Default) {
            var nextPrintTime = startTime
            var i = 0
            while (i < 5) { // computation loop, just wastes CPU
                // print a message twice a second
                if (System.currentTimeMillis() >= nextPrintTime) {
                    println("job: I'm sleeping ${i++} ...")
                    nextPrintTime += 500L
                }
            }
        }

        delay(1200L)
        println("main: I'm tired of waiting!")
        /*runOnUiThread {
            textView.append("\nTired of waiting")
        }*/
        job.cancelAndJoin()
        println("main: Now I can quit.")
        /*runOnUiThread {
            textView.append("\nNow I quit")
        }*/
    }
}

