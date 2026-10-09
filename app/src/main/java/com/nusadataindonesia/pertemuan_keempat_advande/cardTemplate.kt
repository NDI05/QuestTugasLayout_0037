package com.nusadataindonesia.pertemuan_keempat_advande

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun templateCard(modifier: Modifier, nama: String, nim: String, alamat: String, warna: Color){
    Card(
        modifier=Modifier
            .padding(16.dp)
            .fillMaxWidth(1f),
        colors = CardDefaults.cardColors(
            containerColor = warna,
            contentColor = Color.White
        ),
    ) {
        Row (
            modifier = Modifier
                .padding(all = 10.dp),

        ){
            Image(
                painter = painterResource(id = R.drawable.logos),
                contentDescription = null,

            )
            Column () {
                Text(
                    text = nama,
                )
                Text(
                    text = nim,
                )
                Text(
                    text = alamat,
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logos),
                contentDescription = null
            )
        }
    }
}