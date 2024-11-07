package com.example.test1a

import retrofit2.Call
import retrofit2.http.GET

interface JokeApiService {
    @GET("random_joke")
    fun getRandomJoke(): Call<Joke>
}
