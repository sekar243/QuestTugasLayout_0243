package com.example.tugas4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun CardMahasiswa(
    nama: Int,
    telepon: Int,
    alamat: Int,
    warna: Int,
    warnaNama: Int,
    warnaDetail: Int,
    warnaAlamat: Int = warnaDetail,
    namaCursive: Boolean = false
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                bottom = dimensionResource(R.dimen.card_spacing)
            )
            .height(dimensionResource(R.dimen.card_height)),
        shape = RoundedCornerShape(
            dimensionResource(R.dimen.card_radius)
        ),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    dimensionResource(R.dimen.card_content_padding)
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(
                    R.string.logo_description
                ),
                modifier = Modifier.size(
                    dimensionResource(R.dimen.logo_size)
                )
            )
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) { }
        }
    }
}