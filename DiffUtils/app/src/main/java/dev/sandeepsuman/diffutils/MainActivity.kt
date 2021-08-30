package dev.sandeepsuman.diffutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dev.sandeepsuman.diffutils.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: RVAdapter

    private val itemList = arrayListOf<ListItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemList.add(ListItem("Title1", "Subtitle1"))
        itemList.add(ListItem("Title2", "Subtitle2"))
        itemList.add(ListItem("Title3", "Subtitle3"))
        itemList.add(ListItem("Title4", "Subtitle4"))
        itemList.add(ListItem("Title5", "Subtitle5"))
        itemList.add(ListItem("Title6", "Subtitle6"))
        itemList.add(ListItem("Title7", "Subtitle7"))


        adapter = RVAdapter(itemList)
        binding.list.layoutManager = LinearLayoutManager(this)
        binding.list.adapter = adapter

        binding.add.setOnClickListener {
            val random = Random.nextInt()
            itemList.add(ListItem("Title$random", "Subtitle$random"))
            adapter.update(itemList)
        }
    }
}