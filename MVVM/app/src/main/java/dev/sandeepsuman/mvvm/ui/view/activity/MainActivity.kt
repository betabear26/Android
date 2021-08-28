package dev.sandeepsuman.mvvm.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.sandeepsuman.mvvm.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}