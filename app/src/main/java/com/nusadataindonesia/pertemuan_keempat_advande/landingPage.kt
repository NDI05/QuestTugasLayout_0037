package com.nusadataindonesia.pertemuan_keempat_advande

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun landingPage(modifier: Modifier){
    Column() {
        templateCard(modifier = Modifier, nama = "nama", nim = "nim", alamat = "alamat", warna = Color.Black)
    }
}
