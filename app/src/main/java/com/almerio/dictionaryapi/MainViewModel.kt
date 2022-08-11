package com.almerio.dictionaryapi

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.almerio.dictionaryapi.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    val data = MutableLiveData<List<ResponseItem>>()

    fun getApiSearch(query: String?) {
        if (query != null) {
            ApiConfig.getApiService().getComment(query).enqueue(object : Callback<List<ResponseItem>> {
                override fun onResponse(
                    call: Call<List<ResponseItem>>,
                    response: Response<List<ResponseItem>>
                ) {
                    data.value = response.body()
                }

                override fun onFailure(call: Call<List<ResponseItem>>, t: Throwable) {
                    Log.e("MainViewModel", "onFailure: $t", )
                }

            })
        }
    }
}