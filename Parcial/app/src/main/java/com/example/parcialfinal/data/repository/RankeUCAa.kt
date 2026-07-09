package com.example.parcialfinal.data.repository

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class RankeUCAa {
   val  client = OkHttpClient()

    val mediaType = "application/json".toMediaTypeOrNull()
    val body = RequestBody.create(mediaType, "{\"carnet\":\"00012523\"}")
    val request = Request.Builder()
        .url("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/register")
        .post(body)
        .addHeader("Content-Type", "application/json")
        .build()

    val response = client.newCall(request).execute()
}