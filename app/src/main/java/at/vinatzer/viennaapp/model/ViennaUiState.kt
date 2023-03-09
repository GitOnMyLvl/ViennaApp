package at.vinatzer.viennaapp.model

import at.vinatzer.viennaapp.data.local.LocalCategoriesDataProvider
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider

data class ViennaUiState(
    val categories: List<Category> = emptyList(),
    val currentCategory: Category = LocalCategoriesDataProvider.defaultCategory,
    val isShowingCategoriesListPage: Boolean = false,
    val currentSpot: Spot = LocalSpotsDataProvider.defaultSpot
)