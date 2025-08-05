package com.example.activity2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tataletak() {

    Column (
        modifier = Modifier.fillMaxWidth()
    ) {
        Header(nama = "Adam", address = "Jogja")
        Spacer(Modifier.height(20.dp))
        Section()
    }
}

@Composable
fun Section() {
    val editIcon = painterResource(R.drawable.edit)
    val editDesc = stringResource(R.string.edit)
    val warnaDesc = colorResource(R.color.merah)

    Column (
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Tentang kami!")
            Icon(
                painter = editIcon,
                contentDescription = editDesc,
                Modifier.size(20.dp)
            )
        }
        Card (
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.white_tulang)
            ),
            modifier = Modifier.fillMaxWidth().height(150.dp).padding(top = 10.dp)
        ) {
            Text(
                text = "The Bandung Institute of Technology is a public research university located in Bandung, Indonesia.",
                modifier = Modifier.padding(10.dp),
                color = warnaDesc,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Header(nama: String = "Tidak ada nama", address: String = "Di Bumi") {

    // Gambar
    val image = painterResource(id = R.drawable.itb)
    val imageModifier = Modifier.background(color = Color.Transparent)

    // Text
    val warnaNama = colorResource(R.color.purple_700)
    val warnaAddress = colorResource(id = R.color.purple_700)

    Box(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp)
            .background(color = Color.Cyan)
    ) {
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = image,
                contentDescription = "gambar kampus",
                modifier = imageModifier,
                contentScale = ContentScale.Crop
            )
            Column (
                modifier = Modifier.padding(10.dp)
            ) {
                Row (
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = "Name : ",
                        color = warnaNama,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = nama,
                        textDecoration = TextDecoration.Underline,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Row (
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Text(
                        text = "Address : ",
                        color = warnaAddress,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = address,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }
    }
}