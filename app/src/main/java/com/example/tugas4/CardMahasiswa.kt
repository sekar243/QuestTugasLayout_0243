package com.example.tugas4

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource

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
    ) { }
}