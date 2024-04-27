package com.example.corotinesapicall


class PostRepository {
   suspend fun getPost():List<PostModel> = RetrofitBuilder.api.getPost()
}