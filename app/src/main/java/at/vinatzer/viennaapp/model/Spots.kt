package at.vinatzer.viennaapp.model

sealed class Spot(
    open val id: Int,
    open val name: String,
    open val imageId: Int,
    open val descriptionId: Int
){
    data class EntertainmentSpot(
        override val id: Int,
        override val name: String,
        override val imageId: Int,
        override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class ShoppingSpot(
        override val id: Int,
        override val name: String,
        override val imageId: Int,
        override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

    data class NightLifeSpot(
        override val id: Int,
        override val name: String,
        override val imageId: Int,
        override val descriptionId: Int
    ):Spot(id, name, imageId, descriptionId)

}
