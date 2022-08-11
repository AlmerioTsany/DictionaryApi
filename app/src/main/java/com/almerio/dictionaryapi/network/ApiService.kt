package com.almerio.dictionaryapi.network

import com.almerio.dictionaryapi.ResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("{word}")
    fun getComment(@Path("word") word: String) : Call<List<ResponseItem>>
}