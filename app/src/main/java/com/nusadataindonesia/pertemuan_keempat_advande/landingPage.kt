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
import androidx.compose.ui.res.colorResource
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

    val listOrang = listOf(
        CardData(
            nama = stringResource(id = R.string.nama1),
            no = stringResource(id = R.string.no1),
            alamat = stringResource(id = R.string.alamat1),
            warna = colorResource(id = R.color.warna1),
            warnaNo = colorResource(id = R.color.warnaNo1),
            warnaAlamat = colorResource(id = R.color.warnaAlamat1)
        ),
        CardData(
            nama = stringResource(id = R.string.nama2),
            no = stringResource(id = R.string.no2),
            alamat = stringResource(id = R.string.alamat2),
            warna = colorResource(id = R.color.warna2),
            warnaNo = colorResource(id = R.color.warnaNo2),
            warnaAlamat = colorResource(id = R.color.warnaAlamat2)
        ),
        CardData(
            nama = stringResource(id = R.string.nama3),
            no = stringResource(id = R.string.no3),
            alamat = stringResource(id = R.string.alamat3),
            warna = colorResource(id = R.color.warna3),
            warnaNo = colorResource(id = R.color.warnaNo3),
            warnaAlamat = colorResource(id = R.color.warnaAlamat3)
        )
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
