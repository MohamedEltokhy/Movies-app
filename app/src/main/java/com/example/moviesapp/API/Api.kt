package com.example.moviesapp.API

import com.example.moviesapp.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "f9d1cfa09ad3ba1d9bfb297c8c7882f9",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "f9d1cfa09ad3ba1d9bfb297c8c7882f9",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "f9d1cfa09ad3ba1d9bfb297c8c7882f9",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}