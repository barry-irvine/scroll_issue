package com.example.scrollissue.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ScrollableContent(message: String) {
    Text(
        message,
        Modifier
            .height(200.dp)
            .background(Color.Cyan)
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.subtitle1
    )
    Text(
        "",
        Modifier
            .height(400.dp)
            .background(Color.White)
            .fillMaxWidth()
    )
    Text(
        "",
        Modifier
            .height(600.dp)
            .background(Color.LightGray)
            .fillMaxWidth()
    )
}
