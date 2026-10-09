package com.nusadataindonesia.pertemuan_keempat_advande

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nusadataindonesia.pertemuan_keempat_advande.ui.theme.Pertemuan_keempat_advandeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan_keempat_advandeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    landingPage(
                        modifier = Modifier
                            .padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}
