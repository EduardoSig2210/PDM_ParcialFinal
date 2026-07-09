package com.example.parcialfinal.data.repository

import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class RankeUCAa {
    fun register(carnet: String) : String? {
        val  client = OkHttpClient()

        val mediaType = "application/json".toMediaTypeOrNull()
        val body = RequestBody.create(mediaType, "{\"carnet\":\"" + carnet +"\"}")
        val request = Request.Builder()
            .url("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/register")
            .post(body)
            .addHeader("Content-Type", "application/json")
            .build()

        val response = client.newCall(request).execute()
        return response.body?.string()
    }
    // Pregunta
    fun getQuestion(key : String) : String? {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/questions")
            .get()
            .addHeader("Authorization", key)
            .build()

        val response = client.newCall(request).execute()
        return response.body?.string()
    }

    fun createQuestion(key : String, question: String){
        val client = OkHttpClient()

        val mediaType = "application/json".toMediaTypeOrNull()
        val body = RequestBody.create(mediaType, "{\"title\":\""+ question + "\"}")
        val request = Request.Builder()
            .url("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/questions")
            .post(body)
            .addHeader("Content-Type", "application/json")
            .addHeader("Authorization", key)
            .build()

        val response = client.newCall(request).execute()
    }

    fun getOptions(key : String) : String? {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/questions/1/options")
            .get()
            .addHeader("Authorization", key)
            .build()

        val response = client.newCall(request).execute()
    }
}