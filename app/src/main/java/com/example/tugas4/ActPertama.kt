package com.example.tugas4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
        Text(
            text = stringResource(R.string.prodi),
            fontSize = dimensionResource(R.dimen.title_size).value.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_black)
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = dimensionResource(R.dimen.subtitle_size).value.sp,
            color = colorResource(R.color.text_black)
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.content_spacing)))

        CardMahasiswa(
            nama = R.string.nama_Asahi,
            telepon = null,
            alamat = R.string.alamat_asahi,
            warna = R.color.card_0_bg,
            warnaNama = R.color.text_white,
            warnaDetail = R.color.text_light_blue,
            namaCursive = true
        )

        CardMahasiswa(
            nama = R.string.nama_sekar,
            telepon = R.string.telepon_sekar,
            alamat = R.string.alamat_sekar,
            warna = R.color.card_1_bg,
            warnaNama = R.color.text_white,
            warnaDetail = R.color.text_cyan,
            warnaAlamat = R.color.text_yellow
        )

        CardMahasiswa(
            nama = R.string.nama_paji,
            telepon = R.string.telepon_paji,
            alamat = R.string.alamat_paji,
            warna = R.color.card_2_bg,
            warnaNama = R.color.text_white,
            warnaDetail = R.color.text_black,
            warnaAlamat = R.color.text_yellow
        )

        CardMahasiswa(
            nama = R.string.nama_salma,
            telepon = R.string.telepon_salma,
            alamat = R.string.alamat_salma,
            warna = R.color.card_3_bg,
            warnaNama = R.color.text_yellow,
            warnaDetail = R.color.text_white,
            warnaAlamat = R.color.text_black
        )
    }
}