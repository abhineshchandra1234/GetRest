package com.eegrab.getrest.repository

import com.eegrab.getrest.api.RetrofitInstance
import com.eegrab.getrest.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}