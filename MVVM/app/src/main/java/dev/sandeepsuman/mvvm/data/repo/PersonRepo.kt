package dev.sandeepsuman.mvvm.data.repo

import dev.sandeepsuman.mvvm.data.api.APIClient
import dev.sandeepsuman.mvvm.data.model.Person
import dev.sandeepsuman.mvvm.data.model.Response
import retrofit2.Call
import javax.inject.Inject

class PersonRepo constructor(
    private val apiCliet: APIClient
){

    fun getPerson(): Call<Response>{
        return apiCliet.getPerson()
    }

}