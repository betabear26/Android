package dev.sandeepsuman.mvvm.data.api

import dev.sandeepsuman.mvvm.data.model.Response
import retrofit2.Call
import retrofit2.http.GET

interface APIClient {

    @GET("getPerson")
    fun getPerson(): Call<Response>

}