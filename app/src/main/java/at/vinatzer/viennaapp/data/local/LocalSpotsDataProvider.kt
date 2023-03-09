package at.vinatzer.viennaapp.data.local

import at.vinatzer.viennaapp.R
import at.vinatzer.viennaapp.model.Spot.FoodAndDrinksSpot
import at.vinatzer.viennaapp.model.Spot.ShoppingSpot
import at.vinatzer.viennaapp.model.Spot.NightLifeSpot
import at.vinatzer.viennaapp.model.Spot.EntertainmentSpot
import at.vinatzer.viennaapp.model.Spot.UniversitySpot
import at.vinatzer.viennaapp.model.Spot.SportsClubSpot
import at.vinatzer.viennaapp.model.Spot.MuseumSpot

object LocalSpotsDataProvider {

    val entertainmentSpots = listOf(
        EntertainmentSpot(
            id = 1,
            name = R.string.haus_des_meeres_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.haus_des_meeres_description
        ),
        EntertainmentSpot(
            id = 2,
            name = R.string.maxx_entertainment_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.maxx_entertainment_description
        ),
        EntertainmentSpot(
            id = 3,
            name = R.string.prater_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.prater_description
        ),
        EntertainmentSpot(
            id = 4,
            name = R.string.tiergarten_schönbrunn_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.tiergarten_schönbrunn_description
        ),
        EntertainmentSpot(
            id = 5,
            name = R.string.time_travel_vienna_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.tiergarten_schönbrunn_description
        )
    )

    val foodAndDrinksSpots = listOf(
        FoodAndDrinksSpot(
            id = 1,
            name = R.string.steirereck_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.steirereck_description
        ),
        FoodAndDrinksSpot(
            id = 2,
            name = R.string.the_loft_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.the_loft_description
        ),
        FoodAndDrinksSpot(
            id = 3,
            name = R.string.sacher_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.sacher_description
        ),
        FoodAndDrinksSpot(
            id = 4,
            name = R.string.plachutta_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.plachutta_description
        ),
        FoodAndDrinksSpot(
            id = 5,
            name = R.string.schweizerhaus_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.schweizerhaus_description
        )
    )

    val museumSpots = listOf(
        MuseumSpot(
            id = 1,
            name = R.string.museums_quartier_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.museums_quartier_name
        ),
        MuseumSpot(
            id = 2,
            name = R.string.mak_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.mak_description
        ),
        MuseumSpot(
            id = 3,
            name = R.string.technisches_museum_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.technisches_museum_description
        ),
        MuseumSpot(
            id = 4,
            name = R.string.naturhistorisches_museum_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.naturhistorische_museum_description
        ),
        MuseumSpot(
            id = 5,
            name = R.string.mumok_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.mumok_description
        )
    )

    val nightLifeSpots = listOf(
        NightLifeSpot(
            id = 1,
            name = R.string.volksgarten_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.volksgarten_description
        ),
        NightLifeSpot(
            id = 2,
            name = R.string.travel_shack_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.travel_shack_description
        ),
        NightLifeSpot(
            id = 3,
            name = R.string.o_club_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.o_club_description
        ),
        NightLifeSpot(
            id = 4,
            name = R.string.praterdome_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.praterdome_description
        ),
        NightLifeSpot(
            id = 5,
            name = R.string.u4_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.u4_description
        )
    )

    val shoppingSpots = listOf(
        ShoppingSpot(
            id = 1,
            name = R.string.mariahilferstrasse_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.mariahilferstrasse_description
        ),
        ShoppingSpot(
            id = 2,
            name = R.string.kaertnerstrße_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.kaerntnerstrase_description
        ),
        ShoppingSpot(
            id = 3,
            name = R.string.donau_zentrum_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.donau_zentrum_description
        ),
        ShoppingSpot(
            id = 4,
            name = R.string.the_mall_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.the_mall_description
        ),
        ShoppingSpot(
            id = 5,
            name = R.string.scs_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.scs_description
        )
    )

    val sportsClubSpots = listOf(
        SportsClubSpot(
            id = 1,
            name = R.string.austria_vienna_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.austria_vienna_description
        ),
        SportsClubSpot(
            id = 2,
            name = R.string.rapid_vienna_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.rapid_vienna_description
        ),
        SportsClubSpot(
            id = 3,
            name = R.string.wiener_sport_club_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.wiener_sport_club_description
        ),
        SportsClubSpot(
            id = 4,
            name = R.string.first_vienna_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.first_vienna_description
        ),
        SportsClubSpot(
            id = 5,
            name = R.string.vienna_capitals_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.vienna_capitals_description
        )
    )

    val universitySpots = listOf(
        UniversitySpot(
          id = 1,
          name = R.string.university_of_vienna_name,
          imageId = R.drawable.u4,
          descriptionId = R.string.university_of_vienna_description
        ),
        UniversitySpot(
            id = 2,
            name = R.string.tu_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.tu_description
        ),
        UniversitySpot(
            id = 3,
            name = R.string.wu_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.wu_description
        ),
        UniversitySpot(
            id = 4,
            name = R.string.fh_campus_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.fh_campus_description
        ),
        UniversitySpot(
            id = 5,
            name = R.string.fh_technikum_name,
            imageId = R.drawable.u4,
            descriptionId = R.string.fh_technikum_description
        ),
    )


    val defaultSpot = EntertainmentSpot(
        id = 1,
        name = R.string.u4_name,
        imageId = R.drawable.u4,
        descriptionId = R.string.u4_description
    )
}