package com.francotte.voisinssolidaires.service

import com.francotte.voisinssolidaires.model.Neighbour

object DummyNeighbourGenerator {

    private var dummyNeighbours: MutableList<Neighbour> = mutableListOf(
        Neighbour(
            1,
            "Caroline",
            "https://i.pravatar.cc/150?u=a042581f4e29026704d",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            2,
            "Jack",
            "https://i.pravatar.cc/150?u=a042581f4e29026704e",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            3,
            "Chloé",
            "https://i.pravatar.cc/150?u=a042581f4e29026704f",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            4,
            "Vincent",
            "https://i.pravatar.cc/150?u=a042581f4e29026704a",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            5,
            "Elodie",
            "https://i.pravatar.cc/150?u=a042581f4e29026704b",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            6,
            "Sylvain",
            "https://i.pravatar.cc/150?u=a042581f4e29026704c",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            7,
            "Laetitia",
            "https://i.pravatar.cc/150?u=a042581f4e29026703d",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            8,
            "Dan",
            "https://i.pravatar.cc/150?u=a042581f4e29026703b",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            9,
            "Joseph",
            "https://i.pravatar.cc/150?u=a042581f4e29026704d",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            10,
            "Emma",
            "https://i.pravatar.cc/150?u=a042581f4e29026706d",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            11,
            "Patrick",
            "https://i.pravatar.cc/150?u=a042581f4e29026702d",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        ),
        Neighbour(
            12,
            "Ludovic",
            "https://i.pravatar.cc/150?u=a042581f3e39026702d",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."
        )
    )
        fun generateNeighbours(): MutableList<Neighbour> {
            return dummyNeighbours
        }
    }



