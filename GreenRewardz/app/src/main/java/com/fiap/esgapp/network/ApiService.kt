package com.fiap.esgapp.network

import com.fiap.esgapp.model.Post
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/auth/register")
    fun postRequest(@Body requestBody: Post): Call<ResponseBody>
}