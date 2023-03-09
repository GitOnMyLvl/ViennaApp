package at.vinatzer.viennaapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Spot(
    open val id: Int,
    @StringRes open val name: Int,
    @DrawableRes open val imageId: Int,
    @StringRes open val descriptionId: Int
){
    data class EntertainmentSpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class FoodAndDrinksSpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class MuseumSpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)


    data class NightLifeSpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class ShoppingSpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class SportsClubSpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class UniversitySpot(
        override val id: Int,
        @StringRes override val name: Int,
        @DrawableRes override val imageId: Int,
        @StringRes override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)


}
