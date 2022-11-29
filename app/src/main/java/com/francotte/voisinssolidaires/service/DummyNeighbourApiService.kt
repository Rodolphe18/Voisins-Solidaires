package com.francotte.voisinssolidaires.service

import com.francotte.voisinssolidaires.model.Neighbour
import com.francotte.voisinssolidaires.service.DummyNeighbourGenerator

class DummyNeighbourApiService(
) : NeighbourApiService {

    override val neighbours: MutableList<Neighbour> = DummyNeighbourGenerator.generateNeighbours()

    override val neighboursFavorites: MutableList<Neighbour> = mutableListOf()


    override fun deleteNeighbour(neighbour: Neighbour) {
        neighbours.remove(neighbour)
    }

    override fun createNeighbour(neighbour: Neighbour) {
        neighbours.add(neighbour)
    }

    override fun getNeighbourByPosition(position: Int): Neighbour {
        return neighbours[position]
    }


    override fun deleteNeighbourFavorites(neighbour: Neighbour) {
        neighboursFavorites.remove(neighbour)
    }

    override fun addNeighbourFavorites(neighbour: Neighbour) {
        neighboursFavorites.add(neighbour)
    }


}