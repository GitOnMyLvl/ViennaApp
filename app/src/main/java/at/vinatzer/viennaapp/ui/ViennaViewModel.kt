package at.vinatzer.viennaapp.ui

import androidx.lifecycle.ViewModel
import at.vinatzer.viennaapp.data.local.LocalCategoriesDataProvider
import at.vinatzer.viennaapp.model.ViennaUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViennaViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ViennaUiState(categories = LocalCategoriesDataProvider.categories))
    val uiState: StateFlow<ViennaUiState> = _uiState.asStateFlow()
}