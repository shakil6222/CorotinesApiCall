package com.example.corotinesapicall

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
//import retrofit2.http.Url
import java.net.URL

object RetrofitBuilder {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(UriObject.url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    val api:ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)

    }
}