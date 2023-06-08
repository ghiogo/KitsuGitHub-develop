package com.example.data.repositories

import com.example.data.remote.dtos.toDomain
import com.example.domain.base.BaseRepository
import com.example.domain.repositories.MangaRepository
import com.example.data.remote.apiservices.MangaApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    override suspend fun fetchManga() = doRequest {
        mangaApiService.fetchManga().data.map {
            it.toDomain()
        }
    }
}