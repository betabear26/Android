package dev.sandeepsuman.mvvm.ui.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.sandeepsuman.mvvm.data.model.Person
import dev.sandeepsuman.mvvm.data.repo.PersonRepo
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class PersonViewModel @Inject constructor(
    private val personRepo: PersonRepo
) : ViewModel() {

    private val TAG = this.javaClass.simpleName

    private val liveData: MutableLiveData<dev.sandeepsuman.mvvm.data.model.Response> = MutableLiveData()

    fun getPersonList(): MutableLiveData<dev.sandeepsuman.mvvm.data.model.Response> {
        return liveData
    }

    fun getPerson() {
        val person = personRepo.getPerson()
        person.enqueue(object : Callback<dev.sandeepsuman.mvvm.data.model.Response> {
            override fun onResponse(call: Call<dev.sandeepsuman.mvvm.data.model.Response>, response: Response<dev.sandeepsuman.mvvm.data.model.Response>) {
                liveData.value = response.body()
            }

            override fun onFailure(call: Call<dev.sandeepsuman.mvvm.data.model.Response>, t: Throwable) {
                liveData.value = null
            }
        })
    }

}