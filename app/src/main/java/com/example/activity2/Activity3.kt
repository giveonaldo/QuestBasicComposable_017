package com.example.activity2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Activity3() {
    val bgColor = colorResource(R.color.bg_white)
    val text1 = stringResource(R.string.header_text)
    val text2 = stringResource(R.string.subHeader_text)
    val textColor1 = colorResource(R.color.black)

    val image1 = painterResource(R.drawable.abriadm)

    Column (modifier = Modifier
            .background(color = bgColor)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text1,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = textColor1
        )
        Text(
            text = text2,
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold
        )

        Row (
            modifier = Modifier.fillMaxWidth()
                .height(150.dp)
                .padding(top = 20.dp, start = 15.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = image1,
                contentDescription = "profile",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(120.dp)
                    .clip(CircleShape)
            )
            Column (
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Abriansyah Adam",
                    fontStyle = FontStyle.Italic,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 25.sp
                )

                Row {
                    Text(
                        text = "Tlpn : ",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = colorResource(R.color.black)
                    )
                    Text(
                        text = "+6282241937264",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = colorResource(R.color.purple_700)
                    )
                }
            }
        }
    }
}