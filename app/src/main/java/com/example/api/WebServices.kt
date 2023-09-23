package com.example.api

import com.example.api.model.newsResponse.NewsResponse
import com.example.api.model.sourcesResponse.SourcesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServices {
    @GET("v2/top-headlines/sources")
    fun getSources(
        @Query("apiKey") key: String = ApiConstants.apiKey
    ): Call<SourcesResponse>

    @GET("v2/everything")
    fun getNews(
        @Query("apiKey") key: String = ApiConstants.apiKey,
        @Query("sources") sources: String
    ): Call<NewsResponse>


}