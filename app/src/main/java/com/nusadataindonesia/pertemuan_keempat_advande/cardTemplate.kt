package com.nusadataindonesia.pertemuan_keempat_advande

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun templateCard(
    modifier: Modifier,
    nama: String,
    no: String,
    alamat: String,
    warna: Color,
    warnaNo: Color,
    warnaAlamat: Color
){
    Card(
        modifier=Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = warna,
            contentColor = Color.White
        ),
    ) {
        Row (
            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.logos),
                contentDescription = null,

            )
            Spacer(
                modifier= Modifier
                    .width(10.dp)
            )
            Column () {
                Text(
                    text = nama,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp
                )
                Text(
                    text = no,
                    fontSize = 20.sp,
                    color = warnaNo
                )
                Text(
                    text = alamat,
                    fontSize = 20.sp,
                    color = warnaAlamat
                )
            }
            Spacer(
                modifier= Modifier
                    .width(20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.logos),
                contentDescription = null
            )
        }
    }
}