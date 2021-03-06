package dev.sandeepsuman.coroutines

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import dev.sandeepsuman.coroutines.basics.BasicsActivity
import dev.sandeepsuman.coroutines.basics.CancellationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnBasics).setOnClickListener {
            startActivity(Intent(this, BasicsActivity::class.java))
        }

        findViewById<Button>(R.id.btnCancel).setOnClickListener {
            startActivity(Intent(this, CancellationActivity::class.java))
        }
    }
}