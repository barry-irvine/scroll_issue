package com.example.scrollissue.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@ExperimentalPagerApi
@Composable
fun MyPager(pagerState: PagerState, scrollPosition: Int, pagerHeight: Dp) {
    val colors = listOf(Color.Red, Color.Magenta, Color.Blue)
    Box {
        HorizontalPager(
            state = pagerState,
            count = colors.size
        ) { page ->
            Card(
                backgroundColor = colors[page],
                modifier = Modifier
                    .height(pagerHeight)
                    .fillMaxWidth()
                    .graphicsLayer {
                        translationY = -scrollPosition.toFloat()
                    }) {
                Text("Page $page", Modifier.padding(16.dp), color = MaterialTheme.colors.onPrimary, textAlign = TextAlign.Center)
            }
        }
    }
}
