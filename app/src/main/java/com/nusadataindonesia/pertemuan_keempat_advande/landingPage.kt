package com.nusadataindonesia.pertemuan_keempat_advande

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun landingPage(modifier: Modifier ){
    data class CardData(
        val nama: String,
        val no: String,
        val alamat: String,
        val warna: Color,
        val warnaNo: Color,
        val warnaAlamat: Color
    )


    Column(
        modifier=Modifier
            .fillMaxWidth()
            .padding(vertical = 120.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(id=R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Black
        )
        Text(
            stringResource(id=R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Black
        )
        templateCard(
            modifier = Modifier,
            nama = "nama",
            no = "no",
            alamat = "alamat",
            warna = Color.Black,
            warnaNo = Color.White,
            warnaAlamat = Color.White
        )
    }
}
