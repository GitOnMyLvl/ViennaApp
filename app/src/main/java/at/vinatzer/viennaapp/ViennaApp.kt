package at.vinatzer.viennaapp

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import at.vinatzer.viennaapp.ui.ViennaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import at.vinatzer.viennaapp.data.local.LocalCategoriesDataProvider.defaultCategory
import at.vinatzer.viennaapp.data.local.LocalCategoriesDataProvider.getCategoryData
import at.vinatzer.viennaapp.ui.CategoriesScreen
import at.vinatzer.viennaapp.ui.SpotScreen
import at.vinatzer.viennaapp.ui.StartScreen
import at.vinatzer.viennaapp.ui.theme.SpotsListScreen


enum class ViennaApp(@StringRes val title: Int) {
    Start(title = R.string.app_name), Categories(title = R.string.app_name), Spots(title = R.string.app_name), Detail(
        title = R.string.app_name
    )
}

@Composable
fun ViennaApp(
    modifier: Modifier = Modifier,
    viewModel: ViennaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = ViennaApp.valueOf(
        backStackEntry?.destination?.route ?: ViennaApp.Start.name
    )
    Scaffold { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()
        NavHost(
            navController = navController,
            startDestination = ViennaApp.Start.name,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(route = ViennaApp.Start.name) {
                StartScreen(
                    onNextButtonClicked = {
                        navController.navigate(ViennaApp.Categories.name)
                    }
                )
            }
            composable(route = ViennaApp.Categories.name) {
                CategoriesScreen(
                    categories = getCategoryData(),
                    onClick = {
                        viewModel.updateCurrentCategory(it)
                        navController.navigate(ViennaApp.Spots.name)
                    }
                )
            }
            composable(route = ViennaApp.Spots.name){
                SpotsListScreen(
                    spots = viewModel.getSpots(),
                    onClick = {
                        viewModel.updateCurrentSpot(it)
                        navController.navigate(ViennaApp.Detail.name)
                    }
                )
            }
            composable(route = ViennaApp.Detail.name){
                SpotScreen(name = uiState.currentSpot.name, imageId = uiState.currentSpot.imageId, descriptionId = uiState.currentSpot.descriptionId)
            }
        }
    }
}