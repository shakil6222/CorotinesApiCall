package com.example.corotinesapicall

import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    suspend fun getPost():List<PostModel>


}