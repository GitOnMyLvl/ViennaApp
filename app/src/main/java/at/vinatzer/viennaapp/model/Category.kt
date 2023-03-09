package at.vinatzer.viennaapp.model

import androidx.annotation.StringRes

data class Category (
    val id: Int,
    @StringRes val name: Int,
    val spots: List<Spot> = emptyList()
)