package com.francotte.voisinssolidaires.di

import com.francotte.voisinssolidaires.service.DummyNeighbourApiService
import com.francotte.voisinssolidaires.service.NeighbourApiService

class DI {

    private val service: NeighbourApiService = DummyNeighbourApiService()

    fun getNeighbourApiService(): NeighbourApiService {
        return service
    }

    fun getNewInstanceApiService(): NeighbourApiService {
        return DummyNeighbourApiService()
    }
}