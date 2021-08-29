package dev.sandeepsuman.mvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import dagger.hilt.android.AndroidEntryPoint
import dev.sandeepsuman.mvvm.data.model.Person
import dev.sandeepsuman.mvvm.databinding.ActivityMainBinding
import dev.sandeepsuman.mvvm.ui.vm.PersonViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel : PersonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getPerson()

        viewModel.getPersonList().observe(this,
            {
                binding.person = it.person
            })

        Glide.with(this).load("https://thispersondoesnotexist.com/image").diskCacheStrategy(
            DiskCacheStrategy.NONE).skipMemoryCache(true).into(binding.imageView);

    }
}