package at.vinatzer.viennaapp.ui.theme

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import at.vinatzer.viennaapp.R
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider
import at.vinatzer.viennaapp.model.Spot
import at.vinatzer.viennaapp.ui.SpotScreen

@Composable
fun SpotsListScreen(
    spots: List<Spot>,
    onClick: (Spot) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ){
        items(spots, key = {spot -> spot.id}){ spot ->
            SpotsListItem(spot = spot, onItemClick = onClick)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SpotsListItem(
    spot: Spot,
    onItemClick: (Spot) -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        elevation = 2.dp,
        modifier = modifier.fillMaxWidth(),
        onClick = { onItemClick(spot) }
    ) {
        Box {
            Text(
                text = stringResource(id = spot.name),
                Modifier
                    .align(Alignment.Center)
                    .padding(4.dp)
            )
        }
    }
}

@Preview
@Composable
fun SpotsListScreenPreview()
{
    ViennaAppTheme() {
        Surface() {
            SpotsListScreen(
                spots = LocalSpotsDataProvider.nightLifeSpots,
                onClick = {}
            )
        }
    }
}