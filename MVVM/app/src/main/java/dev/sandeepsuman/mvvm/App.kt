package dev.sandeepsuman.mvvm

import android.app.Application
import com.bumptech.glide.annotation.GlideModule
import dagger.hilt.android.HiltAndroidApp


//https://www.thecocktaildb.com/api.php

@HiltAndroidApp
@GlideModule
class App: Application() {
}