package com.example.activity2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
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
    }
}