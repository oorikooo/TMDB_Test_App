package com.tmdbtestapp.domain.useCase

import com.tmdbtestapp.domain.repository.MovieRepository
import javax.inject.Inject

class GetVideoUrlUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    // For future maintenance
    suspend operator fun invoke(movieId: Int): Result<String> {
        return movieRepository.getVideoUrl(movieId)
    }
}