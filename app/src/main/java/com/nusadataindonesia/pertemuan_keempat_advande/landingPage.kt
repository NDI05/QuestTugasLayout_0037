package com.nusadataindonesia.pertemuan_keempat_advande

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontFamily

data class CardData(
    val nama: String,
    val no: String,
    val alamat: String,
    val warna: Color,
    val warnaNo: Color,
    val warnaAlamat: Color
)

@Composable
fun landingPage(modifier: Modifier ){
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
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(vertical = 60.dp, horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column() {
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
        }
        LazyColumn(
            modifier=Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(Color.DarkGray)
                .padding(vertical = 16.dp, horizontal = 8.dp)
        ) {
            items(listOrang) { orang ->
                templateCard(
                    modifier = Modifier,
                    nama = orang.nama,
                    no = orang.no,
                    alamat = orang.alamat,
                    warna = orang.warna,
                    warnaNo = orang.warnaNo,
                    warnaAlamat = orang.warnaAlamat
                )
            }
        }
        Column() {
            Text(
                stringResource(id=R.string.copy),
                color = Color.Black,
                fontSize = 15.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Serif
            )
        }
    }
}
