package com.fiap.esgapp.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val retrofit = Retrofit.Builder()
    .baseUrl("https://backend-greenrewardz.onrender.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()


val services = retrofit.create(ApiService::class.java)

val body = mapOf(
    "email" to "teste@teste.com",
    "password" to "testando"
)
