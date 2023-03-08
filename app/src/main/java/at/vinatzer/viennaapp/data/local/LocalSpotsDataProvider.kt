package at.vinatzer.viennaapp.data.local

import at.vinatzer.viennaapp.model.Spot.ShoppingSpot
import at.vinatzer.viennaapp.model.Spot.NightLifeSpot
import at.vinatzer.viennaapp.model.Spot.EntertainmentSpot

object LocalSpotsDataProvider {

    val nightLifeSpots = listOf(
        NightLifeSpot(
            id = 1,
            name = "U4",
            imageId = 1,
            descriptionId = 1
        ),
        NightLifeSpot(
            id = 2,
            name = "Volksgarten",
            imageId = 2,
            descriptionId = 2
        )
    )

    val shoppingSpots = listOf(
        ShoppingSpot(
            id = 1,
            name = "SCS",
            imageId = 1,
            descriptionId = 1
        )
    )

    val entertainmentSpots = listOf(
      EntertainmentSpot(
            id = 1,
            name = "Prater",
            imageId = 1,
            descriptionId = 1
        )
    )
}