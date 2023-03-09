package at.vinatzer.viennaapp.ui

import androidx.lifecycle.ViewModel
import at.vinatzer.viennaapp.data.local.LocalCategoriesDataProvider
import at.vinatzer.viennaapp.model.Category
import at.vinatzer.viennaapp.model.Spot
import at.vinatzer.viennaapp.model.ViennaUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViennaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(
        ViennaUiState(categories = LocalCategoriesDataProvider.getCategoryData(),
           currentCategory = LocalCategoriesDataProvider.getCategoryData().getOrElse(0) {
           LocalCategoriesDataProvider.defaultCategory
           }
        )
    )

    val uiState: StateFlow<ViennaUiState> = _uiState

    fun updateCurrentCategory(selectedCategory: Category) {
        _uiState.update {
           it.copy(currentCategory = selectedCategory)
        }
    }

    fun updateCurrentSpot(selectedSpot: Spot) {
        _uiState.update {
            it.copy(currentSpot = selectedSpot)
        }
    }

    fun getSpots(): List<Spot>{
        return uiState.value.currentCategory.spots
    }
}