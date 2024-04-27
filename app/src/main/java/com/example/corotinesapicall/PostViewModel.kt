package com.example.coroutinesapicall

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.corotinesapicall.PostModel
import com.example.corotinesapicall.PostRepository
import kotlinx.coroutines.launch

class PostViewModel(private val postRepository: PostRepository) : ViewModel() {
    val postMutableLiveData: MutableLiveData<List<PostModel>> = MutableLiveData()

    fun getPosts() {
        viewModelScope.launch {
            try {
                val posts =
                    postRepository.getPost() // Assuming getPosts is a suspend function that fetches posts
                postMutableLiveData.value = posts // Post the data to LiveData
            } catch (e: Exception) {
                Log.d("main", "getPost:${e.message}")
            }
        }
    }
}
