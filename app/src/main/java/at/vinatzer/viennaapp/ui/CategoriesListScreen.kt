package at.vinatzer.viennaapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import at.vinatzer.viennaapp.data.local.LocalCategoriesDataProvider
import at.vinatzer.viennaapp.model.Category
import at.vinatzer.viennaapp.ui.theme.ViennaAppTheme


@Composable
fun CategoriesScreen (
    categories: List<Category>,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
){
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ){
        items(categories, key = {category -> category.id}){ category ->
            CategoryListItem(category = category, onItemClick = onClick)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryListItem(
    category: Category,
    onItemClick: (Category) -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        elevation = 2.dp,
        modifier = modifier.fillMaxWidth(),
        onClick = { onItemClick(category) }
    ) {
        Box {
            Text(
                text = category.name,
                Modifier
                    .align(Alignment.Center)
                    .padding(4.dp)
            )
        }
    }
}


@Preview
@Composable
fun CategoryScreenPreview(){
    ViennaAppTheme() {
        Surface() {
            CategoriesScreen(categories = LocalCategoriesDataProvider.getCategoryData(), onClick = {})
        }
    }
}