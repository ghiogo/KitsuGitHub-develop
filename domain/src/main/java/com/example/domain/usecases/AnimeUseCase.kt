package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {

    operator fun invoke() = animeRepository.fetchAnime()
}