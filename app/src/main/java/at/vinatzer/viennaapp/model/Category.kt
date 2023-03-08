package at.vinatzer.viennaapp.model

data class Category (
    val id: Int,
    val name: String,
    val spots: List<Spot> = emptyList()
)