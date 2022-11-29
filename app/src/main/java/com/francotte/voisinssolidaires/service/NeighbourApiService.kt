package com.francotte.voisinssolidaires.service

import com.francotte.voisinssolidaires.model.Neighbour

interface NeighbourApiService {


    val neighbours: MutableList<Neighbour>

    fun deleteNeighbour(neighbour: Neighbour)

    fun createNeighbour(neighbour: Neighbour)
    fun getNeighbourByPosition(position: Int): Neighbour

    val neighboursFavorites: MutableList<Neighbour>
    fun deleteNeighbourFavorites(neighbour: Neighbour)
    fun addNeighbourFavorites(neighbour: Neighbour)
}