package com.example.data.remote.apiservices

import com.example.data.remote.dtos.DataItemDto
import com.example.data.remote.dtos.ResponseDto
import retrofit2.http.GET

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun fetchAnime(): ResponseDto<DataItemDto>
}