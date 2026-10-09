package com.example.tugas4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource

@Composable
fun ActPertama(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = dimensionResource(R.dimen.screen_padding_top),
                start = dimensionResource(R.dimen.screen_padding_horizontal),
                end = dimensionResource(R.dimen.screen_padding_horizontal)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}