package at.vinatzer.viennaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import at.vinatzer.viennaapp.R
import at.vinatzer.viennaapp.ui.theme.ViennaAppTheme

@Composable
fun SpotScreen(
    name: String,
    imageId: Int,
    descriptionId: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.padding(4.dp)
    ) {
        Text(
            text = name,
            modifier = Modifier
                .padding(8.dp)
        )
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(id = descriptionId),
            Modifier.padding(8.dp)
        )
    }
}

@Preview
@Composable
fun SpotScreenPreview() {
    ViennaAppTheme() {
        Surface() {
            SpotScreen(
                name = "U4",
                imageId = R.drawable.u4,
                descriptionId = R.string.u4_description
            )
        }
    }
}